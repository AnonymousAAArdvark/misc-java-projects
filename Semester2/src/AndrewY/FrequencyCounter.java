package AndrewY;

public class FrequencyCounter {
    private int[] arr;
    private int total;
    public FrequencyCounter() {
        arr = new int[26];
        total = 0;
    }
    public void addChar(char c) {
        if(!Character.isLetter(c)) return;
        c = Character.toLowerCase(c);
        arr[c - 'a']++;
        total++;
    }
    public String getFrequency(char c) {
        int idx = c - 'a';
        return "" + (Math.round((double)arr[idx] / total * 1000.0) / 10.0) + "%";
    }
    public String getFrequency(int idx) {
        return "" + (Math.round((double)arr[idx] / total * 1000.0) / 10.0) + "%";
    }
    public int getTotal() {
        return total;
    }
}
