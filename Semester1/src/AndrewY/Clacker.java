package AndrewY;

public class Clacker {
	private boolean[] nums;
	private int throw1;
	private int throw2;
	private int numTosses;
	public Clacker() {
		nums = new boolean[13];
		throw1 = 0;
		throw2 = 0;
		numTosses = 0;
	}
	int getTosses() {
		return numTosses;
	}
	int getThrow1() {
		return throw1;
	}
	int getThrow2() {
		return throw2;
	}
	void throwDie() {
		throw1 = (int)(Math.random()*6+1);
		throw2 = (int)(Math.random()*6+1);
		numTosses++;
	}
	String displayBoard() {
		String board = "";
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] == false) {
				board += i + " ";
			}
			else {
				board += "   ";
			}
		}
		return board;
	}
	void place(char c) {
		if(c == 'I') {
			nums[throw1] = true;
			nums[throw2] = true;
		}
		else {
			nums[throw1 + throw2] = true;
		}
	}
	boolean isGameOver() {
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] == false)
				return false;
		}
		return true;
	}
}
