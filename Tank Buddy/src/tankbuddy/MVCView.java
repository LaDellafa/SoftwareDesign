package tankbuddy;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;

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
		
		setTitle("Ingaven");
        JTabbedPane tabbedPanel = new JTabbedPane();
		getContentPane().add(tabbedPanel);
        
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(400, 400);

        JPanel afstandPanel = new JPanel(new GridBagLayout());
		afstandPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Afstand Panel"));
	
        JPanel tankbeurtPanel = new JPanel(new GridBagLayout());
		tankbeurtPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Tankbeurt Panel"));

		//Add components to the panel
		constraints.gridx = 0;
		constraints.gridy = 0;
		afstandPanel.add(autoText, constraints);
		tankbeurtPanel.add(auto2Text, constraints);
		
		constraints.gridx = 1;
		afstandPanel.add(auto, constraints);
		tankbeurtPanel.add(auto2, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 1;
		afstandPanel.add(afstandText, constraints);
		tankbeurtPanel.add(litersText, constraints);
		
		constraints.gridx = 1;
		afstandPanel.add(afstand, constraints);
		tankbeurtPanel.add(liters, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		tankbeurtPanel.add(prijsText, constraints);
		
		constraints.gridx = 1;
		afstandPanel.add(ingevenButton, constraints);
		tankbeurtPanel.add(prijs, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 3;
		tankbeurtPanel.add(ingeven2Button, constraints);

		//afstandPanel.add(uitloggenButton);
        
		tabbedPanel.addTab("Afstand", afstandPanel);
        tabbedPanel.addTab("Tankbeurt", tankbeurtPanel);
        tabbedPanel.addTab("Uitloggen", uitloggenButton);
		
        this.add(tabbedPanel);
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
