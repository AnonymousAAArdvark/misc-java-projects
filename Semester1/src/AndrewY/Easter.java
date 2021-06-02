package AndrewY;

public class Easter {
	private int p;
	private int n;
	private int year;
	public Easter(int y) {
		year = y;
	}
	public int getEasterSundayDay() {
        return p;
	}
	public String getEasterSundayMonth() {
        int a = year % 19,
                b = year / 100,
                c = year % 100,
                d = b / 4,
                e = b % 4,
                g = (8 * b + 13) / 25,
                h = (19 * a + b - d - g + 15) % 30,
                j = c / 4,
                k = c % 4,
                m = (a + 11 * h) / 319,
                r = (2 * e + 2 * j - k - h + m + 32) % 7;
            n = (h - m + r + 90) / 25;
            p = (h - m + r + n + 19) % 32;
        String months = "January Feburary March April May June July August September October November December";
		String result = "";
		
        switch(n) {
        case 1:
        	result = months.substring(0, 7);
        	break;
        case 2:
        	result = months.substring(8, 16);
        	break;
        case 3:
        	result = months.substring(17, 22);
        	break;
        case 4:
        	result = months.substring(23, 28);
        	break;
        case 5:
        	result = months.substring(29, 32);
        	break;
        case 6:
        	result = months.substring(33, 37);
        	break;
        case 7:
        	result = months.substring(38, 42);
        	break;
        case 8: 
        	result = months.substring(43, 49);
        	break;
        case 9:
        	result = months.substring(50, 59);
        	break;
        case 10:
        	result = months.substring(60, 66);
        	break;
        case 11:
        	result = months.substring(67, 75);
        	break;
        case 12:
        	result = months.substring(76, 84);
        	break;
        default:
            result = "error (no month found)";
        }
       return result;
	}
}
