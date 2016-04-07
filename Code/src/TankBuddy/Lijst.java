package TankBuddy;

public abstract class Lijst {
	public String bestuurder;
	public String auto;
	public double afstand;

//--Constructor--------------
	
	public Lijst (String bestuurder, String auto, double afstand)
	{
		this.bestuurder = bestuurder;
		this.auto = auto;
		this.afstand = afstand;
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
}