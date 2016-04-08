package TankBuddy;

public class TankBuddy {
	static String testBestuurder = "Lander";
	static String testBestuurder2 = "Glenn";
	static String testAuto = "Audi";
	static String testAuto2 = "BMW";
	static double testAfgelegd = 10;
	static double testLiters = 10;
	static double testPrijs = 11;
	static Boolean correcteAuto = false;
	
	public static void main(String[] args) {
		correcteAuto = Ingave.autoKiezen(testAuto);
		if (true) {
			Ingave.afstand(testBestuurder,testAuto,testAfgelegd);
			//Ingave.afstand(testBestuurder,testAuto2,testAfgelegd);
			Ingave.afstand(testBestuurder2,testAuto2,testAfgelegd);
			Ingave.afstand(testBestuurder2,testAuto2,testAfgelegd);
			
			//Ingave.tankbeurt(testBestuurder,testAuto,testLiters,testPrijs);
			//Ingave.afstand(testBestuurder,testAuto2,testLiters,testPrijs);
			//Ingave.afstand(testBestuurder2,testAuto2,testLiters,testPrijs);
			//Ingave.afstand(testBestuurder2,testAuto2,testLiters,testPrijs);
		}
		
	}
}
