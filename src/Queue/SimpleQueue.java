package Queue;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

class QueueOperations {
    int front, rear;
    int size;
    int arr[];
    Scanner sc = new Scanner(System.in);

    QueueOperations(int size) {
        front = rear = -1;
        this.size = size;
        arr = new int[size];
    }

    boolean isEmpty() {
        if (rear == -1 || front == rear) {
            return true;
        }
        return false;
    }

    boolean isFull() {
        if (rear == size - 1) {
            return true;
        }
        return false;
    }

    void push() {
        if (isFull()) {
            System.out.println("QUEUE IS OVERFLOW");
            return;
        }
        if (front == -1) {
            front++;
        }
        System.out.println("Enter NUmber :- ");
        int val = sc.nextInt();
        rear++;
        arr[rear] = val;
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Queue is Underflow");
            return;
        }
        if (front > rear) {
            front = -1;
            rear = -1;
            return;
        }
        front++;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Underflow");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }

}

public class SimpleQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueOperations op = new QueueOperations(7);
        for (int i = 0; i < 25; i++) {
            System.out.println("Enter Choice :- ");
            int choice = sc.nextInt();
            if (choice == 0) {
                break;
            } else if (choice == 1) {
                op.push();
            } else if (choice == 2) {
                op.pop();
            } else if (choice == 3) {
                op.display();
            }
        }
    }
}
