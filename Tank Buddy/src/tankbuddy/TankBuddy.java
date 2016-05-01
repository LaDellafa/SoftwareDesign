package tankbuddy;

import java.util.Scanner;


public class TankBuddy {
	static String testBestuurder = "Lander";
	static String testBestuurder2 = "Glenn";
	static String testAuto = "Audi";
	static String testAuto2 = "BMW";
	static double testAfgelegd = 10;
	static double testLiters = 10;
	static double testPrijs = 11;
	static Boolean correcteAuto = false;
	public static boolean ingelogd = false;
	public static boolean uitgelogd = false;
	public static String g;

	static int i;
	

	Boolean inloggen(String gebruikersnaam, String wachtwoord) {
		ingelogd = Controller.inloggen(gebruikersnaam, wachtwoord);
		if(ingelogd) {
			g = gebruikersnaam;
			return true;
		}
		return false;
	}
	
	void uitloggen() {
		ingelogd = false;
	}
	
	void registreren(String gebruikersnaam, String wachtwoord) {
		Controller.registreren(gebruikersnaam, wachtwoord);
	}
	
	void afstand(String auto, double afstand) {
		Ingave.afstand(g, auto, afstand);
	}
	
	void tankbeurt(String auto, double liters, double prijs) {
		Ingave.tankbeurt(g, auto, liters, prijs);
	}
	
