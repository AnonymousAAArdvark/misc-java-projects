package AndrewY;

import java.util.ArrayList;
import java.util.Collections;

public class PremiumTest {
	public static void main(String[] args) {
		EasyReader pFile = new EasyReader("PremTable.dat");
		EasyReader cFile = new EasyReader("customer.dat");
		ArrayList<Premiums> prems = new ArrayList<>();
		ArrayList<PCustomer> custs = new ArrayList<>();
		
		String pRead = pFile.readLine();
		while(pRead != null) {
			prems.add(new Premiums(pRead));
			pRead = pFile.readLine();
		}
		String cRead = cFile.readLine();
		while(cRead != null) {
			custs.add(new PCustomer(cRead));
			cRead = cFile.readLine();
		}
		
		System.out.println("Unsorted Data: ");
		System.out.println("Name\t\t\tAge");
		for(PCustomer c : custs) {
			System.out.println(EasyFormat.format(c.getName(), 25, 'L', 0) + c.getAge());
		}
		
		Collections.sort(custs);
		System.out.println("\nSorted Data: ");
		System.out.println("Name\t\t\tAge");
		for(PCustomer c : custs) {
			System.out.println(EasyFormat.format(c.getName(), 25, 'L', 0) + c.getAge());
		}
		
		System.out.println("\nPremium Table: ");
		System.out.println("Name\t\t\tAge\tPremium");
		for(PCustomer c : custs) {
			Premiums test = new Premiums(c.getAge() + " 0");
			int loc = Collections.binarySearch(prems, test);
			if(loc < 0)
				loc = (loc+1)*-1;
			System.out.println(EasyFormat.format(c.getName(), 25, 'L', 0) 
							+ EasyFormat.format("" + c.getAge(), 10, 'L', 0)
							+ prems.get(loc).getPrem());
			
		}
	}
}
