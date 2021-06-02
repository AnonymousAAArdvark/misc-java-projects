package AndrewY;

public class QuadraticEquationTest {
	public static void main(String[] args) {
		EasyReader kboard = new EasyReader();
		System.out.print("Enter the coefficients of a quadratic: ");
		double num1 = kboard.readDouble();
		double num2 = kboard.readDouble();
		double num3 = kboard.readDouble();
		System.out.println("\nEquation: " + num1 + "x^2 + " + num2 + "x + " + num3);
		QuadraticEquation myEq = new QuadraticEquation(num1, num2, num3);
		if (myEq.hasSolution() == true)
			System.out.println("Roots: " + myEq.getSolution1() + " and " + myEq.getSolution2());
		else
			System.out.println("no real roots");
	}
}
