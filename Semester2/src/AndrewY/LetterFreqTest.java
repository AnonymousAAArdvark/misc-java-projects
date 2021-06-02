package AndrewY;

public class LetterFreqTest {
    public static void main(String[] args) {
        String filename = "IHaveADream";
        EasyReader file = new EasyReader(filename + ".dat");
        FrequencyCounter counter = new FrequencyCounter();
        char read = file.readChar();
        while(read != '#') {
            counter.addChar(read);
            read = file.readChar();
        }
        System.out.println("File: " + filename);
        System.out.println("Number of Characters: " + counter.getTotal());
        for(int i = 0; i < 26; i += 2) {
            for(int j = 0; j < 2; ++j) {
                System.out.print((char)(i + j + 'A') + " :" +
                        EasyFormat.format(counter.getFrequency(i + j) + " ", 7));
            }
            System.out.println();
        }
    }
}
