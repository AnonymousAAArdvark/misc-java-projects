package AndrewY;

public class BarChart {
	private int min;
	private int max;
	private int numScores;
	private double totalScores;
	private double sqrScores;
	private int numA;
	private int numB;
	private int numC;
	private int numD;
	private int numF;
	public BarChart() {
		min = -1; max = 0; numScores = 0;
		totalScores = 0; sqrScores = 0; 
		numA = 0; numB = 0; numC = 0; numD = 0; numF = 0;
	}
	int getNumScores() {
		return numScores;
	}
	int getMax() {
		return max;
	}
	int getMin() {
		return min;
	}
	double getTotalScores() {
		return totalScores;
	}
	double stdDeviation() {
		double top = (sqrScores - (totalScores*totalScores)/(numScores));
		double bottom = (numScores - 1);
		return Math.round(Math.sqrt(top/bottom)*100.0)/100.0;
	}
	void addScore(int score) {
		numScores++; 
		totalScores += score; 
		sqrScores += Math.pow(score, 2); 
		if (score > max) 
			max = score;
		if (min == -1 || score < min) 
			min = score;
		if (score < 60)
			numF++;
		else if (score < 70)
			numD++;
		else if (score < 80)
			numC++;
		else if (score < 90)
			numB++;
		else 
			numA++;
	}
	String makeBar(char letter) {
		int value = 0;
		if (letter == 'A') 
			value = numA;
		else if (letter == 'B') 
			value = numB;
		else if (letter == 'C') 
			value = numC;
		else if (letter == 'D') 
			value = numD;
		else
			value = numF;
		String bar = "";
		for (int i = 0; i < value; i++) 
			bar = bar + "*";
		if (bar.length() > 10) 
			bar = bar.substring(0, 9) + "|" + bar.substring(10);
		else 
			bar = EasyFormat.format(bar, 9, 'L', 0) + "|";
		if (bar.length() > 20)
			bar = bar.substring(0, 19) + "|" + bar.substring(20);
		else 
			bar = EasyFormat.format(bar, 19, 'L', 0) + "|";
		if (bar.length() > 30) 
			bar = bar.substring(0, 29) + "|" + bar.substring(30);
		else 
			bar = EasyFormat.format(bar, 29, 'L', 0) + "|";
		if (bar.length() > 40) 
			bar = bar.substring(0, 39) + "|" + bar.substring(40);
		else 
			bar = EasyFormat.format(bar, 39, 'L', 0) + "|";
		return letter + ": " + bar;
	}
}
