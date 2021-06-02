package AndrewY;

public class SodaCan {
	private String soda;
	private int ID;
	private int trans;
	private int amount;
	public SodaCan(String soda, int ID, int amount) {
		this.soda = soda;
		this.ID = ID;
		trans = 0;
		this.amount = amount;
	}
	public String getName() {
		return soda;
	}
	public int getID() {
		return ID;
	}
	public int getTransactions() {
		return trans;
	}
	public int getInventory() {
		return amount;
	}
	public void adjustInventory(int amount) {
		this.amount += amount;
		trans++;
	}
}
