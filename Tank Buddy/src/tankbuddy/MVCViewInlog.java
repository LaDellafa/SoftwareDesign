package tankbuddy;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MVCViewInlog extends JFrame {
	
	private JLabel gebruikersnaamText = new JLabel("Gebruikersnaam:");
	private JLabel wachtwoordText = new JLabel("Wachtwoord:");
	private JTextField gebruikernaam = new JTextField(10);
	private JPasswordField wachtwoord = new JPasswordField(10);
	private JButton inloggenButton = new JButton("Inloggen");
	private JButton terugButton = new JButton("Terug");

	MVCViewInlog() {

		//Create a new panel with GridBagLayout manager
		JPanel inlogPanel = new JPanel(new GridBagLayout());

		GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		inlogPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Login Panel"));

		//Add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 0;
		inlogPanel.add(gebruikersnaamText, constraints);
		
		constraints.gridx = 1;
		inlogPanel.add(gebruikernaam, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		inlogPanel.add(wachtwoordText, constraints);
		
		constraints.gridx = 1;
		inlogPanel.add(wachtwoord, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		inlogPanel.add(inloggenButton, constraints);
		
		constraints.gridx = 0;
		inlogPanel.add(terugButton, constraints);
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
