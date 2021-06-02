package AndrewY;

public class stringComparerTest {
	public static void main(String[] args) {
		EasyReader kboard = new EasyReader();
		stringComparer comp = new stringComparer();
		System.out.print("Enter 4 strings: ");
		String temp = kboard.readWord();
		comp.addString(temp);
		temp = kboard.readWord();
		comp.addString(temp);
		temp = kboard.readWord();
		comp.addString(temp);
		temp = kboard.readWord();
		comp.addString(temp);
		System.out.println("\n The lexicographic minimum is " + comp.getMinString());
		System.out.println("\n The lexicographic maximum is " + comp.getMaxString());
	}
}
