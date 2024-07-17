package stack;

import java.util.Scanner;
import java.util.Stack;

public class MonotonicStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        //Monotonic Increasing Stack
        /*for (int i = 0; i < 10; i++) {
            System.out.println("Enter Val :- ");
            int val = sc.nextInt();
            while (!stack.isEmpty() && stack.peek() > val) {
                stack.pop();
            }
            stack.push(val);
            System.out.println(stack);
        }*/

//        Monotonic Decreasing Stack
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Val :- ");
            int val = sc.nextInt();
            while (!stack.isEmpty() && stack.peek() < val) {
                stack.pop();
            }
            stack.push(val);
            System.out.println(stack);
        }

    }
}
