package com.ebell495.usdaconnector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

// TODO: Auto-generated Javadoc
/**
 * The Class USDAConnector.
 * The basic connector/factory for getting data from the USDA API
 */
public class USDAConnector 
{
	
	/** The Constant DATA_SEARCH_URL. 
	 * 	The URL to make searches
	 */
	public static final String DATA_SEARCH_URL = "https://api.nal.usda.gov/ndb/search/"; // Prepended URL to send requests to
	
	/** The Constant FOOD_REPORT_URL. 
	 * 	The URL to get Food Reports
	 */
	public static final String FOOD_REPORT_URL = "https://api.nal.usda.gov/ndb/V2/reports"; // Prepended URL to send requests to
	
	/** The Constant NUTRIENT_REPORT_URL. 
	 * 	The URL to get nutrient reports
	 */
	public static final String NUTRIENT_REPORT_URL = "http://api.nal.usda.gov/ndb/reports";
	
	/** The Constant LIST_URL. 
	 *  The URL to get a list of items from the USDA API.
	 */
	public static final String LIST_URL = "http://api.nal.usda.gov/ndb/list";
	
	/** The apikey. */
	private static String apikey = "";
	
	/** The rate limit remaining. */
	private static int rateLimitRemaining = 0;
	
	/** The rate limit. */
	private static boolean rateLimit = true;
	
	/** The last request time. */
	private static long lastRequestTime = -1;
	
	/** The first hour request time. */
	private static long firstHourRequestTime = -1;
	
	/**
	 * Sets up the API connector with the API key that is provided. 
	 * The connector will automatically rate limit requests as to not go over the standard limit of 3600 requests an hour.
	 *
	 * @param apikey The API key from data.gov that the connector should use for the requests
	 */
	public static void initConnector(String apikey)
	{
		USDAConnector.apikey = apikey;
		rateLimitRemaining = 3600;
	} 
	
	/**
	 * Sets up the API connector with the API key that is provided. 
	 *
	 * @param apikey The API key from data.gov that the connector should use for the requests
	 * @param rateLimit True to allow rate limiting or false to disable it.
	 */
	public static void initConnector(String apikey, boolean rateLimit)
	{
		initConnector(apikey);
		USDAConnector.rateLimit = rateLimit;
	}
	
