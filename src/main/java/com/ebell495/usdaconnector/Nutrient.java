package com.ebell495.usdaconnector;

// TODO: Auto-generated Javadoc
/**
 * The Class Nutrient.
 * A Nutrient 
 */
public class Nutrient
{
	
	/** The nutrient id. */
	private int nutrient_id;
	
	/** The name. */
	private String name;
	
	/** The sourcecode. */
	private int[] sourcecode;
	
	/** The derivation. */
	private String derivation;
	
	/** The unit. */
	private String unit;
	
	/** The value. */
	private double value;
	
	/** The dp. */
	private int dp;
	
	/** The se. */
	private double se;
	
	/** The group. */
	private String group;
	
	/** The measures. */
	private Measure[] measures;

	/**
	 * Gets the nutrient number (nutrient_no) for the nutrient.
	 *
	 * @return the nutrient id
	 */
	public int getNutrient_id()
	{
		return nutrient_id;
	}

	/**
	 * Gets the nutrient name.
	 *
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Gets the list of source id's in the sources list referenced for this nutrient.
	 *
	 * @return the sourcecode
	 */
	public int[] getSourcecode()
	{
		return sourcecode;
	}

	/**
	 * Gets the indicator of how the value was derived.
	 *
	 * @return the derivation
	 */
	public String getDerivation()
	{
		return derivation;
	}

	/**
	 * Gets the unit of measure for this nutrient e.g. g(gram), ml(milliter), kcal(Calorie).
	 *
	 * @return the unit
	 */
	public String getUnit()
	{
		return unit;
	}

	/**
	 * Gets the 100 g equivalent value of the nutrient. 
	 *
	 * @return the value
	 */
	public double getValue()
	{
		return value;
	}

	/**
	 * Gets the number of data points.
	 *
	 * @return the dp
	 */
	public int getDp()
	{
		return dp;
	}

	/**
	 * Gets the standard error.
	 *
	 * @return the se
	 */
	public double getSe()
	{
		return se;
	}

	/**
	 * Gets the group of the nutrient such as Vitamin, Mineral, Proximate.
	 *
	 * @return the group
	 */
	public String getGroup()
	{
		return group;
	}

	/**
	 * Gets the other values for the nutrient based on different measures. The measure object will have a conversion factor with it.
	 *
	 * @return the measures
	 */
	public Measure[] getMeasures()
	{
		return measures;
	}

	/**
	 * Sets the nutrient id.
	 *
	 * @param nutrient_id the new nutrient id
	 */
	void setNutrient_id(int nutrient_id)
	{
		this.nutrient_id = nutrient_id;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Sets the sourcecode.
	 *
	 * @param sourcecode the new sourcecode
	 */
	void setSourcecode(int[] sourcecode)
	{
		this.sourcecode = sourcecode;
	}

	/**
	 * Sets the derivation.
	 *
	 * @param derivation the new derivation
	 */
	void setDerivation(String derivation)
	{
		this.derivation = derivation;
	}

	/**
	 * Sets the unit.
	 *
	 * @param unit the new unit
	 */
	void setUnit(String unit)
	{
		this.unit = unit;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the new value
	 */
	void setValue(double value)
	{
		this.value = value;
	}

	/**
	 * Sets the dp.
	 *
	 * @param dp the new dp
	 */
	void setDp(int dp)
	{
		this.dp = dp;
	}

	/**
	 * Sets the se.
	 *
	 * @param se the new se
	 */
	void setSe(double se)
	{
		this.se = se;
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
	 * Sets the measures.
	 *
	 * @param measures the new measures
	 */
	void setMeasures(Measure[] measures)
	{
		this.measures = measures;
	}
}
