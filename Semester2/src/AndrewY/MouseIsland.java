package AndrewY;

public class MouseIsland {
	private int[][] island;
	private int mRow;
	private int mCol;
	private final int PERCENT_BRIDGES = 30;
	private boolean onboard;
	private boolean starved;
	private boolean drowned;
	public MouseIsland() {
		island = new int[10][15];
		mRow = 10/2;
		mCol = 15/2;
		onboard = false;
		starved = false;
		drowned = false;
		InitIsland();
	}
	public void InitIsland() {
		for(int i = 0; i < island.length; i++) {
			for(int j = 0; j < island[0].length; j++) {
				if(i == 0 || i == 9 || j == 0 || j == 14) {
					int num = (int) (Math.random() * (100 - 1)) + 1;
					if(num <= PERCENT_BRIDGES)
						island[i][j] = 0;
					else 
						island[i][j] = -1;
				}
			}
		}
	}
	public void moveAbout() {
		int counter = 0;
		int i = 0;
		boolean stopMove = false;
		while(i < 50 && stopMove == false) {
			if(onboard == false && starved == false) {
				int num = (int) (Math.random() * (4)) +1;
				if(num == 1)
					mRow -= 1;
				else if(num == 2)
					mCol += 1;
				else if(num == 3)
					mRow += 1;
				else 
					mCol -= 1;
				if(mRow == 0 || mRow == 9 || mCol == 0 || mCol == 14) {
					if(island[mRow][mCol] == 0) 
						onboard = true;
					else 
						drowned = true;
					stopMove = true;
				}
				else {
					counter++;
					island[mRow][mCol] = counter;
				}
			}
			i++;
		}
		if(onboard == false && drowned == false)
			starved = true;
	}
	public String PrintIsland() {
		String result = "";
		if(onboard == true) 
			result += "The mouse has escaped\n";
		else if(drowned == true)
			result += "The mouse has unfortunately drowned\n";
		else 
			result += "The mouse has run out of food and starved\n";
		for(int i = 0; i < island.length; i++) {
			for(int j = 0; j < island[0].length; j++) {
				if(i == 0 || i == 9 || j == 0 || j == 14) {
					if(island[i][j] == 0)
						result += EasyFormat.format("B", 4);
					else
						result += EasyFormat.format("W", 4);
				}
				else 
					result += EasyFormat.format(island[i][j], 4);
			}
			result += "\n";
		}
		return result;
	}
	public int getResult() {
		if(onboard) {
			return 0;
		}
		if(starved) {
			return 1;
		}
		return 2;
	}
}
