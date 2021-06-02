package AndrewY;

public class PopcornTest {
	public static void main(String[] args) {
		EasyReader file = new EasyReader("Popcorn.dat");
		int numFarms = file.readInt();
		System.out.println("         " + EasyFormat.format("Popcorn Co-Op", 32));
		System.out.println(EasyFormat.format("Production in", 41));
		System.out.println("Farm Name" + EasyFormat.format("Thousands of", 31, 'R', 1));
		System.out.println(EasyFormat.format("Pint Jars per Acre", 46, 'R', 1));
		System.out.println(EasyFormat.format("   1   2   3   4   5   6", 52));
		System.out.println(EasyFormat.format("   |   |   |   |   |   |", 52));
		System.out.print(EasyFormat.format("-- |-- |-- |-- |-- |-- |", 52));

		for (int i = 0; i < numFarms; i++) {
			String farmName = "";
			char name = file.readChar();
			while (name != '*') {
				farmName += name;
				name = file.readChar();
			}
			double acres = file.readDouble();
			double jars = file.readDouble();
			file.readChar();
			Popcorn pop = new Popcorn();
			pop.setAcres(acres);
			pop.setJars(jars);
			pop.setName(farmName);
			System.out.print(EasyFormat.format(farmName, 30, 'L', 0) + pop.makeBars());
		}
		
	}
}