	public static void main(String[] args) {

		Controller.registreren("l", "1");
		
		Scanner scanInput = new Scanner(System.in);

		do {

			System.out.println("Wilt u inloggen of registreren (1 of 2)?");
			String k = scanInput.nextLine();
			i = Integer.parseInt(k);
			if (i == 1) {
				System.out.println("Gebruikersnaam:");
				g = scanInput.nextLine();
				System.out.println("Gebruikersnaam:" + g);
				System.out.println("Wachtwoord:");
				String w = scanInput.nextLine();
				System.out.println("wachtwoord:" + w);
				ingelogd = Controller.inloggen(g, w);
				Controller.inloggen(g, w);
				System.out.println("ingelogd:" + ingelogd);
			} else if (i == 2) {
				System.out.println("Gebruikersnaam:");
				String x = scanInput.nextLine();
				System.out.println("Wachtwoord:");
				String z = scanInput.nextLine();
				Controller.registreren(x, z);
			} else {
				System.out.println("Gelieve '1' of '2' in te geven!");
			}
		} while (!ingelogd);

		do {
			System.out.println("Wilt u een rit ingeven --> druk 1?");
			System.out.println("Wilt u een tankbeurt ingeven --> druk 2?");
			System.out.println("Wilt u een reservering ingeven --> druk 3?");
			System.out.println("Wilt u uitloggen --> druk 4?");
			int k = scanInput.nextInt();

			if (k == 1) {

				System.out.println("Geef een auto in aub.");
				String d = scanInput.nextLine();
				scanInput.nextLine();
				System.out.println("Geef een afstand in aub.");
				double e = scanInput.nextDouble();
				Ingave.afstand(g, d, e);

			} else if (k == 2) {

				System.out.println("Geef een auto in aub.");
				String d = scanInput.nextLine();
				scanInput.nextLine();
				System.out.println("Geef een afstand in aub.");
				double e = scanInput.nextDouble();
				Ingave.afstand(g, d, e);

			} else if (k == 3) {

				System.out.println("Geef een auto in aub.");
				String d = scanInput.nextLine();
				scanInput.nextLine();
				System.out.println("Geef een afstand in aub.");
				double e = scanInput.nextDouble();
				Ingave.afstand(g, d, e);

			} else if (k == 4) {
				
				System.out.println("Uitloggen...");
				uitgelogd = true;
				/*
				 * System.out.println("Geef een auto in aub."); String d =
				 * scanInput.nextLine(); scanInput.nextLine();
				 * System.out.println("Geef een afstand in aub."); double e =
				 * scanInput.nextDouble(); Ingave.afstand(g, d, e);
				 */

			}

			else {
				System.out.println("Gelieve een cijfer tussen 1 en 4 in te geven.");
			}

		} while (!uitgelogd);

		// Controller.registreren("Hamid", "2563");
		// Controller.inloggen("Hamid", "25363");
		// System.out.println("test");
		// ingelogd = Controller.inloggen("Hamid", "2563");

		//
		// if (ingelogd){
		// correcteAuto = Ingave.autoKiezen(testAuto);
		// if (correcteAuto) {
		// Ingave.afstand(testBestuurder,testAuto,testAfgelegd);
		// Ingave.afstand(testBestuurder,testAuto2,testAfgelegd);
		// Ingave.afstand(testBestuurder2,testAuto2,testAfgelegd);
		// Ingave.afstand(testBestuurder2,testAuto2,testAfgelegd);
		// Ingave.afstand(testBestuurder,testAuto2,testAfgelegd);
		// Ingave.afstand(testBestuurder,testAuto,testAfgelegd);
		// Ingave.afstand(testBestuurder,testAuto2,testAfgelegd);
		// Ingave.afstand(testBestuurder2,testAuto2,testAfgelegd);
		// Ingave.afstand(testBestuurder2,testAuto2,testAfgelegd);
		// Ingave.afstand(testBestuurder,testAuto2,testAfgelegd);
		//
		// Ingave.tankbeurt(testBestuurder,testAuto,testLiters,testPrijs);
		// Ingave.tankbeurt(testBestuurder,testAuto2,testLiters,testPrijs);
		// Ingave.tankbeurt(testBestuurder2,testAuto2,testLiters,testPrijs);
		// Ingave.tankbeurt(testBestuurder2,testAuto2,testLiters,testPrijs);
		// Ingave.tankbeurt(testBestuurder,testAuto,testLiters,testPrijs);
		// Ingave.tankbeurt(testBestuurder,testAuto2,testLiters,testPrijs);
		// Ingave.tankbeurt(testBestuurder2,testAuto2,testLiters,testPrijs);
		// Ingave.tankbeurt(testBestuurder2,testAuto,testLiters,testPrijs);
		// }
		// }else {
		//
		// }

		// correcteAuto = Ingave.autoKiezen(testAuto);
		// if (true) {
		// Ingave.afstand(testBestuurder,testAuto,testAfgelegd);
		// Ingave.afstand(testBestuurder,testAuto2,testAfgelegd);
		// Ingave.afstand(testBestuurder2,testAuto2,testAfgelegd);
		// Ingave.afstand(testBestuurder2,testAuto2,testAfgelegd);
		// Ingave.afstand(testBestuurder,testAuto2,testAfgelegd);
		// Ingave.afstand(testBestuurder,testAuto,testAfgelegd);
		// Ingave.afstand(testBestuurder,testAuto2,testAfgelegd);
		// Ingave.afstand(testBestuurder2,testAuto2,testAfgelegd);
		// Ingave.afstand(testBestuurder2,testAuto2,testAfgelegd);
		// Ingave.afstand(testBestuurder,testAuto2,testAfgelegd);
		//
		// Ingave.tankbeurt(testBestuurder,testAuto,testLiters,testPrijs);
		// Ingave.tankbeurt(testBestuurder,testAuto2,testLiters,testPrijs);
		// Ingave.tankbeurt(testBestuurder2,testAuto2,testLiters,testPrijs);
		// Ingave.tankbeurt(testBestuurder2,testAuto2,testLiters,testPrijs);
		// Ingave.tankbeurt(testBestuurder,testAuto,testLiters,testPrijs);
		// Ingave.tankbeurt(testBestuurder,testAuto2,testLiters,testPrijs);
		// Ingave.tankbeurt(testBestuurder2,testAuto2,testLiters,testPrijs);
		// Ingave.tankbeurt(testBestuurder2,testAuto,testLiters,testPrijs);
		// }

	}
}
