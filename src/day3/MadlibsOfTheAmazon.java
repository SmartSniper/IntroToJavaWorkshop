package day3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	public static void main(String[] args) {

		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
String inputAdjective = JOptionPane.showInputDialog("Enter an adjective.");
		// Get the user to enter a type of liquid
String inputLiquid = JOptionPane.showInputDialog("Enter a liquid.");
		// Get the user to enter a body part
String inputBody_Part = JOptionPane.showInputDialog("Enter a bodypart.");
		// Get the user to enter a verb
String inputVerb = JOptionPane.showInputDialog("Enter a verb");
		// Get the user to enter a place
String inputPlace = JOptionPane.showInputDialog("Enter a place.");
		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line.
		JOptionPane.showMessageDialog(null, "Piranhas are more "+ inputAdjective + " du"
				+ "ring the day, so cross the river at night. Piranhas are attracted to fresh " + inputLiquid + " and will mostlikely take a bite of your "
						+ inputBody_Part + " if you " + inputVerb + " Whatever you do, if you have an open wound, try to find another way to get back to the "
						+ inputPlace +". Good luck!");

	}
}

