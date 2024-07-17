package String;

import java.util.Scanner;

public class checkEqualString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :- ");
        String str = sc.nextLine();
        int word = 0;
        int digit = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 46 && str.charAt(i) < 58) {
                digit++;
            }
            if ((str.charAt(i) > 64 && str.charAt(i) < 91) || (str.charAt(i) > 96 && str.charAt(i) < 123)) {
                word++;
            }
        }
        if (word == digit) {
            System.out.println("equal");
            return;
        }
        System.out.println("Not equal");

    }
}
