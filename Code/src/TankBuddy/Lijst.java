package TankBuddy;

public abstract class Lijst {
	public String bestuurder;
	public String auto;
	
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
	
//--Get-functies-------------
	
	public String getBestuurder()
	{
		return bestuurder;
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
}