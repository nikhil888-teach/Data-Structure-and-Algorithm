import java.util.Scanner;
import java.util.Stack;

class SQ {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    SQ() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int val = sc.nextInt();
        stack1.push(val);
    }

    public void dequeue() {
        while (stack1.size() != 1) {
            stack2.push(stack1.pop());
        }
        stack1.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    public void display() {
        System.out.println("QUEUE: " + stack1.clone());
    }
}

public class QueueUsingStack {
    public static void main(String[] args) {
        SQ stactQueue = new SQ();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.push\n2.pop\n3.display");
            System.out.println("Enter choice :- ");
            int choice = sc.nextInt();
            if (choice == 0) {
                break;
            } else if (choice == 1) {
                stactQueue.enqueue();
            } else if (choice == 2) {
                stactQueue.dequeue();

            } else if (choice == 3) {
                stactQueue.display();
            } else {
                System.out.println("try again");
            }

        }

    }
}