	/**
	 * Gets a FoodReport object with information from a 'full' report from the USDA NDB API.
	 *
	 * @param NDBNO the ndbno of the food to get the report on. Note, the string will need 0's before the number if the number is less than 5 digits.
	 * @return A FoodReport object that holds all of the data from the report or null if the NDBNO does not exist
	 */
	public static FoodReport getFoodReport(String NDBNO)
	{
		String url = FOOD_REPORT_URL + "?ndbno=" + NDBNO + "&type=f" + "&api_key=" + apikey;
		String jsonReport = getJSONPage(url);
		
		if(jsonReport.equals(""))
		{
			return null;
		}
		
		FoodReport ret = new FoodReport();
		
		JsonParser jp = new JsonParser();
		
		if(jp.parse(jsonReport).getAsJsonObject().get("notfound").getAsJsonPrimitive().getAsInt() != 0)
			return null;
		
		//Skips to the start of the foodreport
		JsonObject rootFood = jp.parse(jsonReport).getAsJsonObject().get("foods").getAsJsonArray().get(0).getAsJsonObject().get("food").getAsJsonObject();
		
		ret.setSr(rootFood.get("sr").getAsString());
		ret.setType(rootFood.get("type").getAsString());
		
		if(rootFood.has("desc"))
		{
			JsonObject foodDescription = rootFood.get("desc").getAsJsonObject();
			
			for(String s : foodDescription.keySet())
			{
				try
				{
					Field f = ret.getClass().getDeclaredField(s);
					f.setAccessible(true);
					if(f.getType().equals(String.class))
					{
						f.set(ret, foodDescription.get(s).getAsJsonPrimitive().getAsString());
					}
					else if(f.getType().equals(double.class))
					{
						f.set(ret, foodDescription.get(s).getAsJsonPrimitive().getAsDouble());
					}
				}
				catch(NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e)
				{
				}
			}
		}
		
		if(rootFood.has("nutrients"))
		{
			JsonArray foodNutrients = rootFood.get("nutrients").getAsJsonArray();
			
			ret.setAllNutrients(new Nutrient[foodNutrients.size()]);
			
			for(int i = 0; i < foodNutrients.size(); i++)
			{
				JsonObject cNutrient = foodNutrients.get(i).getAsJsonObject();
				ret.getAllNutrients()[i] = new Nutrient();
				
				for(String s : cNutrient.keySet())
				{
					try
					{
						Field f = Nutrient.class.getDeclaredField(s);
						f.setAccessible(true);
						if(f.getType().equals(String.class))
						{
							f.set(ret.getAllNutrients()[i], cNutrient.get(s).getAsJsonPrimitive().getAsString());
						}
						else if(f.getType().equals(double.class))
						{
							f.set(ret.getAllNutrients()[i], cNutrient.get(s).getAsJsonPrimitive().getAsDouble());
						}
						else if(f.getType().equals(int.class))
						{
							f.set(ret.getAllNutrients()[i], cNutrient.get(s).getAsJsonPrimitive().getAsInt());
						}
						else if(s.equals("sourcecode"))
						{
							//If there are no sources for the report, then GSON sees the blank array as not a JSON array and will throw the exception
							//In that case, then the sources get set to an empty array
							try
							{
								int[] sources = new int[cNutrient.get(s).getAsJsonArray().size()];
								for(int k = 0; k < sources.length; k++)
								{
									sources[k] = cNutrient.get(s).getAsJsonArray().get(k).getAsJsonPrimitive().getAsInt();
								}
								
								ret.getAllNutrients()[i].setSourcecode(sources);
							}
							catch(IllegalStateException e)
							{
								ret.getAllNutrients()[i].setSourcecode(new int[0]);
							}
						}
						else if(s.equals("measures"))
						{
							Gson g = new Gson();
							ret.getAllNutrients()[i].setMeasures(new Measure[cNutrient.get(s).getAsJsonArray().size()]);
							for(int j = 0; j < cNutrient.get(s).getAsJsonArray().size(); j++)
							{
								ret.getAllNutrients()[i].getMeasures()[j] = g.fromJson(cNutrient.get(s).getAsJsonArray().get(j), Measure.class);
							}
						}
					}
					catch(NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException  e)
					{
					}
				}
			}
		}
		
		if(rootFood.has("sources"))
		{
			JsonArray foodSources = rootFood.get("sources").getAsJsonArray();
			
			ret.setSources(new String[foodSources.size()]);
			
			for(int i = 0; i < foodSources.size(); i++)
			{
				ret.getSources()[i] = foodSources.get(i).toString();
			}
		}
		
		
		if(rootFood.has("ing"))
		{
			JsonObject ingredients = rootFood.get("ing").getAsJsonObject();
			
			ret.setIngDesc(ingredients.get("desc").getAsJsonPrimitive().getAsString());
			ret.setIngUpd(ingredients.get("upd").getAsJsonPrimitive().getAsString());
		}
		
		return ret;
	}
	
	
	/**
	 * Gets a SearchReport based on the search terms provided. This searches for a maximum of 50 items, sorts them by search relevance and only searches the standard reference database, not the branded food items.
	 *
	 * @param searchTerms the search terms to search with
	 * @return the search report
	 */
	public static SearchReport getSearchReport(String searchTerms)
	{
		return getSearchReport(searchTerms, false, 50, false);
	}
	
	/**
	 * Gets a SearchReport based on the search terms provided. This searches for a maximum of 50 items and only searches the standard reference database, not the branded food items.
	 * The parameter sortType changes how the results are sorted, either by relevance(false) or by name(true).
	 *
	 * @param searchTerms the search terms to search with
	 * @param sortType True, to sort by name, false to sort by relevance
	 * @return the search report
	 */
	public static SearchReport getSearchReport(String searchTerms, boolean sortType)
	{
		return getSearchReport(searchTerms, sortType, 50, false);
	}
	
	/**
	 * Gets a SearchReport based on the search terms provided. This searches only the standard reference database, not the branded food items.
	 * The parameter sortType changes how the results are sorted, either by relevance(false) or by name(true).Gets the search report.
	 * The parameter maxResults changes how many results will be returned by the search, up to a maximum of 50.
	 *
	 * @param searchTerms the search terms to search with
	 * @param sortType True, to sort by name, false to sort by relevance
	 * @param maxResults the maximum number of results to be returned
	 * @return the search report
	 */
	public static SearchReport getSearchReport(String searchTerms, boolean sortType, int maxResults)
	{
		return getSearchReport(searchTerms, sortType, maxResults, false);
	}
	
