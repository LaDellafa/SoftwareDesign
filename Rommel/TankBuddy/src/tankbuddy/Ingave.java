package tankbuddy;
//package TankBuddy;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Ingave {

	public static LinkedHashMap<Integer, Afstand> afstanden = new LinkedHashMap<Integer, Afstand>();
	public static LinkedHashMap<Integer, Tankbeurt> tankbeurten = new LinkedHashMap<Integer, Tankbeurt>();
	public static LinkedHashMap<Integer, Reservering> reserveringen = new LinkedHashMap<Integer, Reservering>();

	public static Boolean autoKiezen(String auto) {
		// TODO: verwijzing naar classe Auto
		if (auto == "Audi") {
			return true;
		} else {
			return false;
		}
	}

	public static void afstand(String bestuurder, String auto, double afgelegd) {
		int i = 0;
		boolean check = false;

		/*
		 * Afstand afstand = new Afstand (bestuurder, "BMW", 10);
		 * afstanden.put(i, afstand); i++; afstand = new Afstand (bestuurder,
		 * auto, 10); afstanden.put(i, afstand); i=0;
		 */

		for (Entry<Integer, Afstand> entry : afstanden.entrySet()) {
			if (afstanden.get(i).getBestuurder().equals(bestuurder)) {
				if (afstanden.get(i).getAuto().equals(auto)) {
					double nieuweAfstand = afstanden.get(i).getAfstand() + afgelegd;
					afstanden.get(i).setAfstand(nieuweAfstand);
					afstanden.get(i).setAuto(auto);
					System.out.println("Bestuurder: " + afstanden.get(i).getBestuurder() + ", auto: "
							+ afstanden.get(i).getAuto() + " en afstand: " + afstanden.get(i).getAfstand());
					check = true;
					break;
				} else {
					// System.out.println("else " + afstanden.get(i).getAuto());
					i++;
				}
			} else {
				i++;
			}
		}

		if (!check) {
			Afstand afstand = new Afstand(bestuurder, auto, afgelegd);
			afstanden.put(i, afstand);
			afstanden.get(i).setAuto(auto);
			System.out.println("!!Nieuw!! Bestuurder: " + afstanden.get(i).getBestuurder() + ", auto: "
					+ afstanden.get(i).getAuto() + " en afstand: " + afstanden.get(i).getAfstand());
		}

		/*
		 * if (afstanden.get(i).getBestuurder() == bestuurder) {
		 * 
		 * if (afstanden.get(i).getAuto() == auto) { double nieuweAfstand =
		 * afstanden.get(i).getAfstand() + afgelegd2;
		 * afstanden.get(i).setAfstand(nieuweAfstand); System.out.println(
		 * "Bestuurder: " + bestuurder + ", auto: " + afstanden.get(i).getAuto()
		 * + " en afstand: " + afstanden.get(i).getAfstand()); i++; } else {
		 * i++; afstand = new Afstand (bestuurder, auto, afgelegd);
		 * afstanden.put(i, afstand); System.out.println(
		 * "Nieuwe auto. Bestuurder: " + afstanden.get(i).getBestuurder() +
		 * ", auto: " + afstanden.get(i).getAuto() + " en afstand: " +
		 * afstanden.get(i).getAfstand()); } } else { i++; afstand = new Afstand
		 * (bestuurder, auto, afgelegd); afstanden.put(i, afstand);
		 * System.out.println("Nieuwe bestuurder. Bestuurder: " +
		 * afstanden.get(i).getBestuurder() + ", auto: " +
		 * afstanden.get(i).getAuto() + " en afstand: " +
		 * afstanden.get(i).getAfstand()); }
		 */
	}

	public static void tankbeurt(String bestuurder, String auto, double liters, double prijs) {
		int i = 0;
		boolean check = false;

		/*
		 * Tankbeurt tankbeurt = new Tankbeurt (bestuurder, "BMW", 10, 10);
		 * tankbeurten.put(i, tankbeurt); i++; tankbeurt = new Tankbeurt
		 * (bestuurder, auto, 20, 20); tankbeurten.put(i, tankbeurt); i=0;
		 */

		for (Entry<Integer, Tankbeurt> entry : tankbeurten.entrySet()) {
			if (tankbeurten.get(i).getBestuurder().equals(bestuurder)) {
				if (tankbeurten.get(i).getAuto().equals(auto)) {
					double nieuweLiters = tankbeurten.get(i).getLiters() + liters;
					tankbeurten.get(i).setLiters(nieuweLiters);
					double nieuwePrijs = tankbeurten.get(i).getPrijs() + prijs;
					tankbeurten.get(i).setPrijs(nieuwePrijs);
					System.out.println("Bestuurder: " + tankbeurten.get(i).getBestuurder() + ", auto: "
							+ tankbeurten.get(i).getAuto() + ", liters: " + tankbeurten.get(i).getLiters()
							+ " en prijs: " + tankbeurten.get(i).getPrijs());
					check = true;
					break;
				} else {
					// System.out.println("else " +
					// tankbeurten.get(i).getAuto());
					i++;
				}
			} else {
				i++;
			}
		}

		if (!check) {
			Tankbeurt tankbeurt = new Tankbeurt(bestuurder, auto, liters, prijs);
			tankbeurten.put(i, tankbeurt);
			System.out.println("!!Nieuw!! Bestuurder: " + tankbeurten.get(i).getBestuurder() + ", auto: "
					+ tankbeurten.get(i).getAuto() + ", liters: " + tankbeurten.get(i).getLiters() + " en prijs: "
					+ tankbeurten.get(i).getPrijs());
		}

	}

	public void reservering(String bestuurder, String auto, String datum, String tijd1, String tijd2) {
		int i = 0;
		boolean check = false;

		for (Entry<Integer, Reservering> entry : reserveringen.entrySet()) {
			reserveringen.get(i).setDatum(datum);
			reserveringen.get(i).setTijd1(tijd1);
			reserveringen.get(i).setTijd1(tijd2);
			System.out.println("!! Nieuw !! Bestuurder: " + reserveringen.get(i).getBestuurder() + ", auto: "
					+ reserveringen.get(i).getAuto() + " en datum: " + afstanden.get(i).getDatum() + "tijd1: " + tijd1
					+ "tijd2: " + tijd2);
			check = true;
			i++;
			break;
		}

	}

}