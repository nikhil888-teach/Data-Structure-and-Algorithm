package leetcode;

import java.util.Stack;

public class lc_1021 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String s = "(()())(())";
        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == '(') {
                stack.push(')');
            } else if (s.charAt(i) == ')') {

            }
        }


    }
}
