package com.ebell495.usdaconnector;

// TODO: Auto-generated Javadoc
/**
 * The Class Measure.
 */
public class Measure 
{
	
	/** The label. */
	private String label;
	
	/** The eqv. */
	private double eqv;
	
	/** The eunit. */
	private String eunit;
	
	/** The qty. */
	private double qty;
	
	/** The value. */
	private double value;
	
	/**
	 * Instantiates a new measure.
	 *
	 * @param label the label
	 * @param equ the equ
	 * @param eunit the eunit
	 * @param qty the qty
	 * @param value the value
	 */
	public Measure(String label, double equ, String eunit, double qty, double value)
	{
		this.label = label;
		this.eqv = equ;
		this.eunit = eunit;
		this.qty = qty;
		this.value = value;
	}

	/**
	 * Gets the name of the measure, e.g. "large" or "CONTAINER".
	 *
	 * @return the label
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Gets the equivalent of the measure expressed as an eunit.
	 *
	 * @return the measurement
	 */
	public double getEqv()
	{
		return eqv;
	}

	/**
	 * Gets the unit in with the equivalent amount is expressed. Usually either gram (g) or milliliter (ml).
	 *
	 * @return the unit or null if the unit is unrecognized
	 */
	public Unit getEunit()
	{
		if(eunit.toLowerCase().equals("g"))
			return Unit.GRAM;
		else if(eunit.toLowerCase().equals("ml"))
			return Unit.MILLILITER;
		
		return null;
	}

	/**
	 * Gets the number of the equivalent units that the value corresponds with, e.g. a value of 2.0 would mean the value is for 2 times the number of units.
	 * This is usually 1.0 though and the USDA API documentation does not make reference to a qty.
	 *
	 * @return the qty
	 */
	public double getQty()
	{
		return qty;
	}

	/**
	 * Gets the eunit equivalent value of the measure.
	 *
	 * @return the value
	 */
	public double getValue()
	{
		return value;
	}

	/**
	 * Sets the label.
	 *
	 * @param label the new label
	 */
	void setLabel(String label)
	{
		this.label = label;
	}

	/**
	 * Sets the eqv.
	 *
	 * @param equ the new eqv
	 */
	void setEqv(double equ)
	{
		this.eqv = equ;
	}

	/**
	 * Sets the eunit.
	 *
	 * @param eunit the new eunit
	 */
	void setEunit(String eunit)
	{
		this.eunit = eunit;
	}

	/**
	 * Sets the qty.
	 *
	 * @param qty the new qty
	 */
	void setQty(double qty)
	{
		this.qty = qty;
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
	 * To string.
	 *
	 * @return the string
	 */
	public String toString()
	{
		return "Measure: " + this.label + " " + this.eqv + this.getEunit() + " " + this.value;
	}
}
