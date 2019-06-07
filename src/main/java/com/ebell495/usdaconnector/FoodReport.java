package com.ebell495.usdaconnector;

// TODO: Auto-generated Javadoc
/**
 * The Class FoodReport.
 */
public class FoodReport 
{
	
	/** The type. */
	private String type;
	
	/** The sr. */
	private String sr;
	
	/** The ndbno. */
	private String ndbno;
	
	/** The name. */
	private String name;
	
	/** The sd. */
	private String sd;
	
	/** The fg. */
	private String fg;
	
	/** The sn. */
	private String sn;
	
	/** The cn. */
	private String cn;
	
	/** The manu. */
	private String manu;
	
	/** The nf. */
	private double nf;
	
	/** The cf. */
	private double cf;
	
	/** The ff. */
	private double ff; 
	
	/** The pf. */
	private double pf;
	
	/** The r. */
	private double r;
	
	/** The rd. */
	private String rd;
	
	/** The ds. */
	private String ds;
	
	/** The ru. */
	private String ru;
	
	/** The ing desc. */
	private String ingDesc;
	
	/** The ing upd. */
	private String ingUpd;
	
	/** The nutrients. */
	private Nutrient[] nutrients;
	
	/** The sources. */
	private String[] sources;
	
	/**
	 * Instantiates a new food report with NULL values. Not recommend to initialize a FoodReport, instead use the USDAConnector to get a FoodReport with data filled in from the USDA database.
	 */
	FoodReport()
	{
		this(null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, null, null, null, null, null, null, null);
	}

	/**
	 * Instantiates a new food report.
	 *
	 * @param type the type
	 * @param sr the sr
	 * @param ndbno the ndbno
	 * @param name the name
	 * @param sd the sd
	 * @param group the group
	 * @param sn the sn
	 * @param cn the cn
	 * @param manu the manu
	 * @param nf the nf
	 * @param cf the cf
	 * @param ff the ff
	 * @param pf the pf
	 * @param f the f
	 * @param rd the rd
	 * @param ds the ds
	 * @param ru the ru
	 * @param ingDesc the ing desc
	 * @param intUpd the int upd
	 * @param nutrients the nutrients
	 * @param sources the sources
	 */
	FoodReport(String type, String sr, String ndbno, String name, String sd, String group, String sn, String cn, String manu, double nf, double cf, double ff, double pf, double f, String rd, String ds, String ru, String ingDesc,
			String intUpd, Nutrient[] nutrients, String[] sources)
	{
		this.type = type;
		this.sr = sr;
		this.ndbno = ndbno;
		this.name = name;
		this.sd = sd;
		this.fg = group;
		this.sn = sn;
		this.cn = cn;
		this.manu = manu;
		this.nf = nf;
		this.cf = cf;
		this.ff = ff;
		this.pf = pf;
		this.r = f;
		this.rd = rd;
		this.ds = ds;
		this.ru = ru;
		this.ingDesc = ingDesc;
		this.ingUpd = intUpd;
		this.nutrients = nutrients;
		this.sources = sources;
	}

	/**
	 * Gets the report type. Either b(Basic), f(Full), s(Statistical). The connector will request a full report but in certain cases a basic report is the only report availible.
	 *
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * Gets the release version of the data being reported version.
	 *
	 * @return the release version
	 */
	public String getReleaseVersion()
	{
		return sr;
	}

	/**
	 * Gets the NDB food number.
	 *
	 * @return the ndbno
	 */
	public String getNdbno()
	{
		return ndbno;
	}

	/**
	 * Gets the food name.
	 *
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Gets the description of the food.
	 *
	 * @return the description
	 */
	public String getDescription()
	{
		return sd;
	}

	/**
	 * Gets the food group.
	 *
	 * @return the food group
	 */
	public String getFoodGroup()
	{
		return fg;
	}

	/**
	 * Gets the scientific name.
	 *
	 * @return the scientific name
	 */
	public String getScientificName()
	{
		return sn;
	}

	/**
	 * Gets the commercial name.
	 *
	 * @return the commercial name
	 */
	public String getCommercialName()
	{
		return cn;
	}

	/**
	 * Gets the manufacturer.
	 *
	 * @return the manufacturer
	 */
	public String getManufacturer()
	{
		return manu;
	}

	/**
	 * Gets the nitrogen to protein conversion factor.
	 *
	 * @return the nitrogen to protein factor
	 */
	public double getNitrogenToProteinFactor()
	{
		return nf;
	}

	/**
	 * Gets the carbohydrate factor.
	 *
	 * @return the carbohydrate factor
	 */
	public double getCarbohydrateFactor()
	{
		return cf;
	}

	/**
	 * Gets the fat factor.
	 *
	 * @return the fat factor
	 */
	public double getFatFactor()
	{
		return ff;
	}

	/**
	 * Gets the protein factor.
	 *
	 * @return the protein factor
	 */
	public double getProteinFactor()
	{
		return pf;
	}

	/**
	 * Gets the refuse percentage.
	 *
	 * @return the refuse factor
	 */
	public double getRefuseFactor()
	{
		return r;
	}

