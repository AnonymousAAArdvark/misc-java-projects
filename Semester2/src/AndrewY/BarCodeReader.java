package AndrewY;
import java.util.ArrayList;
import java.text.DecimalFormat;
public class BarCodeReader {

	public static void main(String[] args) {
		ArrayList<Food> food = new ArrayList<>();
		EasyReader foodFile = new EasyReader("Food.dat");
		EasyReader orderFile = new EasyReader("Order.dat");
		String read = foodFile.readLine();
		while(read != null) {
			food.add(new Food(read));
			read = foodFile.readLine();
		}
		System.out.println("   Quickie Mart Food Store\n");
		int order = orderFile.readInt();
		while(order != -1) {
			double subtotal = 0;
			double tax = 0;
			double total = 0;
			while(order != 0) {
				boolean found = false;
				for(Food item : food) {
					if(item.getBarcode() == order) {
						System.out.println(item.getName() + EasyFormat.format(item.getName(), 20, 'L', 0).substring(item.getName().length()).replaceAll(" ", ".")
										+ "$" + EasyFormat.format(item.getPrice(), 6));
						subtotal += item.getPrice();
						tax += item.getTax();
						total += item.getPrice() + item.getTax();
						found = true;
					}
				}
				if(!found) {
					System.out.println("no such product");
				}
	 			order = orderFile.readInt();
			}
			DecimalFormat df2 = new DecimalFormat("#.00");
			System.out.println("");
			System.out.println(EasyFormat.format("subtotal", 20, 'L', 0).replaceAll(" ", ".") + "$" + EasyFormat.format(df2.format(subtotal), 6));
			System.out.println(EasyFormat.format("tax", 20, 'L', 0).replaceAll(" ", ".") + "$" + EasyFormat.format(df2.format(tax), 6));
			System.out.println(EasyFormat.format("total", 20, 'L', 0).replaceAll(" ", ".") + "$" + EasyFormat.format(df2.format(total), 6));
			System.out.println("");
			order = orderFile.readInt();
		}
	}
}
