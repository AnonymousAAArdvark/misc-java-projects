package AndrewY;
import javax.swing.JOptionPane;

public class EasterTest {
	public static void main(String[] args) {
		int year = Integer.parseInt(JOptionPane.showInputDialog(null, "Easter Sunday for "));
		Easter myEaster = new Easter(year);
		JOptionPane.showMessageDialog(null,  "Easter Sunday for " + year + "\n    month: " + myEaster.getEasterSundayMonth() + "\n    date: " + myEaster.getEasterSundayDay());
		year = Integer.parseInt(JOptionPane.showInputDialog(null, "Easter Sunday for "));
		Easter myEaster2 = new Easter(year);
		JOptionPane.showMessageDialog(null,  "Easter Sunday for " + year + "\n    month: " + myEaster2.getEasterSundayMonth() + "\n    date: " + myEaster2.getEasterSundayDay());
	}
}
