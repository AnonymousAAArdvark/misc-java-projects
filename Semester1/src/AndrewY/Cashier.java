package AndrewY;

public class Cashier {
	private final double DOLLAR_VALUE = 1.0;
	private final double QUARTER_VALUE = .25;
	private final double DIME_VALUE = .1;
	private final double NICKEL_VALUE = .05;
	private int dollars;
	private int quarters;
	private int dimes;
	private int nickels;
	private int pennies;
	private double change;
	public Cashier(double d, double r) {
		this.change = r - d;
	}
	public int getDollars() {
		return (int)(change / DOLLAR_VALUE);
	}
	public int getQuarters() {
		return (int)(change / QUARTER_VALUE);
	}
	public int getDimes() {
		return (int)(change / DIME_VALUE);
	}
	public int getNickels() {
		return (int)(change / NICKEL_VALUE);
	}
	public int getPennies() {
		return (int)(change / .01);
	}
	public void removeChange(double a) {
		change = Math.round((change % a) * 100.0) / 100.0;
	}
	public String giveChange() {
		dollars = getDollars();
		removeChange(DOLLAR_VALUE);
		quarters = getQuarters();
		removeChange(QUARTER_VALUE);
		dimes = getDimes();
		removeChange(DIME_VALUE);
		nickels = getNickels();
		removeChange(NICKEL_VALUE);
		pennies = getPennies();
		removeChange(.01);
		return dollars + " dollars" + "\n" + quarters + " quarters" + "\n" + dimes + " dimes" + "\n" + nickels + " nickels" + "\n" + pennies + " pennies";
	}
}
