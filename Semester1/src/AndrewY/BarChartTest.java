package AndrewY;

public class BarChartTest {

	public static void main(String[] args) {
		BarChart myChart = new BarChart();
		int counter = 0;
		EasyReader file = new EasyReader("Scores.dat");
		System.out.println("Summary of test score data\n");
		int value = file.readInt();
		while (value != -1) {
			myChart.addScore(value);
			System.out.print(value + " ");
			counter++;
			if(counter >= 20) {
				System.out.print('\n');
				counter = 0;
			}
			value = file.readInt();
		}
		System.out.println("\nThe number of scores: " + myChart.getNumScores());
		System.out.println("The number of average score: " + Math.round((myChart.getTotalScores()/myChart.getNumScores())*100.0)/100.0);
		System.out.println("The maximum score: " + myChart.getMax());
		System.out.println("The minimum score: " + myChart.getMin());
		System.out.println("The standard deviation: " + myChart.stdDeviation() + "\n\n");
		System.out.println("Bar Chart");
		System.out.println("           10        20        30        40");
		System.out.println("            |         |         |         |");

		System.out.println(myChart.makeBar('A'));
		System.out.println(myChart.makeBar('B'));
		System.out.println(myChart.makeBar('C'));
		System.out.println(myChart.makeBar('D'));
		System.out.println(myChart.makeBar('F'));
		System.out.println("            |         |         |         |");
		System.out.println("           10        20        30        40");
	}

}
