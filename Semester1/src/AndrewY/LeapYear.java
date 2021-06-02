package AndrewY;

public class LeapYear {
	private int year;
	public LeapYear(int y) {
		year = y;
	}
	public boolean isLeapYear(){
		int y = year;
        if(y % 4 == 0) {
        	if (y < 1582)
        		return true;
        	else if( y % 100 == 0) {
            	if ( y % 400 == 0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
        else
            return false;

	}
	public String getResult() {
		if (isLeapYear()) {
			return "The year " + year + " is a leap year";
		}
		return "The year " + year + " is not a leap year";
	}
}
