package com.ebell495.usdaconnector;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;


// TODO: Auto-generated Javadoc
/**
 * The Class USDAConnectorTest.
 */
public class USDAConnectorTest
{	
	/**
	 * Food report test.
	 */
	@Test
	public void foodReportTest()
	{
		USDAConnector.initConnector("DEMO_KEY");	//Replace DEMO_KEY with the key you would like to test with
		FoodReport f = USDAConnector.getFoodReport("01009");
		
		assertEquals(f.getReleaseVersion(), "1");
		assertEquals(f.getNdbno(), "01009");
		assertEquals(f.getName(), "Cheese, cheddar (Includes foods for USDA's Food Distribution Program)");
		assertEquals(f.getDatabaseSource(), "Standard Reference");
		assertEquals(f.getReportingUnit(), Unit.GRAM);
		
		assertEquals(f.getAllNutrients()[5].getNutrient_id(), 207);
		assertEquals(f.getAllNutrients()[0].getValue(), 36.75, 0.01f);
		assertEquals(f.getAllNutrients()[3].getDp(), 39);
		assertEquals(f.getAllNutrients()[1].getName(), "Energy");
		assertEquals(f.getAllNutrients()[2].getMeasures()[2].getEqv(), 113.0, 0.01f);
		
		assertEquals(f.getNutrient(318).getUnit(), Unit.IU);
		assertEquals(f.getNutrient("carotene, beta").getUnit(), Unit.MICROGRAM);
		
		f = USDAConnector.getFoodReport("1009");
		assertEquals(f, null);
	}
	
	/**
	 * Commercial food report test.
	 */
	@Test
	public void commercialFoodReportTest()
	{
		USDAConnector.initConnector("DEMO_KEY");	//Replace DEMO_KEY with the key you would like to test with
		FoodReport f = USDAConnector.getFoodReport("45344323");
		
		assertEquals(f.getReleaseVersion(), "July, 2018");
		assertEquals(f.getNdbno(), "45344323");
		assertEquals(f.getName(), "GREEK YOGURT, UPC: 085239010556");
		assertEquals(f.getDatabaseSource(), "Label Insight");
		assertEquals(f.getManufacturer(), "Target Stores");
		
		assertEquals(f.getIngredients(), "CULTURED PASTEURIZED NONFAT GRADE A MILK, SUGAR, STRAWBERRIES, BANANAS, CORN STARCH, NATURAL FLAVORS, CITRIC ACID, PECTIN, VEGETABLE JUICE (COLOR).");
		
		assertEquals(f.getAllNutrients()[5].getNutrient_id(), 269);
		assertEquals(f.getAllNutrients()[0].getValue(), 80, 0.01f);
		assertEquals(f.getAllNutrients()[3].getDp(), 0);
		assertEquals(f.getAllNutrients()[1].getName(), "Protein");
		assertEquals(f.getAllNutrients()[2].getMeasures()[0].getEqv(), 150.0, 0.01f);
	}
	
	/**
	 * Food search test.
	 */
	@Test
	public void foodSearchTest()
	{
		USDAConnector.initConnector("DEMO_KEY");	//Replace DEMO_KEY with the key you would like to test with
		SearchReport st = USDAConnector.getSearchReport("butter");
		
		assertEquals(st.getSearchTerms(), "butter");
		assertEquals(st.getReleaseVersion(), 1);
		assertEquals(st.getStart(), 0);
		assertEquals(st.getEnd(), 50);
		
		assertEquals(st.getSort(), "r");
		
		
		ArrayList<SearchItem> items = st.getItem();
		
		assertEquals(items.size(), 50);
		assertEquals(items.get(0).getOffset(), 0);
		assertEquals(items.get(1).getNdbno(), "04585");
		assertEquals(items.get(2).getName(), "Croissants, butter");
	}

}
