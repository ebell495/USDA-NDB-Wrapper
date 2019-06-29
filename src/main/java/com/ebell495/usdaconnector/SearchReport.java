package com.ebell495.usdaconnector;

import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class SearchReport.
 */
public class SearchReport 
{
	
	/** The q. */
	private String q;
	
	/** The sr. */
	private int sr;
	
	/** The ds. */
	private String ds;
	
	/** The start. */
	private int start;
	
	/** The end. */
	private int end;
	
	/** The total. */
	private int total;
	
	/** The group. */
	private String group;
	
	/** The sort. */
	private String sort;
	
	/** The item. */
	private ArrayList<SearchItem> item;


	/**
	 * Gets the terms requested and used in the search
	 *
	 * @return the search terms
	 */
	public String getSearchTerms()
	{
		return q;
	}

	/**
	 * Gets the standard Release version of the data being reported
	 *
	 * @return the release version
	 */
	public int getReleaseVersion()
	{
		return sr;
	}

	/**
	 * Gets the data source: BL=Branded Food Products or SR=Standard Release
	 *
	 * @return the data source
	 */
	public String getDataSource()
	{
		return ds;
	}

	/**
	 * Gets the start which is the beginning item in the list.
	 *
	 * @return the start
	 */
	public int getStart()
	{
		return start;
	}

	/**
	 * Gets the end which is the last item in the list.
	 *
	 * @return the end
	 */
	public int getEnd()
	{
		return end;
	}

	/**
	 * Gets the total number of items returned by the search.
	 *
	 * @return the total
	 */
	public int getTotal()
	{
		return total;
	}

	/**
	 * Gets the food group filter.
	 *
	 * @return the group
	 */
	public String getGroup()
	{
		return group;
	}

	/**
	 * Gets the requested sort order (r=relevance or n=name).
	 *
	 * @return the sort
	 */
	public String getSort()
	{
		return sort;
	}

	/**
	 * Gets all of the items returned from the search.
	 *
	 * @return the item
	 */
	public ArrayList<SearchItem> getItem()
	{
		return item;
	}

	/**
	 * Sets the q.
	 *
	 * @param q the new q
	 */
	void setQ(String q)
	{
		this.q = q;
	}

	/**
	 * Sets the sr.
	 *
	 * @param sr the new sr
	 */
	void setSr(int sr)
	{
		this.sr = sr;
	}

	/**
	 * Sets the ds.
	 *
	 * @param ds the new ds
	 */
	void setDs(String ds)
	{
		this.ds = ds;
	}

	/**
	 * Sets the start.
	 *
	 * @param start the new start
	 */
	void setStart(int start)
	{
		this.start = start;
	}

	/**
	 * Sets the end.
	 *
	 * @param end the new end
	 */
	void setEnd(int end)
	{
		this.end = end;
	}

	/**
	 * Sets the total.
	 *
	 * @param total the new total
	 */
	void setTotal(int total)
	{
		this.total = total;
	}

	/**
	 * Sets the group.
	 *
	 * @param group the new group
	 */
	void setGroup(String group)
	{
		this.group = group;
	}

	/**
	 * Sets the sort.
	 *
	 * @param sort the new sort
	 */
	void setSort(String sort)
	{
		this.sort = sort;
	}

	/**
	 * Sets the item.
	 *
	 * @param item the new item
	 */
	void setItem(ArrayList<SearchItem> item)
	{
		this.item = item;
	}
	
	
	
}
