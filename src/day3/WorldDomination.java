package day3;

import javax.swing.JOptionPane;

public class WorldDomination {
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String yesNo_code = JOptionPane.showInputDialog(null, "Do you program?");
		// 2. If they say "yes", tell them they will rule the world.
if(yesNo_code.equalsIgnoreCase("yes")){
	JOptionPane.showMessageDialog(null, "You will rule the world!");
}
		// 3. Otherwise, wish them good luck washing dishes.
else{
	JOptionPane.showMessageDialog(null, "I wish you good luck washing dishes");
}
	}
}

