package AndrewY;

import java.util.ArrayList;
import java.util.Collections;

public class Starfleet {
    public static void main(String[] args) {
        EasyReader file = new EasyReader("starfleet.dat");
        ArrayList<Integer> arr = new ArrayList<Integer>();

        int read = file.readInt();
        while (read != -1) {
            arr.add(read);
            read = file.readInt();
        }

        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        Collections.sort(arr);
        for(int i=0; i < arr.size(); ++i) {
            String str = arr.get(i) + "";
            if(str.length() == 3) {
                StringBuilder input = new StringBuilder();
                input.append(str);
                input.reverse();
                str = input.toString();
                arr.set(i, Integer.parseInt(str));
            }
        }

        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();


        Collections.sort(arr);

        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        for(int i=0; i < arr.size(); ++i) {
            if(arr.get(i) > 450)
                arr.set(i, arr.get(i) + 150);
            else
                arr.set(i, arr.get(i) + 100);
        }

        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();


        for(int i=0; i < arr.size(); ++i) {
            String str = arr.get(i) + "";
            if(str.length() == 3) {
                StringBuilder input = new StringBuilder();
                input.append(str);
                input.reverse();
                str = input.toString();
                arr.set(i, Integer.parseInt(str));
            }
        }

        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        Collections.sort(arr);

        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        for(int i=0; i < arr.size(); ++i) {
            arr.set(i, arr.get(i) - 113);
        }

        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        for(int i=0; i < arr.size(); ++i) {
            int num = arr.get(i);
            while(num >= 28)
                num -= 28;
            arr.set(i, num);
        }

        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        for(int i=0; i < arr.size(); ++i) {
            if(arr.get(i) <= 25)
                arr.set(i, arr.get(i) + 65);
            else
                arr.set(i, arr.get(i) + 6);
        }

        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();

        for (int num : arr)
            System.out.print(Character.toChars(num));
        System.out.println();

    }
}
