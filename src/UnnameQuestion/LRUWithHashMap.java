package UnnameQuestion;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Node {
    int val;
    Node next;
    Node prev;


    Node() {
    }

    Node(int val) {
        this.val = val;
    }
}

class DoublyLikedList {

    Node head, tail;
    HashMap<Integer, Node> hashMap;
    int n;
    int count;
    Scanner sc = new Scanner(System.in);

    DoublyLikedList() {
        n = 5;
        count = 0;
        hashMap = new HashMap<>();
    }


    public boolean isContainsValue(int val) {
        if (hashMap.containsKey(val)) {
            return true;
        }
        return false;
    }

    public void insert_At_End(Node curr) {
        if (head == null) {
            head = tail = curr;
        } else {
            tail.next = curr;
            curr.prev = tail;
            curr.next = null;
            tail = curr;
        }
        hashMap.put(curr.val, curr);
    }

    public Node remove_Node(Node curr) {
        Node temp = curr;
        if (temp == head && temp.next == null) {
            temp = curr;
            head = tail = null;
        } else if (temp.prev == null) {
            temp = head;
            head = head.next;
            head.prev.next = null;
            head.prev = null;
        } else if (temp == tail) {
            temp = tail;
            tail = tail.prev;
            tail.next.prev = null;
            tail.next = null;
        } else {
            temp = curr;
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
            curr.next = null;
            curr.prev = null;
        }
        return temp;
    }

    public void add() {
        System.out.println("Enter Number :- ");
        int val = sc.nextInt();
        Node curr = new Node(val);
        if (count < n) {
            if (!isContainsValue(val)) {
                if (head == null) {
                    head = tail = curr;
                    hashMap.put(val, curr);
                } else {
                    insert_At_End(curr);
                }
                count++;
            } else {
                Node temp = remove_Node(hashMap.get(val));
                insert_At_End(temp);

            }
        } else {
            if (isContainsValue(val)) {
                Node temp = remove_Node(hashMap.get(val));
                insert_At_End(temp);
            } else {
                head = head.next;
                head.prev.next = null;
                head.prev = null;
                insert_At_End(curr);
            }
        }

    }

    public void search() {
        System.out.println("Enter val :- ");
        int val = sc.nextInt();
        if (isContainsValue(val)) {
            Node temp = remove_Node(hashMap.get(val));
            insert_At_End(temp);
            return;
        }
        System.out.println("Not found");
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LRUWithHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoublyLikedList linkedList = new DoublyLikedList();
        int choice = 1;
        while (choice != 0) {
            System.out.println("\nOperations\n1.add\n2.search\n3.display");
            System.out.println("Enter Choice :- ");
            choice = sc.nextInt();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    linkedList.add();
                    break;
                case 2:
                    linkedList.search();
                    break;
                case 3:
                    linkedList.display();
                    break;
                default:
                    break;
            }
        }

    }
}
