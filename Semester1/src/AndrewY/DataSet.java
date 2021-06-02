package AndrewY;

public class DataSet {
	private int max;
	private int min;
	public DataSet() {
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
	}
	void addValue(int x) {
		if (max < x)
			max = x;
		if (min > x)
			min = x;
	}
	int getLargest() {
		return max; 
	}
	int getSmallest() {
		return min;
	}
}
