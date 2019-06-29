package com.ebell495.usdaconnector;

// TODO: Auto-generated Javadoc
/**
 * The Class SearchItem.
 */
public class SearchItem
{
	
	/** The offset. */
	private int offset;
	
	/** The group. */
	private String group;
	
	/** The name. */
	private String name;
	
	/** The ndbno. */
	private String ndbno;
	
	/** The ds. */
	private String ds;
	
	/** The manu. */
	private String manu;
	
	/**
	 * Gets the beginning offset into the results list for the items in the list requested.
	 *
	 * @return the offset
	 */
	public int getOffset()
	{
		return offset;
	}
	
	/**
	 * Gets the food group to which the food belongs.
	 *
	 * @return the group
	 */
	public String getGroup()
	{
		return group;
	}
	
	/**
	 * Gets the the food’s name.
	 *
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Gets the food’s NDB Number
	 *
	 * @return the ndbno
	 */
	public String getNdbno()
	{
		return ndbno;
	}
	
	/**
	 * Gets the data source: BL=Branded Food Products or SR=Standard Release.
	 *
	 * @return the ds
	 */
	public String getDataSource()
	{
		return ds;
	}
	
	/**
	 * Gets the foods manufacturer.
	 *
	 * @return the manu
	 */
	public String getManufacturer()
	{
		return manu;
	}
	
	/**
	 * Sets the offset.
	 *
	 * @param offset the new offset
	 */
	void setOffset(int offset)
	{
		this.offset = offset;
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
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Sets the ndbno.
	 *
	 * @param ndbno the new ndbno
	 */
	void setNdbno(String ndbno)
	{
		this.ndbno = ndbno;
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
	 * Sets the manu.
	 *
	 * @param manu the new manu
	 */
	void setManu(String manu)
	{
		this.manu = manu;
	}
	
	
}
