package AndrewY;

public class ApartmentTest {

	public static void main(String[] args) {
		EasyReader readCust = new EasyReader("CUST.DAT");
		EasyReader readApt = new EasyReader("APT.DAT");
		char[] custArr = new char[30];
		String custName = "";
		for(int i = 0; i < custArr.length; i++) {
			custArr[i] = readCust.readChar();
		}
		custName = readCust.readLine();
		Customer myCust = new Customer(custName, custArr);
		System.out.println("For: " + myCust.getName() + '\n');
		char[] aptArr = new char[30];
		String aptName = "";
		int aptNum = readApt.readInt();
		readApt.readChar(); //dummy reads
		readApt.readChar();
		System.out.println("Adress                Number of Matches     % Response");
		System.out.println("------------------    -----------------     ----------");
		for(int i = 0; i < aptNum; i++) {
			for(int j = 0; j < aptArr.length; j++) {
				aptArr[j] = readApt.readChar();
			}
			aptName = readApt.readLine();
			Apartment myApt = new Apartment(aptName, aptArr);
			System.out.print(EasyFormat.format(myApt.getName(), 22, 'L', 0));
			System.out.print(EasyFormat.format("" + myApt.cmpApartment(myCust.getPref()), 19, 'L', 0));
			if((double)(myApt.cmpApartment(myCust.getPref()))/30 >= .8) {
				System.out.println("   Possible");
			}
			else {
				System.out.println("   Not Possible");
			}
		}
	}

}
