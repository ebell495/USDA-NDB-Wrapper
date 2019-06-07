package com.ebell495.usdaconnector;

// TODO: Auto-generated Javadoc
/**
 * The Class Nutrient.
 * A Nutrient 
 */
public class Nutrient
{
	/**
	 * Constants for all of the nutrients and their ID's
	 */
	public static final int CATECHIN = 749;
	public static final int GALLOCATECHIN = 794;
	public static final int GALLOCATECHIN_3_GALLATE = 796;
	public static final int EPICATECHIN = 751;
	public static final int EPICATECHIN_3_GALLATE = 752;
	public static final int EPIGALLOCATECHIN = 750;
	public static final int EPIGALLOCATECHIN_3_GALLATE = 753;
//	public static final int 100 = 610;
//	public static final int 120 = 611;
//	public static final int 130 = 696;
//	public static final int 140 = 612;
//	public static final int 141 = 625;
//	public static final int 150 = 652;
//	public static final int 151 = 697;
//	public static final int 160 = 613;
//	public static final int 161_C = 673;
//	public static final int 161_T = 662;
//	public static final int 161_UNDIFFERENTIATED = 626;
//	public static final int 170 = 653;
//	public static final int 171 = 687;
//	public static final int 180 = 614;
//	public static final int 181_C = 674;
//	public static final int 181_T = 663;
//	public static final int 181_UNDIFFERENTIATED = 617;
//	public static final int 18111_T_181T_N7 = 859;
//	public static final int 182_CLAS = 670;
//	public static final int 182_I = 666;
//	public static final int 182_N6_CC = 675;
//	public static final int 182_T_NOT_FURTHER_DEFINED = 665;
//	public static final int 182_TT = 669;
//	public static final int 182_UNDIFFERENTIATED = 618;
//	public static final int 183_N3_CCC_ALA = 851;
//	public static final int 183_N6_CCC = 685;
//	public static final int 183_UNDIFFERENTIATED = 619;
//	public static final int 183I = 856;
//	public static final int 184 = 627;
//	public static final int 200 = 615;
//	public static final int 201 = 628;
//	public static final int 202_N6_CC = 672;
//	public static final int 203_N3 = 852;
//	public static final int 203_N6 = 853;
//	public static final int 203_UNDIFFERENTIATED = 689;
//	public static final int 204_N6 = 855;
//	public static final int 204_UNDIFFERENTIATED = 620;
//	public static final int 205_N3_EPA = 629;
//	public static final int 215 = 857;
//	public static final int 220 = 624;
//	public static final int 221_C = 676;
//	public static final int 221_T = 664;
//	public static final int 221_UNDIFFERENTIATED = 630;
//	public static final int 224 = 858;
//	public static final int 225_N3_DPA = 631;
//	public static final int 226_N3_DHA = 621;
//	public static final int 240 = 654;
//	public static final int 241_C = 671;
//	public static final int 4_0 = 607;
//	public static final int 6_0 = 608;
//	public static final int 8_0_LIPID = 609;
	public static final int ADJUSTED_PROTEIN = 257;
	public static final int ALANINE = 513;
	public static final int ALCOHOL_ETHYL = 221;
	public static final int APIGENIN = 770;
	public static final int ARGININE = 511;
	public static final int ASH = 207;
	public static final int ASPARTIC_ACID = 514;
	public static final int BETASITOSTEROL = 641;
	public static final int BETAINE = 454;
	public static final int BIOCHANIN_A = 714;
	public static final int BIOTIN = 416;
	public static final int CAFFEINE = 262;
	public static final int CALCIUM_CA = 301;
	public static final int CAMPESTEROL = 639;
	public static final int CARBOHYDRATE_BY_DIFFERENCE = 205;
	public static final int CAROTENE_ALPHA = 322;
	public static final int CAROTENE_BETA = 321;
	public static final int CHOLESTEROL = 601;
	public static final int CHOLINE_TOTAL = 421;
	public static final int COPPER_CU = 312;
	public static final int COUMESTROL = 716;
	public static final int CRYPTOXANTHIN_BETA = 334;
	public static final int CYANIDIN = 731;
	public static final int CYSTINE = 507;
	public static final int DAIDZEIN = 710;
	public static final int DELPHINIDIN_ = 741;
	public static final int DIHYDROPHYLLOQUINONE = 429;
	public static final int ENERGY_KCAL = 208;
	public static final int ENERGY_KJ = 268;
	public static final int ERIODICTYOL = 758;
	public static final int FATTY_ACIDS_TOTAL_MONOUNSATURATED = 645;
	public static final int FATTY_ACIDS_TOTAL_POLYUNSATURATED = 646;
	public static final int FATTY_ACIDS_TOTAL_SATURATED = 606;
	public static final int FATTY_ACIDS_TOTAL_TRANS = 605;
	public static final int FATTY_ACIDS_TOTAL_TRANSMONOENOIC = 693;
	public static final int FATTY_ACIDS_TOTAL_TRANSPOLYENOIC = 695;
	public static final int FIBER_INSOLUBLE = 297;
	public static final int FIBER_SOLUBLE = 295;
	public static final int FIBER_TOTAL_DIETARY = 291;
	public static final int FLUORIDE_F = 313;
	public static final int FOLATE_DFE = 435;
	public static final int FOLATE_FOOD = 432;
	public static final int FOLATE_TOTAL = 417;
	public static final int FOLIC_ACID = 431;
	public static final int FORMONONETIN = 715;
	public static final int FRUCTOSE = 212;
	public static final int GALACTOSE = 287;
	public static final int GENISTEIN = 711;
	public static final int GLUCOSE_DEXTROSE = 211;
	public static final int GLUTAMIC_ACID = 515;
	public static final int GLYCINE = 516;
	public static final int GLYCITEIN = 712;
	public static final int HESPERETIN = 759;
	public static final int HISTIDINE = 512;
	public static final int HYDROXYPROLINE = 521;
	public static final int IODINEI = 314;
	public static final int IRON_FE = 303;
	public static final int ISOLEUCINE = 503;
	public static final int ISORHAMNETIN = 785;
	public static final int KAEMPFEROL = 786;
	public static final int LACTOSE = 213;
	public static final int LEUCINE = 504;
	public static final int LUTEIN__ZEAXANTHIN = 338;
	public static final int LUTEOLIN = 773;
	public static final int LYCOPENE = 337;
	public static final int LYSINE = 505;
	public static final int MAGNESIUM_MG = 304;
	public static final int MALTOSE = 214;
	public static final int MALVIDIN = 742;
	public static final int MANGANESE_MN = 315;
	public static final int MENAQUINONE_4 = 428;
	public static final int METHIONINE = 506;
	public static final int MYRICETIN = 788;
	public static final int NARINGENIN = 762;
	public static final int NIACIN = 406;
	public static final int PANTOTHENIC_ACID = 410;
	public static final int PELARGONIDIN = 743;
	public static final int PEONIDIN = 745;
	public static final int PETUNIDIN = 740;
	public static final int PHENYLALANINE = 508;
	public static final int PHOSPHORUS_P = 305;
	public static final int PHYTOSTEROLS = 636;
	public static final int POTASSIUM_K = 306;
	public static final int PROANTHOCYANIDIN_4_6MERS = 736;
	public static final int PROANTHOCYANIDIN_7_10MERS = 737;
	public static final int PROANTHOCYANIDIN_DIMERS = 734;
	public static final int PROANTHOCYANIDIN_MONOMERS = 733;
	public static final int PROANTHOCYANIDIN_POLYMERS = 738;
	public static final int PROANTHOCYANIDIN_TRIMERS = 735;
	public static final int PROLINE = 517;
	public static final int PROTEIN = 203;
	public static final int QUERCETIN = 789;
	public static final int RETINOL = 319;
	public static final int RIBOFLAVIN = 405;
	public static final int SELENIUM_SE = 317;
	public static final int SERINE = 518;
	public static final int SODIUM_NA = 307;
	public static final int STARCH = 209;
	public static final int STIGMASTEROL = 638;
	public static final int SUCROSE = 210;
	public static final int SUGAR_ALCOHOLS_TOTAL = 299;
	public static final int SUGARS_ADDED = 539;
	public static final int SUGARS_TOTAL = 269;
	public static final int THEAFLAVIN = 755;
	public static final int THEAFLAVIN_3PRIME_GALLATE = 792;
	public static final int THEAFLAVIN_3_3_DIGALLATE = 791;
	public static final int THEAFLAVIN_3_GALLATE = 793;
	public static final int THEARUBIGINS = 756;
	public static final int THEOBROMINE = 263;
	public static final int THIAMIN = 404;
	public static final int THREONINE = 502;
	public static final int TOCOPHEROL_BETA = 341;
	public static final int TOCOPHEROL_DELTA = 343;
	public static final int TOCOPHEROL_GAMMA = 342;
	public static final int TOCOTRIENOL_ALPHA = 344;
	public static final int TOCOTRIENOL_BETA = 345;
	public static final int TOCOTRIENOL_DELTA = 347;
	public static final int TOCOTRIENOL_GAMMA = 346;
	public static final int TOTAL_ISOFLAVONES = 713;
	public static final int TOTAL_LIPID_FAT = 204;
	public static final int TRYPTOPHAN = 501;
	public static final int TYROSINE = 509;
	public static final int VALINE = 510;
	public static final int VITAMIN_A_IU = 318;
	public static final int VITAMIN_A_RAE = 320;
	public static final int VITAMIN_B12 = 418;
	public static final int VITAMIN_B12_ADDED = 578;
	public static final int VITAMIN_B6 = 415;
	public static final int VITAMIN_C = 401;
	public static final int VITAMIN_D = 324;
	public static final int VITAMIN_D_D2_D3 = 328;
	public static final int VITAMIN_D2_ERGOCALCIFEROL = 325;
	public static final int VITAMIN_D3_CHOLECALCIFEROL = 326;
	public static final int VITAMIN_E_ALPHATOCOPHEROL = 323;
	public static final int VITAMIN_E_ADDED = 573;
	public static final int VITAMIN_K_PHYLLOQUINONE = 430;
	public static final int WATER = 255;
	public static final int ZINC_ZN = 309;

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
	public Unit getUnit()
	{
		if(unit.toLowerCase().equals("g"))
			return Unit.GRAM;
		else if(unit.toLowerCase().equals("ml"))
			return Unit.MILLILITER;
		else if(unit.toLowerCase().equals("mg"))
			return Unit.MILIGRAM;
		else if(unit.toLowerCase().equals("kcal"))
			return Unit.KCAL;
		else if(unit.toLowerCase().equals("µg"))
			return Unit.MICROGRAM;
		else if(unit.toLowerCase().equals("iu"))
			return Unit.IU;
		
		return null;
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
	
	public String toString()
	{
		return "Nutrient " + this.nutrient_id + ": " + this.name + " " + value + this.getUnit();
	}
}
