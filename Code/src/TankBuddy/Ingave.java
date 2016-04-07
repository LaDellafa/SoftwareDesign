package TankBuddy;

import java.util.LinkedHashMap;

public class Ingave {
	
	public static LinkedHashMap<Integer,Afstand> afstanden = new LinkedHashMap<Integer,Afstand>();

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
		
		//System.out.println("Bestuurder: " + afstanden.get(1).getBestuurder() + ", auto: " + afstanden.get(bestuurder).getAuto() + " en afstand: " + afstanden.get(bestuurder).getAfstand());
		
		if (afstanden.get(1).getBestuurder() == bestuurder) {
			
			if (afstanden.get(1).getAuto() == auto) {
				double nieuweAfstand = afstanden.get(bestuurder).getAfstand() + afgelegd2;
				afstanden.get(bestuurder).setAfstand(nieuweAfstand);
				System.out.println("Bestuurder: " + bestuurder + ", auto: " + afstanden.get(bestuurder).getAuto() + " en afstand: " + afstanden.get(bestuurder).getAfstand());
			} else {
				Afstand afstand = new Afstand (bestuurder, auto, afgelegd);
				afstanden.put(1, afstand);
			}
		} else {
			Afstand afstand = new Afstand (bestuurder, auto, afgelegd);
			afstanden.put(1, afstand);
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