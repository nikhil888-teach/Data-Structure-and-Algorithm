package LinkedList;


import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node() {
    }

    Node(int val) {
        this.val = val;
    }

}

class CircularLinkedList {
    Node head;
    int size;
    Scanner sc = new Scanner(System.in);

    CircularLinkedList() {
        size = 0;
    }

    void insert() {
        System.out.println("Enter Number :- ");
        int val;
        val = sc.nextInt();
        Node curr = new Node(val);
        if (head == null) {
            head = curr;
            curr.next = head;
            size++;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = curr;
        curr.next = head;
        size++;
    }

    void swapFirstAndLastNode() {
        if (head.next == head) {
            System.out.println("For swapping you need At Least two Node");
            return;
        }
        
        Node secLastNode = head;
        while (secLastNode.next.next != head) {
            secLastNode = secLastNode.next;
        }
        Node lastNode = secLastNode.next;
        secLastNode.next = head;
        lastNode.next = head.next;
        head.next = lastNode;
        head = head.next;
    }

    boolean isCircular() {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next == head) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head.next;
        System.out.print(head.val + " -> ");
        while (temp != head) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class CircularList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularLinkedList op = new CircularLinkedList();
        int chice = 1;
        while (true) {
            System.out.println("\n0.EXIT\n1.insert\n2.display\n3.size\n4.IsCircular\n5.Swap first and last Node");
            System.out.println("Enter Your choice :- ");
            chice = sc.nextInt();
            if (chice == 0) {
                break;
            } else if (chice == 1) {
                op.insert();
            } else if (chice == 2) {
                op.display();
            } else if (chice == 3) {
                System.out.println("Size :- " + op.size);
            } else if (chice == 4) {
                System.out.println("isCircular :- " + op.isCircular());
            } else if (chice == 5) {
                op.swapFirstAndLastNode();
                op.display();
            } else {
                System.out.println("Invalid Choice");
            }
        }

    }
}
