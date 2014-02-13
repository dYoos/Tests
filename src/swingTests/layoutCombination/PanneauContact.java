package swingTests.layoutCombination;

import java.awt.*;
import javax.swing.*;

public class PanneauContact extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static String[] TITRES = { "Mr", "Mme", "Melle" };
	private JComboBox<String> saisieTitre = new JComboBox<>(TITRES);
	private JTextField saisieNom = new JTextField(10);
	private JTextField saisiePrenom = new JTextField(10);
	private JTextArea saisieAdresse = new JTextArea(4, 20);

	public PanneauContact() {
		JPanel panneauLabels = new JPanel(new GridLayout(4, 1, 5, 5));
		panneauLabels.add(new JLabel("Titre :"));
		panneauLabels.add(new JLabel("Nom :"));
		panneauLabels.add(new JLabel("Pr\u00e9nom :"));
		panneauLabels.add(new JLabel("Adresse :"));

		JPanel panneauSaisie = new JPanel(new GridLayout(4, 1, 5, 5));
		panneauSaisie.add(this.saisieTitre);
		panneauSaisie.add(this.saisieNom);
		panneauSaisie.add(this.saisiePrenom);

		setLayout(new BorderLayout(5, 5));
		add(panneauLabels, BorderLayout.WEST);
		add(panneauSaisie, BorderLayout.CENTER);
		add(new JScrollPane(saisieAdresse), BorderLayout.SOUTH);
	}

	public String getTitre() {
		return this.saisieTitre.getItemAt(this.saisieTitre.getSelectedIndex());
	}

	public String getNom() {
		return this.saisieNom.getText();
	}

	public String getPrenom() {
		return this.saisiePrenom.getText();
	}

	public String getAdresse() {
		return this.saisieAdresse.getText();
	}

	public static void main(String[] args) {

		PanneauContact panneau = new PanneauContact();

		int reponse = JOptionPane.showConfirmDialog(null, panneau, "Contact",
				JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

		if (reponse == JOptionPane.OK_OPTION) {
			String message = "Contact :\n" + panneau.getTitre() + ". "
					+ panneau.getPrenom() + " " + panneau.getNom() + "\n"
					+ panneau.getAdresse();

			JOptionPane.showMessageDialog(null, message);
		}
	}
}
