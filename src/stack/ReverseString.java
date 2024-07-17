package stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Nikhil";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < name.length(); i++) {
            stack.push(name.charAt(i));
        }
        name = "";
        for (int i = stack.size() - 1; i >= 0; i--) {
            name += stack.get(i);
        }
        System.out.println(name);

    }
}
