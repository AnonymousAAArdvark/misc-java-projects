package AndrewY;

public class MagicSquareTest {
    public static void main(String[] args) {
        EasyReader file = new EasyReader("magicsqr.dat");
        MagicSquare mysqr = new MagicSquare();
        int read = file.readInt();
        while(read != -1) {
            mysqr.add(read);
            read = file.readInt();
        }
        mysqr.test();
        mysqr.printSquare();
        mysqr.makeSquare(7);
        mysqr.printSquare();
        mysqr.test();
    }
}
