package stack;

import java.util.Stack;

public class PostFixtoPrefix {
    public static void main(String[] args) {
        String postfix = "AB*CD/+";
//        +*AB/CD
//
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            if (Character.isLetterOrDigit(postfix.charAt(i))) {
                stack.push(String.valueOf(postfix.charAt(i)));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push(String.valueOf(postfix.charAt(i)) + op2 + op1);
            }
        }
        System.out.println(stack.peek());

    }
}
