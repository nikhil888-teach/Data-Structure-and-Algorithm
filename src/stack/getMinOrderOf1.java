package stack;

import java.util.Scanner;
import java.util.Stack;

public class getMinOrderOf1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int min = 0;
        // min
        // stack  5 -2
        for (int i = 0; i < 15; i++) {
            System.out.println("Operations\n1.Push\n2.pop\nMin");
            System.out.println("Enter Choice :- ");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter Number :- ");
                int val = sc.nextInt();
                if (stack.isEmpty()) {
                    min = val;
                    stack.push(val);
                } else if (min > val) {
                    stack.push(2 * val - min);
                    min = val;
                } else {
                    stack.push(val);
                }
            } else if (choice == 2) {
                if (stack.peek() < min) {
                    min = 2 * min - stack.peek();
                }
                stack.pop();
            } else if (choice == 3) {
                System.out.println("Min ;- " + min);
            } else {
                System.out.println("Invalid choice please tru again");
                i--;
            }


        }
    }
}
