package AndrewY;

public class Voyager {
    private int[][] iarr;
    private char[][] carr;
    private final int rows = 46;
    private final int cols = 75;
    public Voyager(char[][] arr) {
        carr = arr;
    }
    void convertcarr() {
        iarr = new int[rows+1][cols+1];
        for(int i=0; i < rows; ++i) {
            for(int j=0; j < cols; ++j) {
                iarr[i][j] = Integer.parseInt(String.valueOf(carr[i][j]));
            }
        }
    }
    void correctiarr() {
        for(int i=1; i < rows-1; ++i) {
            for(int j=1; j < cols-1; ++j) {
                if(Math.abs(iarr[i][j] - iarr[i-1][j]) > 1
                && Math.abs(iarr[i][j] - iarr[i+1][j]) > 1
                && Math.abs(iarr[i][j] - iarr[i][j-1]) > 1
                && Math.abs(iarr[i][j] - iarr[i][j+1]) > 1) {
                    iarr[i][j] = (iarr[i-1][j] + iarr[i+1][j] + iarr[i][j-1] + iarr[i][j+1]) / 4;
                }
            }
        }
    }

    void correctConvertiarr() {
        for(int i=0; i < rows; ++i) {
            for(int j=0; j < cols; ++j) {
                carr[i][j] = iarr[i][j] == 0 ? ' ' : (iarr[i][j] == 1 ? 'O' : '$');
            }
        }
    }

    String iarr_to_string() {
        String res = "";
        for(int i=0; i < rows; ++i) {
            for(int j=0; j < cols; ++j) {
                res += iarr[i][j];
            }
            res += '\n';
        }
        return res;
    }
    void convertiarr() {
        for(int i=0; i < rows; ++i) {
            for(int j=0; j < cols; ++j) {
                carr[i][j] = (char)iarr[i][j];
            }
        }
    }
    String carr_to_string() {
        String res = "";
        for(int i=0; i < rows; ++i) {
            for(int j=0; j < cols; ++j) {
                res += carr[i][j];
            }
            res += '\n';
        }
        return res;
    }
}
