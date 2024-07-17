package stack;

public class StackOp {
    int top = -1;
    int size;
    int[] arr;
    int[] min;

    StackOp() {
        size = 5;
        arr = new int[size];
    }

    boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

    boolean isFull() {
        if (top == (size - 1)) {
            return true;
        }
        return false;
    }

    void push(int a) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        arr[top] = a;
    }

    int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int val = arr[top];
        top--;
        return val;

    }

    void peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(arr[top]);
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return;
        }
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[top] + " -> ");
        }
        System.out.println();
    }

}
