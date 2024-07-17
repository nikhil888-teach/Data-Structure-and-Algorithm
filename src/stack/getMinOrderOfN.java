package stack;

import java.util.Scanner;
import java.util.Stack;

public class getMinOrderOfN {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> min = new Stack<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Number :- ");
            int val = sc.nextInt();
            st.push(val);
            if (min.isEmpty() || min.peek() > val) {
                min.push(val);
            }

        }
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter Your choice :- ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Stack  :- " + st);
                System.out.println("Min :- " + min);
            } else {
                if (st.pop() == min.peek()) {
                    min.pop();
                }
            }
        }
        System.out.println("Stack  :- " + st);
        System.out.println("Min :- " + min);

    }
}