	/**
	 * Gets a SearchReport based on all of the parameters provided.
	 * The parameter sortType changes how the results are sorted, either by relevance(false) or by name(true).Gets the search report.
	 * The parameter maxResults changes how many results will be returned by the search, up to a maximum of 50.
	 * The parameter dataSource changes the source database to search, with either the standard food reference(false), or branded food items(true). 
	 * 
	 * @param searchTerms the search terms to search with
	 * @param sortType True, to sort by name, false to sort by relevance
	 * @param maxResults the maximum number of results to be returned
	 * @param dataSource True, to search the branded food items database, false to search the standard food reference database.
	 * @return the search report
	 */
	public static SearchReport getSearchReport(String searchTerms, boolean sortType, int maxResults, boolean dataSource)
	{
		String url = DATA_SEARCH_URL + "?q=" + searchTerms + 
									   "&sort=" + (sortType ? "n" : "r") + 
									   "&max=" + maxResults + 
									   "&ds=" + (dataSource ? "Branded%20Food%20Products" : "Standard%20Reference") + 
									   "&api_key=" + apikey;
		
		String jsonReport = getJSONPage(url);
		
		if(jsonReport.equals(""))
		{
			return null;
		}
		
		JsonParser jp = new JsonParser();
		
		SearchReport sr = new SearchReport();
		
		JsonObject listRoot = jp.parse(jsonReport).getAsJsonObject().get("list").getAsJsonObject();
		
		sr.setQ(listRoot.get("q").getAsJsonPrimitive().getAsString());
		sr.setSr(listRoot.get("sr").getAsJsonPrimitive().getAsInt());
		sr.setDs(listRoot.get("ds").getAsJsonPrimitive().getAsString());
		sr.setStart(listRoot.get("start").getAsJsonPrimitive().getAsInt());
		sr.setEnd(listRoot.get("end").getAsJsonPrimitive().getAsInt());
		sr.setTotal(listRoot.get("total").getAsJsonPrimitive().getAsInt());
		sr.setGroup(listRoot.get("group").getAsJsonPrimitive().getAsString());
		sr.setSort(listRoot.get("sort").getAsJsonPrimitive().getAsString());
		
		JsonArray listItems = listRoot.get("item").getAsJsonArray();
		
		sr.setItem(new ArrayList<SearchItem>());
		
		Gson g = new Gson();
		
		for(int i = 0; i < listItems.size(); i++)
		{
			SearchItem s = g.fromJson(listItems.get(i), SearchItem.class);
			sr.getItem().add(s);
		}
		
		return sr;
	}
	
	/**
	 * Get a FoodReport from an item returned from a search.
	 *
	 * @param si the SearchItem with which to get the foodreport from
	 * @return the report from search
	 */
	public static FoodReport getReportFromSearch(SearchItem si)
	{
		return getFoodReport(si.getNdbno());
	}
	
	
	/**
	 * Gets the JSON representation of an API request.
	 *
	 * @param url the url of the API request
	 * @return the String output from the request
	 */
	private static String getJSONPage(String url)
	{
//		System.out.println(rateLimitRemaining*1000 + " " + (lastRequestTime - firstHourRequestTime));
		
		if(rateLimit && rateLimitRemaining*1000 < (lastRequestTime - firstHourRequestTime))
		{
			try
			{
				Thread.sleep(System.currentTimeMillis() - lastRequestTime);
			}
			catch(InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		StringBuilder ret = new StringBuilder();
		URL pageURL = null;
		
		try
		{
			pageURL = new URL(url);
		}
		catch(MalformedURLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try
		{
			HttpURLConnection connection = (HttpURLConnection) pageURL.openConnection();
			connection.setRequestMethod("GET");
			
			lastRequestTime = System.currentTimeMillis();
			
			try
			{
				int oldRateLimit = rateLimitRemaining;
				rateLimitRemaining = Integer.parseInt(connection.getHeaderField("X-RateLimit-Remaining"));
				
				if(oldRateLimit < rateLimitRemaining || firstHourRequestTime < 0)
				{
					firstHourRequestTime = System.currentTimeMillis();
				}
			}
			catch(Exception e)
			{
				//Ignore for now
			}
			
			BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			
			String line;
			while((line = rd.readLine()) != null)
			{
				ret.append(line);
			}
			rd.close();
		}
		catch(IOException e)
		{
			System.err.println("Exception " + e);
			return "";
		}
		
		
		
		return ret.toString();
	}
}
