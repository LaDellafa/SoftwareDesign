package tankbuddy;

import java.awt.event.ActionListener;
import javax.swing.*;

public class MVCViewReg extends JFrame {
	
	private JLabel gebruikersnaamText = new JLabel("Gebruikersnaam:");
	private JTextField gebruikernaam = new JTextField(10);
	private JTextField wachtwoord = new JTextField(10);
	private JButton registreerButton = new JButton("Registreer");
	private JButton terugButton = new JButton("Terug");

	MVCViewReg() {

		// Sets up the view and adds the components
		JPanel regPanel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);

		regPanel.add(gebruikersnaamText);
		regPanel.add(gebruikernaam);
		regPanel.add(wachtwoord);
		regPanel.add(registreerButton);
		regPanel.add(terugButton);
		this.add(regPanel);

		// End of setting up the components --------

	}

	public String getGebruikersnaam() {

		return (gebruikernaam.getText());

	}

	public String getWachtwoord() {
		return (wachtwoord.getText());
	}

	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	
	void addRegistreerListener(ActionListener listenForRegButton) {

		registreerButton.addActionListener(listenForRegButton);

	}
	
	void addTerugListener(ActionListener listenForTerugButton) {

		terugButton.addActionListener(listenForTerugButton);

	}

	// Open a popup that contains the error message passed

	void displayErrorMessage(String errorMessage) {

		JOptionPane.showMessageDialog(this, errorMessage);

	}
}
