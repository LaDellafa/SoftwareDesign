package TankBuddy;

import java.util.LinkedHashMap;

public class Ingave {
	
	public static LinkedHashMap<String,Afstand> afstanden = new LinkedHashMap<String,Afstand>();

	public static Boolean autoKiezen(String auto) {
		//TODO: verwijzing naar classe Auto
		if (auto == "Audi") {
			return true;
		} else {
			return false;
		}
	}
	
	public static void afstand(String bestuurder, String auto) {
		double afgelegd = 89.21;
		double afgelegd2 = 10.89;
		
		Afstand afstand = new Afstand (auto, afgelegd);
		afstanden.put(bestuurder, afstand);
		
		System.out.println("Bestuurder: " + bestuurder + ", auto: " + afstanden.get(bestuurder).getAuto() + " en afstand: " + afstanden.get(bestuurder).getAfstand());
		
		if (afstanden.get(bestuurder).getAuto() == auto) {
			double nieuweAfstand = afstanden.get(bestuurder).getAfstand() + afgelegd2;
			afstanden.get(bestuurder).setAfstand(nieuweAfstand);
			System.out.println("Bestuurder: " + bestuurder + ", auto: " + afstanden.get(bestuurder).getAuto() + " en afstand: " + afstanden.get(bestuurder).getAfstand());
		}
		
		
	}
	
	public static void tankbeurt(String bestuurder, String auto) {
		double liters = 39.87;
		double prijs = 42.23;
		
		Tankbeurt.ingeven(bestuurder, auto, liters, prijs);
	}
	
	public void reservering(String bestuurder, String auto) {
		
	}
	
}