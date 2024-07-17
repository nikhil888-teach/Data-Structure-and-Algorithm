package stack;


import java.util.Scanner;

class StackOperation {
    int top1, top2, arr[], size;
    Scanner sc = new Scanner(System.in);

    StackOperation(int size) {
        top1 = -1;
        top2 = size;
        arr = new int[size];
        this.size = size;
    }

    boolean isEmptyFirst() {
        if (top1 == -1) {
            System.out.println("First stack is empty");
            return true;
        }
        return false;
    }

    boolean isEmptySec() {
        if (top2 == size) {
            System.out.println("Second stack is empty");
            return true;
        }
        return false;
    }

    boolean isFull() {
        if (top1 == top2 - 1) {
            System.out.println("Stack is Full");
            return true;
        }
        return false;
    }

    void push1() {
        if (isFull()) {
            return;
        }
        System.out.println("Enter Number :- ");
        int val = sc.nextInt();
        top1++;
        arr[top1] = val;
    }

    void push2() {
        if (isFull()) {
            return;
        }
        System.out.println("Enter Number :- ");
        int val = sc.nextInt();
        top2--;
        arr[top2] = val;
    }

    void pop1() {
        if (isEmptyFirst()) {
            return;
        }
        top1--;
    }

    void pop2() {
        if (isEmptySec()) {
            return;
        }
        top2++;
    }

    void peek1() {
        if (isEmptyFirst()) {
            return;
        }
        System.out.println("Peek :- " + arr[top1]);
    }

    void peek2() {
        if (isEmptySec()) {
            return;
        }
        System.out.println("Peek :- " + arr[top2]);
    }

    void display1() {
        if (isEmptyFirst()) {
            return;
        }

        for (int i = top1; i >= 0; i--) {
            System.out.print(arr[i] + " --> ");
        }
        System.out.println();
    }

    void display2() {
        if (isEmptySec()) {
            return;
        }

        for (int i = top2; i < size; i++) {
            System.out.print(arr[i] + " --> ");
        }
        System.out.println();
    }

}

public class TwoStackArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackOperation st = new StackOperation(10);
        int choice = 1;
        while (choice != 0) {
            System.out.println("Operation\n1.push 1\n2.push 2\n3.pop 1\n4.pop 2\n5.peek 1\n6.peek 2\n7.display 1\n8.display 2");
            System.out.println("\nEnter Your choice :- ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    st.push1();
                    break;
                case 2:
                    st.push2();
                    break;
                case 3:
                    st.pop1();
                    break;
                case 4:
                    st.pop2();
                    break;
                case 5:
                    st.peek1();
                    break;
                case 6:
                    st.peek2();
                    break;
                case 7:
                    st.display1();
                    break;
                case 8:
                    st.display2();
                    break;
                default:
                    System.out.println("Invaid choice..please try again");
            }
        }

    }
}
