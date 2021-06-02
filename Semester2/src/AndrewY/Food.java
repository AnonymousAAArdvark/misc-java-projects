package AndrewY;

public class Food {
	private String name;
	private int barcode;
	private double price;
	private boolean taxable;
	private final double tax;
	public Food(String input) {
		String[] a = input.split("\\*");
		name = a[0];
		barcode = Integer.parseInt(a[1]);
		price = Double.parseDouble(a[2]);
		if(a[3].equals("F")) {
			taxable = false;
		}
		else {
			taxable = true;
		}
		tax = .08;
	}
	public String getName() {
		return name;
	}
	public double getTax() {
		if(taxable) {
			return (double) Math.round(price * tax * 100) / 100;
		}
		return 0;
	}
	public int getBarcode() {
		return barcode;
	}
	public double getPrice() {
		return price;
	}
	public boolean isTaxable() {
		return taxable;
	}
	
}
