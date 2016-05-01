package tankbuddy;

import java.awt.event.ActionListener;
import javax.swing.*;

public class MVCViewStart extends JFrame {

	private JButton inloggenStartButton = new JButton("Inloggen");
	private JButton registreerStartButton = new JButton("Registreer");
	
	MVCViewStart() {

		// Sets up the view and adds the components
		JPanel startPanel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);

		
		startPanel.add(inloggenStartButton);
		startPanel.add(registreerStartButton);
		this.add(startPanel);

		// End of setting up the components --------

	}


	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed

	void addInloggenStartListener(ActionListener listenForInlogStartButton) {

		inloggenStartButton.addActionListener(listenForInlogStartButton);

	}

	void addRegistreerStartListener(ActionListener listenForRegStartButton) {

		registreerStartButton.addActionListener(listenForRegStartButton);

	}

	// Open a popup that contains the error message passed

	void displayErrorMessage(String errorMessage) {

		JOptionPane.showMessageDialog(this, errorMessage);

	}
}
