package tankbuddy;
import java.util.LinkedHashMap;
import java.util.Map.Entry;


public class Controller {
	
	
	public static LinkedHashMap<Integer,Gebruikersnaam> namen = new LinkedHashMap<Integer,Gebruikersnaam>();
	//Gebruikersnaam administrator = new Gebruikersnaam ("Admin", "Admininstrator");
	
	public static boolean inloggen(String naam, String code) {
		int i = 0;
		boolean check = false;
		
		if(naam.equals("Admin") & code.equals("Administrator")){
			
			check = true;
		}
		else{
		for (Entry<Integer, Gebruikersnaam> entry : namen.entrySet()) {
			if (namen.get(i).getNaam().equals(naam)) {
				if (namen.get(i).getCode().equals(code)) {
					check = true;
				} else {
					//System.out.println("else " + afstanden.get(i).getAuto());
					i++;
				}
		    } else {
		    	i++;
		    }
		}}
		if (!check) {
			System.out.println("Foutieve gebruikersnaam of wachtwoord");
		}
		else {
			System.out.println("Ingelogd!");
		}
		return check;
	}
	
		


public static void registreren(String naam, String code) {
	int i = 0;
	boolean check = false;
	
	for (Entry<Integer, Gebruikersnaam> entry : namen.entrySet()) {
		i++;
	} 
	
	if (!check) {
		Gebruikersnaam gebruikersnaam = new Gebruikersnaam (naam, code);
		namen.put(i, gebruikersnaam);
		System.out.println("!!Nieuw!! Gebruiker: " + namen.get(i).getNaam());
	}
}

}