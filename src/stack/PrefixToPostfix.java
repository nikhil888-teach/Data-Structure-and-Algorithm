package stack;

import java.util.Stack;

public class PrefixToPostfix {
    public static void main(String[] args) {
        String prefix = "+*AB/CD";
//        AB*CD/+
        Stack<String> stack = new Stack<>();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            if (Character.isLetterOrDigit(prefix.charAt(i))) {
                stack.push(String.valueOf(prefix.charAt(i)));
            } else {
                String op1 = stack.pop();
                String op2 = stack.pop();
                stack.push(String.valueOf(op1 + op2 + prefix.charAt(i)));
            }
        }
        System.out.println(stack.peek());
    }
}
