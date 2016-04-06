package TankBuddy;

public class Ingave {

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
		
		Afstand.ingeven(bestuurder, auto, afgelegd);
	}
	
	public static void tankbeurt(String bestuurder, String auto) {
		double liters = 39.87;
		double prijs = 42.23;
		
		Tankbeurt.ingeven(bestuurder, auto, liters, prijs);
	}
	
	public void reservering(String bestuurder, String auto) {
		
	}
	
	static String testBestuurder = "Lander";
	static String testAuto = "Audi";
	static Boolean correcteAuto = false;
	
	public static void main(String[] args) {
		correcteAuto = autoKiezen(testAuto);
		if (correcteAuto) {
			afstand(testBestuurder,testAuto);
			tankbeurt(testBestuurder,testAuto);
		}
		
	}
	
}