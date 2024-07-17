package UnnameQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findLongNumFromArray {

    static String maximum = "";

    public static void permutations(String[] str) {
        String[] dup = Arrays.copyOf(str, str.length);

        for (int i = 0; i < str.length; i++) {
            String temp = str[i];
            str[i] = str[0];
            str[0] = temp;
            storeMax(str);
            System.out.println(Arrays.toString(str));
            int l = 1;
            for (int j = 1; j < str.length; j++) {
                for (int k = l; k < str.length - 1; k++) {

                    String temp1 = str[k];
                    str[k] = str[k + 1];
                    str[k + 1] = temp1;
                    storeMax(str);
                }
            }


            str = Arrays.copyOf(dup, dup.length);
        }
    }

    public static void storeMax(String[] ans) {
        String temp = "";
        for (int i = 0; i < ans.length; i++) {
            temp += ans[i] + "";
        }
        if (maximum.compareTo(temp) < 0) {
            maximum = temp;
        }

    }

    public static void main(String[] args) {
        permutations(new String[]{"1", "4", "7", "2", "5", "8", "0", "3", "6", "9"});
        System.out.println(maximum);
//        int[] arr = new int[]{9, 5, 34, 30, 3};
//        long max = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            String temp = String.valueOf(arr[i]);
//            int j = i + 1;
//            int count = i + 1;
//            while (count != arr.length) {
//
//                while (j < arr.length) {
//                    temp += String.valueOf(arr[j]);
//                    j++;
//                }
//                j = 0;
//                while (j < i) {
//                    temp += String.valueOf(arr[j]);
//                    j++;
//                }
//
//                if (max < Long.parseLong(temp)) {
//                    max = Long.parseLong(temp);
//                }
//                temp = String.valueOf(arr[i]);
//                count++;
//                j = j + count;
//            }
//        }
//        System.out.println(max);
    }


}
