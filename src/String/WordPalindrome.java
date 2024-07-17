package String;

import java.util.Scanner;

public class WordPalindrome {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String :- ");
        String str = sc.nextLine();
        str = str.trim();
        String[] arr = str.split("\\s");
        for (int i = 0; i < arr.length; i++) {
            if (!isPalindrome(arr[i])) {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
