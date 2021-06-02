package AndrewY;
import java.io.*;

public class ThreeNumbersTest {
	public static void main(String[] args) throws IOException {
		double a;
		double b;
		double c;
        EasyReader file = new EasyReader("Numbers.dat");
		a = file.readDouble();
		b = file.readDouble();
		c = file.readDouble();
        System.out.println("Set of inputs: " + a + "	" + b + "	" + c);
        ThreeNumbers myNums = new ThreeNumbers(a, b, c);
        System.out.println("Sorted inputs: " + myNums.getSmallest() + "	" + myNums.getMiddle() + "	" + myNums.getLargest());
		a = file.readDouble();
		b = file.readDouble();
		c = file.readDouble();
        System.out.println("Set of inputs: " + a + "	" + b + "	" + c);
        myNums = new ThreeNumbers(a, b, c);
        System.out.println("Sorted inputs: " + EasyFormat.format(myNums.getSmallest(), 3, 1) + "	" + myNums.getMiddle() + "	" + myNums.getLargest());
		a = file.readDouble();
		b = file.readDouble();
		c = file.readDouble();
        System.out.println("Set of inputs: " + a + "	" + b + "	" + c);
        myNums = new ThreeNumbers(a, b, c);
        System.out.println("Sorted inputs: " + myNums.getSmallest() + "	" + myNums.getMiddle() + "	" + myNums.getLargest());
	}
}
