package AndrewY;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PoliceSearchTest {
	public static void main(String[] args) {
		ArrayList<People> people = new ArrayList<>();
		ArrayList<Items> items = new ArrayList<>();
		EasyReader infoFile = new EasyReader("INFO.dat");
		EasyReader stuffFile = new EasyReader("STUFF.dat");
		String read = infoFile.readWord();
		while(read != null) {
			people.add(new People());
			people.get(people.size() - 1).setID(read);
			read = infoFile.readWord();
			people.get(people.size() - 1).setFirst(read);
			read = infoFile.readWord();
			people.get(people.size() - 1).setLast(read);
			read = infoFile.readWord();
			people.get(people.size() - 1).setPhone(read);
			read = infoFile.readWord();
		}
		read = stuffFile.readWord();
		while(read != null) {
			items.add(new Items());
			items.get(items.size() - 1).setID(read);
			stuffFile.readChar();
			read = stuffFile.readLine();
			items.get(items.size() - 1).setDesc(read);
			read = stuffFile.readWord();
		}
		boolean found = false;
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		System.out.println("Police Report                                                Date " + dateFormat.format(date));
		System.out.println("----------------------------------------------------------------------------");
		for(Items item : items) {
			found = false;
			for(People person : people) {
				if(item.getID().equals(person.getID())) {
					System.out.println(EasyFormat.format("Owner: " + person.getFirst() + " " + person.getLast(), 26, 'L', 0) + EasyFormat.format(item.getDesc(), 38, 'L', 0) + "     " + item.getID());
					found = true;
				}
			}
			if(!found) {
				System.out.println(EasyFormat.format("Owner: NO MATCH ", 26, 'L', 0) + EasyFormat.format(item.getDesc(), 38, 'L', 0) + "     " + item.getID());
			}
		}
	}
}
