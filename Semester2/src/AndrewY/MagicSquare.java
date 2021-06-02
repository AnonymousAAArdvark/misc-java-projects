package AndrewY;
import java.util.ArrayList;

public class MagicSquare {
    private int n;
    private int[][] array;
    private ArrayList<Integer> nums;

    public MagicSquare() {
        nums = new ArrayList<>();
    }

    public void makeSquare(int n) {
        if(n % 2 == 0) {
            System.out.println("Please enter an odd number!");
            return;
        }
        array = new int[n][n];
        int num = 1;
        int row = 0;
        int col = n / 2;
        int curr_row;
        int curr_col;
        while(num <= n * n) {
            array[row][col] = num;
            num++;
            curr_row = row;
            curr_col = col;
            row -= 1;
            col += 1;
            if(row == -1)
                row = n - 1;
            if(col == n)
                col = 0;
            if(array[row][col] != 0) {
                row = curr_row + 1;
                col = curr_col;
                if(row == -1)
                    row = n - 1;
            }
        }
    }

    public boolean test() {
        if(!meetsRequirementOne()) {
            System.out.println("Your numbers do not meet req 1!");
            return false;
        }
        else if(!meetsRequirementTwo()) {
            System.out.println("Your numbers do not meet req 2!");
            return false;
        }
        else if(!meetsRequirementThree()) {
            System.out.println("Your numbers do not meet req 3!");
            return false;
        }
        else {
            System.out.println("Your numbers were a magic square!");
            return true;
        }
    }

    public void printSquare() {
        for(int[] arr : array) {
            for(int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void add(int i) {
        nums.add(i);
    }
    public boolean meetsRequirementOne() {
        double ndouble = Math.sqrt(nums.size());
        n = (int)ndouble;
        return ndouble == Math.floor(ndouble);
    }
    public boolean meetsRequirementTwo() {
        for(int i=1; i <= n; ++i) {
            if(!nums.contains(i * i))
                return false;
        }
        return true;
    }
    public boolean meetsRequirementThree() {
//        int curr = 0;
//        int sum = 0;
//        for(int i=0; i < nums.size(); i += 4) {
//            for(int j=i; j < i+n; ++j) {
//                curr += nums.get(j);
//            }
//            if(sum == 0)
//                sum = curr;
//            else if(curr != sum)
//                return false;
//            curr = 0;
//        }
//        for(int i=0; i < n; ++i) {
//            for(int j=i; j < nums.size(); j += n) {
//                curr += nums.get(j);
//            }
//            if(sum == 0)
//                sum = curr;
//            else if(curr != sum)
//                return false;
//            curr = 0;
//        }
//        curr = 0;
//        sum = 0;
//        for(int i=0; i < nums.size(); i += n+1) {
//            curr += nums.get(i);
//        }
//        for(int i=n-1; i < nums.size()-1; i += n-1) {
//            sum += nums.get(i);
//        }
//        return sum == curr;
        int n = (int)Math.sqrt(nums.size());
        array = new int[n][n];
        int k = 0, sum = 0, curr = 0;
        for(int i=0; i < n; ++i) {
            for(int j=0; j < n; ++j) {
                array[i][j] = nums.get(k);
                curr += nums.get(k);
                k++;
            }
            if(sum == 0) {
                sum = curr;
                curr = 0;
            }
            else if(curr == sum)
                curr = 0;
            else
                return false;
        }
        curr = 0;
        sum = 0;
        for(int j=0; j < n; ++j) {
            for(int i=0; i < n; ++i) {
                curr += array[i][j];
            }
            if(sum == 0) {
                sum = curr;
                curr = 0;
            }
            else if(curr == sum)
                curr = 0;
            else
                return false;
        }
        sum = 0;
        curr = 0;
        for(int i=0; i < n; ++i) {
            sum += array[i][i];
            curr += array[n-i-1][i];
        }
        if(sum != curr) return false;
        return true;
    }
}
