package AndrewY;

import java.util.ArrayList;
import java.util.Collections;

public class PoliceSearchTestSort {
	public static void main(String[] args) {
		ArrayList<People> people = new ArrayList<>();
		EasyReader infoFile = new EasyReader("INFO.dat");
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
		System.out.println("\nBefore sort:");
		for(People p : people) {
			System.out.println(p.getFirst() + " " + p.getLast());
		}
		Collections.sort(people);
		System.out.println("\nAfter sort:");
		for(People p : people) {
			System.out.println(p.getFirst() + " " + p.getLast());
		}
	}
}
