package stack;

import java.util.Stack;

public class ValidParanthisis {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String paranthisis = "{}[";
        for (int i = 0; i < paranthisis.length(); i++) {
            if (paranthisis.charAt(i) == '[') {
                stack.push(']');
            } else if (paranthisis.charAt(i) == '{') {
                stack.push('}');
            } else if (paranthisis.charAt(i) == '(') {
                stack.push(')');
            } else if (stack.isEmpty() || stack.pop() != paranthisis.charAt(i)) {


            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Not valid");
            return;
        }
        System.out.println("Valid");
    }

}
