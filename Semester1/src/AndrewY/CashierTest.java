package AndrewY;

public class CashierTest {

	public static void main(String[] args) {
		EasyReader kboard = new EasyReader();
		System.out.print("Enter the amount due in dollars and cents: $ ");
		double due = kboard.readDouble();
		System.out.print("Enter the amount recieved: $ ");
		double recieved = kboard.readDouble();
		Cashier myCashier = new Cashier(due, recieved);
		System.out.println("Give the customer \n" + myCashier.giveChange());
	}

}
