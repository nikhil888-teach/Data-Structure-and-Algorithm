package DoubleLinkedList;


import java.util.Scanner;

class Node {
    int val;
    Node next, prev;

    Node(int val) {
        this.val = val;
    }

}

class DELOperations {
    Node head, tail;
    Scanner sc = new Scanner(System.in);

    void insert() {
        System.out.println("Enter Number :- ");
        int val = sc.nextInt();
        Node curr = new Node(val);
        if (head == null) {
            head = tail = curr;
            return;
        }
        tail.next = curr;
        curr.prev = tail;
        tail = curr;
    }

    void insertSort() {
        System.out.println("Enter Number :- ");
        int val = sc.nextInt();
        Node curr = new Node(val);
        if (head == null) {
            head = tail = curr;
        } else if (val <= head.val) {
            curr.next = head;
            head.prev = curr;
            head = curr;
        } else if (tail.val <= val) {
            tail.next = curr;
            curr.prev = tail;
            tail = curr;
        } else {

            Node temp = head;
            while (temp.val < val) {
                temp = temp.next;
            }
//            10 20 40 50
            temp.prev.next = curr;
            curr.prev = temp.prev;
            temp.prev = curr;
            curr.next = temp;
        }
    }

    void delete() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        System.out.println("Enter Number :- ");
        int val = sc.nextInt();
        if (head.val == val && head == tail) {
            head = tail = null;
        } else if (head.val == val) {
            head = head.next;
            head.prev = null;
        } else if (tail.val == val) {
            tail = tail.prev;
            tail.next = null;
        } else {
            Node temp = head;
            while (temp != null) {
                if (temp.val == val) {
                    break;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Not found");
                return;
            }
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            temp.prev = null;
            temp.next = null;
        }


    }

    void findPairWithSum() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head.next == null) {
            System.out.println("You need at least two Node");
            return;
        }
        System.out.println("Enter Number :- ");
        int val = sc.nextInt();
        Node first = head;
        Node sec = tail;
        while (first != null && sec != null && first != sec) {
            if (first.val + sec.val == val) {
                System.out.println(first.val + " + " + sec.val + " = " + val);
                first = first.next;
                tail = tail.prev;
            }
            if (first.val + sec.val < val) {
                first = first.next;
            } else {
                sec = sec.prev;
            }
        }
    }

    void removeDuplicateFromUnSorted() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            Node curr = temp.next;
            while (curr != null) {
                if (curr.val == temp.val) {

                    curr.prev.next = curr.next;
                    if (curr.next != null) {
                        curr.next.prev = curr.prev;
                    }

                }
                curr = curr.next;
            }
            if (temp.next == null) {
                tail = temp;
            }
            temp = temp.next;
        }
    }

    void removeDuplicateFromSorted() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
//        1 2 3 3 4
        while (temp != null) {
            Node curr = temp.next;
            while (curr != null && curr.val == temp.val) {
                curr = curr.next;
            }
            temp.next = curr;
            if (curr != null) {
                curr.prev = temp;
            }
            if (temp.next == null) {
                tail = temp;
            }
            temp = temp.next;

        }
    }

    void display() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayRev() {
        if (tail == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.prev;
        }
        System.out.println();
    }

}

public class DoubleEndedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DELOperations op = new DELOperations();
        int chice = 1;
        while (true) {
            System.out.println("\n0.EXIT\n1.insert\n2.Delete\n3.display\n4.Reverse Display\n5.insertSort\n6.delete DUplicate from Sorted List\n7.delete Duplicate from Unsorted List\n8.find Pair With Sum");
            System.out.println("Enter Your choice :- ");
            chice = sc.nextInt();
            if (chice == 0) {
                break;
            } else if (chice == 1) {
                op.insert();
            } else if (chice == 2) {
                op.delete();
            } else if (chice == 3) {
                op.display();
            } else if (chice == 4) {
                op.displayRev();
            } else if (chice == 5) {
                op.insertSort();
            } else if (chice == 6) {
                op.removeDuplicateFromSorted();
            } else if (chice == 7) {
                op.removeDuplicateFromUnSorted();
            } else if (chice == 8) {
                op.findPairWithSum();
            } else {
                System.out.println("Invalid Choice");
            }
        }
    }
}
