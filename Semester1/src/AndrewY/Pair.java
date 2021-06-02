package AndrewY;

public class Pair {
	private int num1;
	private int num2;
	public Pair(double first, double second) { 
		num1 = (int)first;
		num2 = (int)second;
	}
	public double getSum() {
		return num1 + num2;
	}
	public double getDiff() {
		return num1 - num2;
	}
	public double getProd() {
		return num1 * num2;
	}
	public double getAvg() {
		return (num1 + num2) / 2;
	}
	public double getDistance() {
		return Math.abs(getDiff());
	}
	public double getMax() {
		if (num1 < num2) {
			return num2;
		}
		else {
			return num1;
		}
	}
	public double getMin() {
		if (num1 < num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
	
}