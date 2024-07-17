package UnnameQuestion;


import java.util.*;

class LinkedList {
    LinkedHashSet<Integer> hashSet;

    Scanner sc;
    int n, count = 0;

    LinkedList() {

        n = 3;
        hashSet = new LinkedHashSet<>();

//        for (int i = 1; i <= n; i++) {
//            hashSet.add(i);
//        }
        sc = new Scanner(System.in);
    }

    void add() {
        System.out.println("Enter Number :- ");
        int val = sc.nextInt();
        if (count < n) {
            hashSet.add(val);
            count++;
            return;
        }
        hashSet.remove(hashSet.iterator().next());
        hashSet.add(val);


    }

    void search() {

        System.out.println("Enter Number :- ");
        int val = sc.nextInt();
        if (hashSet.contains(val)) {
            hashSet.remove(val);
            hashSet.add(val);
            return;
        }
        System.out.println("Not Found");
    }

    void display() {
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "->");
        }
        System.out.println();
    }
}

public class LRUWithLinkedSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
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
