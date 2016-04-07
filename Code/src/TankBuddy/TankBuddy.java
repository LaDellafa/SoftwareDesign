package TankBuddy;

public class TankBuddy {
	static String testBestuurder = "Lander";
	static String testAuto = "Audi";
	static Boolean correcteAuto = false;
	
	public static void main(String[] args) {
		correcteAuto = Ingave.autoKiezen(testAuto);
		if (correcteAuto) {
			Ingave.afstand(testBestuurder,testAuto);
			Ingave.tankbeurt(testBestuurder,testAuto);
		}
		
	}
}
