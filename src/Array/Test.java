package Array;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :- ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter " + (i + 1) + " index number :- ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

//        for (int i = 0; i < arr.length; i++) {
//
//            int prevPos=i;
//
//
//        }
//        int n = sc.nextInt();
//        int num = ((n / 2) * -1) + 1;
//        for (int i = 0; i < n; i++) {
//            if (num == 1) {
//                System.out.print(-1 + " ");
//                i++;
//            }
//            System.out.print(num + " ");
//
//            num++;
//        }
//        System.out.println();
    }
}
