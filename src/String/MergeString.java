package String;

import java.util.Scanner;

public class MergeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :- ");
        String str1 = sc.nextLine();
        System.out.println("Enter String :- ");
        String str2 = sc.nextLine();
        str1 = str1.trim();
        str2 = str2.trim();
        if (str1.length() != str2.length()) {
            System.out.println("Length are not same");
            return;
        }
        String str = "";
        for (int i = 0; i < str1.length(); i++) {
            str += str1.charAt(i);
            str += str2.charAt(i);
        }
        System.out.println("Merge String :- " + str);

    }
}
