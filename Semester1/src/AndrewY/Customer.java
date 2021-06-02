package AndrewY;

public class Customer {
	private String name;
	private char[] pref = new char[30];
	public Customer(String n, char[] p) {
		name = n;
		pref = p;
	}
	public char[] getPref() {
		return pref;
	}
	public String getName() {
		return name;
	}
 }
