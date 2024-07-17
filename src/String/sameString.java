package String;

import java.util.Scanner;

public class sameString {
    static boolean isSame(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String :- ");
        String first = sc.next();
        System.out.println("Enter Second String :- ");
        String sec = sc.next();
        first = first.toLowerCase().trim();
        sec = sec.toLowerCase().trim();
        if (isSame(first, sec)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

    }
}
