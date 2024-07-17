package stack;

import java.util.Stack;

public class ReverseIndividualWords {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "how are you ?";
        int left = 0;
        int right = 0;
        String rev = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || i == str.length() - 1) {
                right = (i == str.length() - 1) ? i : i - 1;
                rev += reverse(str, left, right);
                if (i != str.length() - 1) {
                    rev += " ";
                }
                left = i + 1;

            }
        }
        System.out.println("Reverse :- " + rev);

    }

    private static String reverse(String str, int left, int right) {

        Stack<Character> stack = new Stack<>();
        for (int i = left; i <= right; i++) {
            stack.push(str.charAt(i));
        }
        str = "";
        for (int i = stack.size() - 1; i >= 0; i--) {
            str += stack.get(i);
        }
        return str;
    }
}
