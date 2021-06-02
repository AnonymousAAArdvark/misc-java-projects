package AndrewY;

public class Apartment {
	private String name;
	private char[] pref;
	public Apartment(String n, char[] p) {
		pref = new char[30];
		name = n;
		pref = p;
	}
	public char[] getPref() {
		return pref;
	}
	public String getName() {
		return name;
	}
	public int cmpApartment(char[] customer) {
		int sameFeatures = 0;
		for(int i = 0; i < customer.length; i++) {
			if(customer[i] == pref[i]) {
				sameFeatures++;
			}
		}
		return sameFeatures;
	}
}
