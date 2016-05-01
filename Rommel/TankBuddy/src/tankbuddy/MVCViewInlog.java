package tankbuddy;

import java.awt.event.ActionListener;
import javax.swing.*;

public class MVCViewInlog extends JFrame {
	
	private JLabel gebruikersnaamText = new JLabel("Gebruikersnaam:");
	private JTextField gebruikernaam = new JTextField(10);
	private JTextField wachtwoord = new JTextField(10);
	private JButton inloggenButton = new JButton("Inloggen");
	private JButton terugButton = new JButton("Terug");

	MVCViewInlog() {

		// Sets up the view and adds the components
		JPanel inlogPanel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);

		inlogPanel.add(gebruikersnaamText);
		inlogPanel.add(gebruikernaam);
		inlogPanel.add(wachtwoord);
		inlogPanel.add(inloggenButton);
		inlogPanel.add(terugButton);
		this.add(inlogPanel);

		// End of setting up the components --------

	}

	public String getGebruikersnaam() {

		return (gebruikernaam.getText());

	}

	public String getWachtwoord() {
		return (wachtwoord.getText());
	}

	void addTerugListener(ActionListener listenForTerugButton) {

		terugButton.addActionListener(listenForTerugButton);

	}
	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	
	void addInloggenListener(ActionListener listenForInlogButton) {

		inloggenButton.addActionListener(listenForInlogButton);

	}

	// Open a popup that contains the error message passed

	void displayErrorMessage(String errorMessage) {

		JOptionPane.showMessageDialog(this, errorMessage);

	}
}
