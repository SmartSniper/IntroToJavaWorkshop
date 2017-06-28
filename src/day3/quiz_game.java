package day3;

import javax.swing.JOptionPane;

public class quiz_game {
	public static void main(String[] args) {
		
	
	int score = 0;
	String question1 = JOptionPane.showInputDialog("What is 23 x 45?");
	String question2 = JOptionPane.showInputDialog("What is 20 + 2?");
	String question3 = JOptionPane.showInputDialog("What is 12 x 12?");
	String question4 = JOptionPane.showInputDialog("what is 1563 + 4532?");
	String question5 = JOptionPane.showInputDialog("What is 4589 x 2398?");
	String question6 = JOptionPane.showInputDialog("What is 34 x 56?");
	String question7 = JOptionPane.showInputDialog("What is 457234987 - 234423?");
	if(question1.equals("1035")){
		score ++;
	}
	if(question2.equals("22")){
		score++;
	}
	if(question3.equals("144")){
		score++;
	}
	if(question4.equals("6095")){
		score++;
	}
	if(question5.equals("11004422")){
		score++;
	}
	if(question6.equals("1904")){
		score++;
	}
	if(question7.equals("457000564")){
		score++;
	}
	String scoreNum = "" + score;
	JOptionPane.showMessageDialog(null, "You got " + scoreNum + " correcy out of 7");
	}
}
