package AndrewY;

public class stringComparer {
	public String max;
	public String min;
	public stringComparer() {
		max = null;
		min = null;
	}
	public void addString(String s) {	
		if (max == null || s.compareTo(max) > 0) {
			max = s;
		}
		else if (min == null || s.compareTo(min) < 0) {
			min = s;
		}
	}
	public String getMaxString() {
		return max;
	}
	public String getMinString() {
		return min;
	}
}
