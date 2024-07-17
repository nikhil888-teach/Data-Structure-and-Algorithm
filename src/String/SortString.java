package String;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :- ");
        String str = sc.next();
        int[] strarr = str.chars().toArray();
        System.out.println(Arrays.toString(strarr));
        for (int i = 0; i < strarr.length; i++) {
            int min = i;
            for (int j = i + 1; j < strarr.length; j++) {
                if (strarr[j] < strarr[min]) {
                    min = j;
                }
            }
            int temp = strarr[min];
            strarr[min] = strarr[i];
            strarr[i] = temp;
        }
        System.out.println(Arrays.toString(strarr));

        str = "";
        for (int i = 0; i < strarr.length; i++) {
            char c = (char) strarr[i];
            str += c;
        }
        System.out.println(str);
    }
}
