package stack;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        String str = "ABBA";
        Stack<Character> stack = new Stack<>();
        for (int i = (str.length()) / 2; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length() / 2; i++) {
            if (stack.peek() != str.charAt(i)) {
                System.out.println("Not Palindrome");
                return;
            }
            stack.pop();
        }
        System.out.println("Palindrome");


    }
}