package Queue;

import java.util.*;

public class reverseKelementUsingStack {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Number :- ");
            int val = sc.nextInt();
            queue.add(val);

        }
        System.out.println(queue);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter number :- ");
        int k = sc.nextInt();
        while (!queue.isEmpty() && k > 0) {
            stack.push(queue.removeFirst());
            k--;
        }
        for (int i = 0; i < stack.size(); i++) {
            queue.addFirst(stack.get(i));

        }
        stack.clear();

        System.out.println(queue);


    }
}
