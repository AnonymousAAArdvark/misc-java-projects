package AndrewY;
import java.util.ArrayList;
import java.util.Collections;

public class SortTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		EasyReader file = new EasyReader("names.dat");
		String read = file.readLine();
		while(read != null) {
			list.add(read);
			read = file.readLine();
		}
		System.out.println("Unsorted Order: \n");
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("\nSorted Order: \n");
		Collections.sort(list);
		for(String s : list) {
			System.out.println(s);
		}
	}

}
