package AndrewY;

public class LeapYearTest {

	public static void main(String[] args) {
		int year;
        EasyReader file = new EasyReader("dates.dat");
		year = file.readInt();
		LeapYear myYear = new LeapYear(year);
		System.out.println(myYear.getResult());
		year = file.readInt();
		myYear = new LeapYear(year);
		System.out.println(myYear.getResult());
		year = file.readInt();
		myYear = new LeapYear(year);
		System.out.println(myYear.getResult());
		year = file.readInt();
		myYear = new LeapYear(year);
		System.out.println(myYear.getResult());
		year = file.readInt();
		myYear = new LeapYear(year);
		System.out.println(myYear.getResult());
	}

}
