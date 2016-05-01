package tankbuddy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// The Controller coordinates interactions
// between the View and Model

public class MVCController {

	private MVCView theView;
	private MVCViewStart theView1;
	private MVCViewInlog theView2;
	private MVCViewReg theView3;
	private TankBuddy theModel;

	public MVCController(MVCView theView, MVCViewStart theView1, MVCViewInlog theView2, MVCViewReg theView3, TankBuddy theModel) {
		this.theView = theView;
		this.theView1 = theView1;
		this.theView2 = theView2;
		this.theView3 = theView3;
		this.theModel = theModel;

		this.theView.addIngevenListener(new IngevenListener());
		this.theView.addIngeven2Listener(new Ingeven2Listener());
		this.theView.addUitloggenListener(new TerugListener());

		this.theView1.addInloggenStartListener(new InloggenStartListener());
		this.theView1.addRegistreerStartListener(new RegistreerStartListener());

		this.theView2.addInloggenListener(new InloggenListener());
		this.theView2.addTerugListener(new TerugListener());
		this.theView3.addRegistreerListener(new RegistreerListener());
		this.theView3.addTerugListener(new TerugListener());
	}
	
	class IngevenListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				String auto = theView.getAuto();
				double afstand = theView.getAfstand();

				theModel.afstand(auto, afstand);
				
			} catch (NumberFormatException ex) {

				System.out.println(ex);

			}
		}
	}
	
	class Ingeven2Listener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			try {
				String auto = theView.getAuto2();
				double liters = theView.getLiters();
				double prijs = theView.getPrijs();

				theModel.tankbeurt(auto, liters, prijs);
				
			} catch (NumberFormatException ex) {

				System.out.println(ex);

			}
		}
	}

	class InloggenStartListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			try {
				theView2.setVisible(true);
			} catch (NumberFormatException ex) {

				System.out.println(ex);

			}
		}
	}

	class RegistreerStartListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			try {
				theView3.setVisible(true);
			} catch (NumberFormatException ex) {

				System.out.println(ex);

			}
		}
	}

	class TerugListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			try {
				theModel.uitloggen();
				theView1.setVisible(true);
			} catch (NumberFormatException ex) {

				System.out.println(ex);

			}
		}
	}

	class InloggenListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String gebruikersnaam, wachtwoord;
			Boolean check;

			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered

			try {

				gebruikersnaam = theView2.getGebruikersnaam();
				wachtwoord = theView2.getWachtwoord();

				check = theModel.inloggen(gebruikersnaam, wachtwoord);
				
				if(check) {
					theView.setVisible(true);
				}

			}

			catch (NumberFormatException ex) {

				System.out.println(ex);

			}

		}
	}

	class RegistreerListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			String gebruikersnaam, wachtwoord;

			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered

			try {

				gebruikersnaam = theView3.getGebruikersnaam();
				wachtwoord = theView3.getWachtwoord();

				theModel.registreren(gebruikersnaam, wachtwoord);

			}

			catch (NumberFormatException ex) {

				System.out.println(ex);

			}

		}

	}
}
