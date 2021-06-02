package AndrewY;

public class SodaCanTest {

	public static void main(String[] args) {
		int amount = 0;
		EasyReader file = new EasyReader("pop.dat");
		String soda1 = file.readWord();
		int ID1 = file.readInt();
		int inv1 = file.readInt();
		String soda2 = file.readWord();
		int ID2 = file.readInt();
		int inv2 = file.readInt();
		String soda3 = file.readWord();
		int ID3 = file.readInt();
		int inv3 = file.readInt();
		String soda4 = file.readWord();
		int ID4 = file.readInt();
		int inv4 = file.readInt();
		SodaCan pop1 = new SodaCan(soda1, ID1, inv1);
		SodaCan pop2 = new SodaCan(soda2, ID2, inv2);
		SodaCan pop3 = new SodaCan(soda3, ID3, inv3);
		SodaCan pop4 = new SodaCan(soda4, ID4, inv4);
		int id = file.readInt();
		while(id != 0) {
			amount = file.readInt();
			if (id == 1) {
				pop1.adjustInventory(amount);
			}
			else if (id == 2) {
				pop2.adjustInventory(amount);
			}
			else if (id == 3) {
				pop3.adjustInventory(amount);
			}
			else {
				pop4.adjustInventory(amount);
			}
			id = file.readInt();
		}
		System.out.println("Soft Drink    ID    Transactions    Inventory");
		System.out.println("---------    ---    ------------    -----------");
		System.out.println(EasyFormat.format(pop1.getName(), 10, 'L', 1) + EasyFormat.format(pop1.getID(), 5) + EasyFormat.format(pop1.getTransactions(), 12) +  EasyFormat.format(pop1.getInventory(), 15));
		System.out.println(EasyFormat.format(pop2.getName(), 10, 'L', 1) + EasyFormat.format(pop2.getID(), 5) + EasyFormat.format(pop2.getTransactions(), 12) +  EasyFormat.format(pop2.getInventory(), 15));
		System.out.println(EasyFormat.format(pop3.getName(), 10, 'L', 1) + EasyFormat.format(pop3.getID(), 5) + EasyFormat.format(pop3.getTransactions(), 12) + EasyFormat.format(pop3.getInventory(), 15));
		System.out.println(EasyFormat.format(pop4.getName(), 10, 'L', 1) + EasyFormat.format(pop4.getID(), 5) + EasyFormat.format(pop4.getTransactions(), 12) + EasyFormat.format(pop4.getInventory(), 15));
		System.out.println(EasyFormat.format("-------", 43));
		System.out.println("Total Inventory" + EasyFormat.format((pop1.getInventory()+pop2.getInventory()+pop3.getInventory()+pop4.getInventory()), 28));
	}

}
