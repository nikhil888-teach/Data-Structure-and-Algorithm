package Queue;

import java.util.*;

class StactQueue {
    Queue<Integer> queue1, queue2;
    Scanner sc = new Scanner(System.in);

    StactQueue() {
        String s = "Nik";
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), map.get(s.charAt(0)) + 1);
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    void push() {
        System.out.println("Enter Number :- ");
        int val = sc.nextInt();
        queue1.add(val);
    }

    void pop() {

        while (queue1.size() != 1) {
            queue2.add(queue1.poll());
        }
        queue1.poll();
        queue1 = queue2;
        queue2 = new LinkedList<>();
    }

    void display() {
        System.out.println(queue1);
    }
}

public class ImplementStackUsingQueue {
    public static void main(String[] args) {
        StactQueue stactQueue = new StactQueue();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.push\n2.pop\n3.display");
            System.out.println("Enter choice :- ");
            int choice = sc.nextInt();
            if (choice == 0) {
                break;
            } else if (choice == 1) {
                stactQueue.push();
            } else if (choice == 2) {
                stactQueue.pop();

            } else if (choice == 3) {
                stactQueue.display();
            } else {
                System.out.println("try again");
            }

        }

    }
}
