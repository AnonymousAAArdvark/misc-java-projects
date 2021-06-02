package AndrewY;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class PersonTest {

	public static void main(String[] args) {
		ArrayList<Person> People = new ArrayList<>();
		EasyReader file = new EasyReader("shareholders.dat");
		ArrayList<Person> Denied = new ArrayList<>();
		String r = file.readLine();
		while(r != null) {
			People.add(new Person(r));
			r = file.readLine();
		}
		Collections.sort(People);
		r = JOptionPane.showInputDialog(null, "Please Enter Your Name in the Form (Last, First): ");
		int accepted = 0, denied = 0;
		while(!r.equals("EXIT")) {
			Person temp = new Person(r);
			int location = Collections.binarySearch(People, temp);
			if(location >= 0) {
				accepted++;
				JOptionPane.showMessageDialog(null, "Welcome, " + temp.getFirst() + " " + temp.getLast());
				People.get(location).setAttended(true);
			}
			else {
				JOptionPane.showMessageDialog(null, "Access Denied");
				Denied.add(temp);
				denied++;
			}
			/*int first = 0, last = People.size()-1, mid = (first + last)/2;
			while(first <= last) {
				if(temp.compareTo(People.get(mid)) > 0) {
					first = mid + 1;
				}
				else if(temp.compareTo(People.get(mid)) == 0) {
					accepted++;
					JOptionPane.showMessageDialog(null, "Welcome, " + temp.getFirst() + " " + temp.getLast());
					People.get(mid).setAttended(true);
					break;
				}
				else {
					last = mid - 1;
				}
				mid = (first + last)/2;
			}
			if(first > last) {
				JOptionPane.showMessageDialog(null, "Access Denied");
				Denied.add(temp);
				denied++;
			}*/
			r = JOptionPane.showInputDialog(null, "Please Enter Your Name in the form(Last, First): ");
		}
		JOptionPane.showMessageDialog(null, "Stockholders in roster: " + People.size() + "\nStockholders present: " + accepted + 
				"\nStockholders denied: " + denied);
		String result = "", den = "";
		for(Person p : People) {
			if(p.isAttended()) {
				result += '\n' + p.toString();
			}
		}
		for(Person p : Denied) {
			den += '\n' + p.toString();
		}
		JOptionPane.showMessageDialog(null,  "List of Present Stockholders: " + result);
		JOptionPane.showMessageDialog(null,  "List of Denied Stockholders: " + den);
	}

}
