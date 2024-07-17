import java.util.Scanner;

class OperationDeque {
    int front, rear;
    int arr[], size;
    Scanner sc = new Scanner(System.in);

    OperationDeque(int n) {
        size = n;
        arr = new int[size];
        front = -1;
        rear = n;
    }

    boolean isEmpty() {
        if (front == -1 && rear == size) {
            return true;
        }
        return false;
    }

    boolean isFull() {
        if (rear == front + 1) {
            return true;
        }
        return false;
    }

    void insertAtFirst() {
        if (isFull()) {
            System.out.println("Queue is Overflow");
            return;
        }
        front++;
        System.out.println("Enter Number :- ");
        int val = sc.nextInt();
        arr[front] = val;
    }

    void deleteAtFirst() {
        if (isEmpty()) {
            System.out.println("Queue is Underflow");
            return;
        }
        if (front == -1) {
            for (int i = arr.length - 1; i > rear; i--) {
                arr[i] = arr[i - 1];
            }
            rear++;
            return;
        }
        front--;
    }

    void insertAtLast() {
        if (isFull()) {
            System.out.println("Queue is Overflow");
            return;
        }
        rear--;
        System.out.println("Enter Number :- ");
        int val = sc.nextInt();
        arr[rear] = val;
    }

    void deleteAtLast() {
        if (isEmpty()) {
            System.out.println("Queue is Underflow");
            return;
        }
        if (rear == size) {
            for (int i = 0; i <front; i++) {
                arr[i]=arr[i+1];
            }
            front--;
            return;
        }
        rear++;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        if (front != -1) {
            for (int i = front; i >= 0; i--) {
                System.out.print(arr[i] + ", ");
            }
        }
        if (rear != size) {
            for (int i = arr.length - 1; i >= rear; i--) {
                System.out.print(arr[i] + " -> ");
            }
        }
        System.out.println();

    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        if (front != -1) {
            System.out.println(arr[front]);
            return;
        }
        if (rear != size) {
            System.out.println(arr[size - 1]);
        }
    }
}

public class DoubleEndedQueue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        OperationDeque st = new OperationDeque(10);
        int choice = 1;
        while (choice != 0) {
            st.display();
            System.out.println("Operation\n1.InsertAtFirst \n2.InsertAtLast \n3.DeleteAtFirst \n4.DeleteAtLast \n5.Display \n6.peek ");
            System.out.println("\nEnter Your choice :- ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    st.insertAtFirst();
                    break;
                case 2:
                    st.insertAtLast();
                    break;
                case 3:
                    st.deleteAtFirst();
                    break;
                case 4:
                    st.deleteAtLast();
                    break;
                case 5:
                    st.display();
                    break;
                case 6:
                    st.peek();
                    break;

                default:
                    System.out.println("Invaid choice..please try again");
            }

        }
    }
}
