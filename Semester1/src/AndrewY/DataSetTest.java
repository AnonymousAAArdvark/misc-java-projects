package AndrewY;
public class DataSetTest {
	public static void main(String[] args) {
		EasyReader kboard = new EasyReader();
		DataSet Ds = new DataSet();
		System.out.println("Please enter 4 numbers (separated by an enter press): ");
		int temp = kboard.readInt();
		Ds.addValue(temp);
		temp = kboard.readInt();
		Ds.addValue(temp);
		temp = kboard.readInt();
		Ds.addValue(temp);
		temp = kboard.readInt();
		Ds.addValue(temp);
		System.out.println("Largest: " + Ds.getLargest() + "\n" + "Smallest: " + Ds.getSmallest());
	}
}
