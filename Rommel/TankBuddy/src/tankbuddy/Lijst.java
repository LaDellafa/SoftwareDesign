package tankbuddy;
//package TankBuddy;

public abstract class Lijst {
	public String bestuurder;
	public String auto;
	public String naam;
	public String code;
	public String datum;
	public String tijd1;
	public String tijd2;
	
	
	public double afstand;
	
	public double liters;
	public double prijs;

//--Constructor--------------
	
	public Lijst (String bestuurder, String auto, double afstand)
	{
		this.bestuurder = bestuurder;
		this.auto = auto;
		this.afstand = afstand;
	}
	
	public Lijst (String bestuurder, String auto, double liters, double prijs)
	{
		this.bestuurder = bestuurder;
		this.auto = auto;
		this.liters = liters;
		this.prijs = prijs;
	}
	
	
	public Lijst (String naam, String code)
	{
		this.naam = naam;
		this.code = code;
		
	}
	
	public Lijst (String bestuurder, String auto, String datum, String tijd1, String tijd2)
	{
		this.bestuurder = bestuurder;
		this.auto = auto;
		this.datum = datum;
		this.tijd1 = tijd1;
		this.tijd2 = tijd2;
	}
	
//--Get-functies-------------
	
	public String getBestuurder()
	{
		return bestuurder;
	}
	
	public String getDatum()
	{
		return datum;
	}
	
	public String getTijd1()
	{
		return tijd1;
	}
	
	public String getTijd2()
	{
		return tijd2;
	}
	
	public String getNaam()
	{
		return naam;
	}
	
	public String getCode()
	{
		return code;
	}
	
	public String getAuto()
	{
		return auto;
	}
	
	public double getAfstand()
	{
		return afstand;
	}
	
	public double getLiters()
	{
		return liters;
	}
	
	public double getPrijs()
	{
		return prijs;
	}
	
//--Set-functies-------------
	
	public void setBestuurder (String bestuurder)
	{
		this.bestuurder = bestuurder;
	}
	
	public void setNaam (String naam)
	{
		this.naam = naam;
	}
	
	public void setCode (String code)
	{
		this.code = code;
	}
	
	public void setAuto (String auto)
	{
		this.auto = auto;
	}
	
	public void setAfstand (double afstand)
	{
		this.afstand = afstand;
	}
	
	public void setLiters (double liters)
	{
		this.liters = liters;
	}
	
	public void setPrijs (double prijs)
	{
		this.prijs = prijs;
	}
	
	public void setDatum(String datum)
	{
		this.datum = datum;
	}
	
	public void setTijd1(String tijd1)
	{
		this.tijd1 = tijd1;
	}
	
	public void setTijd2(String tijd2)
	{
		this.tijd2 = tijd2;
	}
}