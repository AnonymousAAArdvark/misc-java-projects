package AndrewY;

public class VoyagerTest {
    public static void main(String[] args) {
        EasyReader file = new EasyReader("SPACE.DAT");
        final int rows = 46;
        final int cols = 75;
        char[][] carr = new char[rows+1][cols+1];
        int r=0, c=0;
        char read = file.readChar();
        while(read != '#') {
            if(!Character.isDigit(read)) {
                read = file.readChar();
                continue;
            }
            carr[r][c] = read;
            ++c;
            if(c >= cols) {
                c = 0;
                ++r;
            }
            read = file.readChar();
        }
        Voyager voyager = new Voyager(carr);
        voyager.convertcarr();
        System.out.println(voyager.carr_to_string());
        voyager.correctiarr();
        voyager.correctConvertiarr();
        System.out.println(voyager.carr_to_string());
    }
}
