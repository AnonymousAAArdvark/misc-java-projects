package AndrewY;

public class ThreeNumbers {
	public double largest;
	public double smallest;
	public double middle;
	public ThreeNumbers(double a, double b, double c) {
        if (a > b && a > c) {
        	largest = a;
        	if (b > c) {
        		middle = b;
        		smallest = c;
        	}
        	else {
        		middle = c;
        		smallest = b;
        	}
        }
        else if (a > b && a < c) {
        	middle = a;
        	largest = c;
        	smallest = b;
        }
        else if (a < b && a < c) {
        	smallest = a;
        	if (b > c) {
        		largest = b;
        		middle = c;
        	}
        	else {
        		largest = c;
        		middle = b;
        	}
        }
        else if (a < b && a > c) {
        	middle = a;
        	largest = b;
        	smallest = c;
        }
	}
	public double getLargest() {
		return largest;
	}
	public double getMiddle() {
		return middle;
	}
	public double getSmallest() {
		return smallest;
	}
}
