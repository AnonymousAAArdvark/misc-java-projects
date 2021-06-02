package AndrewY;

import javax.swing.JOptionPane;

public class ClackerTest {

	public static void main(String[] args) {
		Clacker myClacker = new Clacker();
		JOptionPane.showMessageDialog(null, "The game of Clacker is...					Let's play:\n"
										  + "Numbers to cover\n"
										  + myClacker.displayBoard()
										  + "\nPress OK to \"roll the dice\"");
		boolean endGame = myClacker.isGameOver();
		while(!endGame) {
			myClacker.throwDie();
			String input = JOptionPane.showInputDialog("The number of throws is: " + myClacker.getTosses() + "\nYou roll a " + myClacker.getThrow1() + " and a " + myClacker.getThrow2()
			 + "\nWhat would you want to cover: \nindividual values (type I), or the total (type T)?");
			while(!input.equals("I") && !input.equals("T") && !input.equals("i") && !input.equals("t")) {
				JOptionPane.showMessageDialog(null,  "Please enter either \"I\" or \"T\"");
				input = JOptionPane.showInputDialog("The number of throws is: " + myClacker.getTosses() + "\nYou roll a " + myClacker.getThrow1() + " and a " + myClacker.getThrow2()
				 + "\nWhat would you want to cover: \nindividual values (type I), or the total (type T)?");
			}
			char c = input.toUpperCase().charAt(0);
			myClacker.place(c);
			JOptionPane.showMessageDialog(null, "Numbers to cover\n"
					  + myClacker.displayBoard()
					  + "\nPress OK to \"roll the dice\"");
			endGame = myClacker.isGameOver();
		}
		JOptionPane.showMessageDialog(null, "Game is done!\n"
				+ "Your total number of tosses was: " + myClacker.getTosses());
	}

}
