package AndrewY;

import javax.swing.JOptionPane;

public class PairTest {
	public static void main(String[] args) {
		double temp;
		double temp2;
		temp = Double.parseDouble(JOptionPane.showInputDialog(null," Your first number: "));
		temp2 = Double.parseDouble(JOptionPane.showInputDialog(null," Your second number: "));
		Pair myPair = new Pair(temp, temp2);
 		JOptionPane.showMessageDialog(null, myPair.getSum() + "\n" + myPair.getDiff() + "\n" + myPair.getProd() 
 				+ "\n" + myPair.getAvg() + "\n" + myPair.getDistance() + "\n" + myPair.getMax()
 				+ "\n" + myPair.getMin());
	}

}
