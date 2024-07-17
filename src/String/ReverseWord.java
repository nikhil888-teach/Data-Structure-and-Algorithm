package String;

import java.util.Scanner;

public class ReverseWord {
    static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :- ");
        String str = sc.nextLine();
        str = str.trim();
        String[] arr = str.split("\\s");
        str = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverse(arr[i]);
            str += arr[i];
            str += " ";
        }
        str = str.trim();
        System.out.println("Reverse Word :- " + str);
    }
}
