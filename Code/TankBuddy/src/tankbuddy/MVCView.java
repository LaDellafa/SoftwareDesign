package tankbuddy;

import java.awt.event.ActionListener;
import javax.swing.*;

public class MVCView extends JFrame {
	
	private JLabel autoText = new JLabel("Auto:");
	private JTextField auto = new JTextField(10);
	private JLabel afstandText = new JLabel("Afstand:");
	private JTextField afstand = new JTextField(10);
	private JButton ingevenButton = new JButton("Ingeven");
	
	private JLabel auto2Text = new JLabel("Auto:");
	private JTextField auto2 = new JTextField(10);
	private JLabel litersText = new JLabel("Aantal liters:");
	private JTextField liters = new JTextField(10);
	private JLabel prijsText = new JLabel("Prijs:");
	private JTextField prijs = new JTextField(10);
	private JButton ingeven2Button = new JButton("Ingeven");
	private JButton uitloggenButton = new JButton("Uitloggen");

	MVCView() {

		// Sets up the view and adds the components
		JPanel viewPanel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 200);

		viewPanel.add(autoText);
		viewPanel.add(auto);
		viewPanel.add(afstandText);
		viewPanel.add(afstand);
		viewPanel.add(ingevenButton);
		viewPanel.add(uitloggenButton);
		viewPanel.add(auto2Text);
		viewPanel.add(auto2);
		viewPanel.add(litersText);
		viewPanel.add(liters);
		viewPanel.add(prijsText);
		viewPanel.add(prijs);
		viewPanel.add(ingeven2Button);
		viewPanel.add(uitloggenButton);
		this.add(viewPanel);

		// End of setting up the components --------

	}

	public String getAuto() {

		return (auto.getText());

	}

	public double getAfstand() {
		return Double.parseDouble(afstand.getText());
	}

	void addUitloggenListener(ActionListener listenForUitloggenButton) {

		uitloggenButton.addActionListener(listenForUitloggenButton);

	}
	
	void addIngevenListener(ActionListener listenForIngevenButton) {

		ingevenButton.addActionListener(listenForIngevenButton);

	}
	
	public String getAuto2() {

		return (auto2.getText());

	}

	public double getLiters() {
		return Double.parseDouble(liters.getText());
	}
	
	public double getPrijs() {
		return Double.parseDouble(prijs.getText());
	}

	void addIngeven2Listener(ActionListener listenForIngeven2Button) {

		ingeven2Button.addActionListener(listenForIngeven2Button);

	}

	// Open a popup that contains the error message passed

	void displayErrorMessage(String errorMessage) {

		JOptionPane.showMessageDialog(this, errorMessage);

	}
}
