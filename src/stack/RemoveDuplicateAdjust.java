package stack;

import java.util.Stack;

public class RemoveDuplicateAdjust {
    public static void main(String[] args) {
        String str = "abbaca";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (stack.isEmpty() || stack.peek() != str.charAt(i)) {
                stack.push(str.charAt(i));
                continue;
            }
            stack.pop();
        }
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i));
        }
    }
}
