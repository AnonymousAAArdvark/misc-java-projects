package AndrewY;

public class QuadraticEquation {
	public double a;
	public double b;
	public double c;
	public double discriminant;
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.discriminant = b * b - 4 * a * c;
	}
	public double getSolution1() {
		return (-b + Math.sqrt(discriminant))/(2 * a);
	}
	public double getSolution2() {
		return (-b - Math.sqrt(discriminant))/(2 * a);
	}
	public boolean hasSolution() {
		if (discriminant >= 0)
			return true;
		else 
			return false;
	}
}
