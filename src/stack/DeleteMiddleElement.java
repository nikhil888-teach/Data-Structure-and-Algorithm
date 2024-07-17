package stack;

import java.util.Stack;

public class DeleteMiddleElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        for (int i = 1; i < 8; i++) {
            stack.push(i);
        }
        System.out.println(stack);
        int length = stack.size() / 2;
        for (int i = 0; i < length; i++) {
            temp.push(stack.pop());
        }
        stack.pop();
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        System.out.println(stack);
    }
}



