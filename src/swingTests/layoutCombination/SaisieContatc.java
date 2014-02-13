package swingTests.layoutCombination;

import javax.swing.JOptionPane;

public class SaisieContatc {
	

	public static void main(String[] args)
	  {
	    PanneauContact panneau = new PanneauContact();
	    int reponse = JOptionPane.showConfirmDialog(null, panneau,
	                       "Contact", JOptionPane.OK_CANCEL_OPTION,
	                       JOptionPane.PLAIN_MESSAGE);
	    if (reponse == JOptionPane.OK_OPTION)
	      JOptionPane.showMessageDialog(null, "Contact :\n"
	         + panneau.getTitre() + " "
	         + panneau.getPrenom() + " " + panneau.getNom()
	         + "\n" + panneau.getAdresse());
	  }
}
