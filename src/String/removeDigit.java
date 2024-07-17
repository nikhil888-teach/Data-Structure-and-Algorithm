package String;

import java.util.Scanner;

public class removeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :- ");
        String str = sc.nextLine();
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 46 && str.charAt(i) < 58) {
                continue;
            }
            str2 += str.charAt(i);
        }
        System.out.println("Remove digit :- " + str2);
    }
}
