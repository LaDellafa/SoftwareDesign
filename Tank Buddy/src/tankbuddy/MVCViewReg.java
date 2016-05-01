package tankbuddy;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MVCViewReg extends JFrame {
	
	private JLabel gebruikersnaamText = new JLabel("Gebruikersnaam:");
	private JLabel wachtwoordText = new JLabel("Wachtwoord:");
	private JTextField gebruikernaam = new JTextField(10);
	private JPasswordField wachtwoord = new JPasswordField(10);
	private JButton registreerButton = new JButton("Registreer");
	private JButton terugButton = new JButton("Terug");

	MVCViewReg() {

		//Create a new panel with GridBagLayout manager
		JPanel regPanel = new JPanel(new GridBagLayout());

		GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);
		regPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Registreer Panel"));

		//Add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 0;
		regPanel.add(gebruikersnaamText, constraints);
		
		constraints.gridx = 1;
		regPanel.add(gebruikernaam, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		regPanel.add(wachtwoordText, constraints);
		
		constraints.gridx = 1;
		regPanel.add(wachtwoord, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		regPanel.add(registreerButton, constraints);
		
		constraints.gridx = 0;
		regPanel.add(terugButton, constraints);
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
