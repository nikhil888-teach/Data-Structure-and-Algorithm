package Queue;

import java.util.Scanner;

class operationsOfCQ {
    int front, rear, size, arr[];

    operationsOfCQ(int size) {
        this.size = size;
        front = rear = -1;
        arr = new int[size];
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return front == (rear + 1) % size;
    }

    public void enqueue(int i) {
        if (isFull()) {
            System.out.println("Queue is Overflow.");
            return;
        }
        if (rear == -1) {
            front = (front + 1) % size;
        }
        rear = (rear + 1) % size;
        arr[rear] = i;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("QUEUE: ");
        for (int i = front; i != rear; i = (i + 1) % size) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[rear] + ", ");
        System.out.println();

    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty, can't peek value.");
            return;
        }

        System.out.println("Peek value: " + arr[front]);
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Underflow.");
            return;
        }
        if (front == rear) {
            front = rear = -1;
            return;
        }
        System.out.println("Removed value: " + arr[front]);
        front = (front + 1) % size;
    }
}

public class Circularqueue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter queue length: ");
        int len = sc.nextInt();
        operationsOfCQ q = new operationsOfCQ(len);

        int ch;
        do {
            System.out.println("0. Exit \n1. Enqueue \n2. Dequeue \n3. Peek \n4. Display");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 0:
                    break;
                case 1:
                    System.out.print("Enter value: ");
                    q.enqueue(sc.nextInt());
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (ch != 0);
    }
}
