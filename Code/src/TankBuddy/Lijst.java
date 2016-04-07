package TankBuddy;

public abstract class Lijst {
	public String auto;
	public double afstand;

//--Constructor--------------
	
	public Lijst (String auto, double afstand)
	{
		this.auto = auto;
		this.afstand = afstand;
	}
	
//--Get-functies-------------
	
	public String getAuto()
	{
		return auto;
	}
	
	public double getAfstand()
	{
		return afstand;
	}
	
//--Set-functies-------------
	
	public void setAuto (String auto)
	{
		this.auto = auto;
	}
	
	public void setAfstand (double afstand)
	{
		this.afstand = afstand;
	}
}