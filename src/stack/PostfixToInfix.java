package stack;

import java.util.Stack;

public class PostfixToInfix {
    public static void main(String[] args) {
        String postfix = "AB+CDE/*-F+";
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            if (Character.isLetterOrDigit(postfix.charAt(i))) {
                stack.push(String.valueOf(postfix.charAt(i)));
            } else {
                String op2 = stack.pop();
                String op1 = stack.pop();
                stack.push("(" + op1 + String.valueOf(postfix.charAt(i)) + op2 + ")");
            }
        }
        System.out.println(stack.peek());
    }
}