	/**
	 * Gets the refuse description.
	 *
	 * @return the refuse description
	 */
	public String getRefuseDescription()
	{
		return rd;
	}

	/**
	 * Gets the database source: 'Branded Food Products' or 'Standard Reference'.
	 *
	 * @return the database source
	 */
	public String getDatabaseSource()
	{
		return ds;
	}

	/**
	 * Gets the reporting unit: nutrient values are reported in this unit, usually gram (g) or milliliter (ml).
	 *
	 * @return the reporting unit or null if the unit is unrecognized
	 */
	public Unit getReportingUnit()
	{
		if(ru.toLowerCase().equals("g"))
			return Unit.GRAM;
		else if(ru.toLowerCase().equals("ml"))
			return Unit.MILLILITER;
		
		return null;
	}

	/**
	 * Gets the list of ingredients. Only Branded Food Products have this.
	 *
	 * @return the ingredients
	 */
	public String getIngredients()
	{
		return ingDesc;
	}

	/**
	 * Gets the date ingredients were last updated by company. Only Branded Food Products have this.
	 *
	 * @return the ingredients update date
	 */
	public String getIngredientsUpdateDate()
	{
		return ingUpd;
	}

	/**
	 * Gets all of the nutrients provided in this foodreport.
	 *
	 * @return the all nutrients
	 */
	public Nutrient[] getAllNutrients()
	{
		return nutrients;
	}

	/**
	 * Gets the reference sources, usually a bibliographic citation, for the food.
	 *
	 * @return the sources
	 */
	public String[] getSources()
	{
		return sources;
	}
	
	/**
	 * Gets a specific nutrient based on its id.
	 *
	 * @param nutrientId the nutrient id for the nutrient
	 * @return the nutrient or null if the nutrient id does not exists
	 */
	public Nutrient getNutrient(int nutrientId)
	{
		for(Nutrient n : nutrients)
		{
			if(n.getNutrient_id() == nutrientId)
				return n;
		}
		
		return null;
	}
	
	/**
	 * Gets a specific nutrient based on the name. The name does not have to match exactly, only be contained in the actual nutrient name. 
	 * E.g. the nutrient 'Total lipid (fat)' will be matched with fat.
	 *
	 * @param name the name of the nutrient
	 * @return the nutrient
	 */
	public Nutrient getNutrient(String name)
	{
		for(Nutrient n : nutrients)
		{
			if(n.getName().toLowerCase().contains(name.toLowerCase()))
				return n;
		}
		
		return null;
	}

	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	void setType(String type)
	{
		this.type = type;
	}

	/**
	 * Sets the sr.
	 *
	 * @param sr the new sr
	 */
	void setSr(String sr)
	{
		this.sr = sr;
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
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Sets the sd.
	 *
	 * @param sd the new sd
	 */
	void setSd(String sd)
	{
		this.sd = sd;
	}

	/**
	 * Sets the fg.
	 *
	 * @param fg the new fg
	 */
	void setFg(String fg)
	{
		this.fg = fg;
	}

	/**
	 * Sets the sn.
	 *
	 * @param sn the new sn
	 */
	void setSn(String sn)
	{
		this.sn = sn;
	}

	/**
	 * Sets the cn.
	 *
	 * @param cn the new cn
	 */
	void setCn(String cn)
	{
		this.cn = cn;
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

	/**
	 * Sets the nf.
	 *
	 * @param nf the new nf
	 */
	void setNf(double nf)
	{
		this.nf = nf;
	}

	/**
	 * Sets the cf.
	 *
	 * @param cf the new cf
	 */
	void setCf(double cf)
	{
		this.cf = cf;
	}

	/**
	 * Sets the ff.
	 *
	 * @param ff the new ff
	 */
	void setFf(double ff)
	{
		this.ff = ff;
	}

	/**
	 * Sets the pf.
	 *
	 * @param pf the new pf
	 */
	void setPf(double pf)
	{
		this.pf = pf;
	}

	/**
	 * Sets the r.
	 *
	 * @param r the new r
	 */
	void setR(double r)
	{
		this.r = r;
	}

	/**
	 * Sets the rd.
	 *
	 * @param rd the new rd
	 */
	void setRd(String rd)
	{
		this.rd = rd;
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
	 * Sets the ru.
	 *
	 * @param ru the new ru
	 */
	void setRu(String ru)
	{
		this.ru = ru;
	}

	/**
	 * Sets the ing desc.
	 *
	 * @param ingDesc the new ing desc
	 */
	void setIngDesc(String ingDesc)
	{
		this.ingDesc = ingDesc;
	}

	/**
	 * Sets the ing upd.
	 *
	 * @param intUpd the new ing upd
	 */
	void setIngUpd(String intUpd)
	{
		this.ingUpd = intUpd;
	}

	/**
	 * Sets the all nutrients.
	 *
	 * @param nutrients the new all nutrients
	 */
	void setAllNutrients(Nutrient[] nutrients)
	{
		this.nutrients = nutrients;
	}

	/**
	 * Sets the sources.
	 *
	 * @param sources the new sources
	 */
	void setSources(String[] sources)
	{
		this.sources = sources;
	}
	
	
}
