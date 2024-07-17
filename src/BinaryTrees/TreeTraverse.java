package BinaryTrees;


import java.util.*;

class Node {
    int val;
    Node left;
    Node right;


    Node() {
    }

    Node(int val) {
        this.val = val;
    }
}

class BinaryTree {
    static int count = 0;
    Node root;
    boolean isFind;

    BinaryTree() {
        createTree();
        isFind = false;
    }

    void createTree() {
        root = new Node(0);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(30);
        root.left.right = new Node(40);
        root.right.left = new Node(50);
        root.right.right = new Node(60);

//                    0
//             10            20
//           30   40         50 60
    }

    void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " -> ");
        preOrder(root.left);
        preOrder(root.right);
    }

    void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " -> ");
        inOrder(root.right);
    }

    void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " -> ");
    }

    void findNthElement(Node root, int val) {
        if (root == null) {
            return;
        }
        findNthElement(root.left, val);
        if (root.val == val) {
            System.out.println("Found");
            isFind = true;
            return;
        }
        findNthElement(root.right, val);
    }

    void findNthNode(Node root, int n) {
        if (root == null) {
            return;
        }
        findNthNode(root.left, n);
        count++;
        if (count == n) {
            System.out.println(root.val);
            root = null;
            return;
        }
        findNthNode(root.right, n);
    }


    void levelOrder(Node rot) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(rot);
        int height = 0;
        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            System.out.print(temp.val + "->");
            if (temp.left != null) {
                queue.add(temp.left);
                height++;
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }

        }
        System.out.println("\nHeight :- " + height);
    }


    void arrayToBinary(int[] array) {
        root = null;
        root = new Node(array[0]);
        int i = 1;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (i < array.length) {
            Node temp = queue.remove();
            temp.left = new Node(array[i++]);
            queue.add(temp.left);
            if (i < array.length) {
                temp.right = new Node(array[i++]);
                queue.add(temp.right);
            }
        }
    }


    void postOrderWihoutRecursion() {
        Node temp = root;
        HashSet<Node> visited = new HashSet<>();
        while ((temp != null && !visited.contains(temp))) {

            // Visited left subtree
            if (temp.left != null &&
                    !visited.contains(temp.left))
                temp = temp.left;

                // Visited right subtree
            else if (temp.right != null &&
                    !visited.contains(temp.right))
                temp = temp.right;

                // Print node
            else {
                System.out.printf("%d ", temp.val);
                visited.add(temp);
                temp = root;
            }
        }
    }

    void preOrderWithoutRecursion() {
        //              0
//             10            20
//           30   40         50 60
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.print(temp.val + " -> ");
            if (temp.right != null) {
                stack.add(temp.right);
            }
            if (temp.left != null) {
                stack.add(temp.left);

            }


        }
    }

    void inorderWithoutRecursion() {
        //             0
//             10            20
//           30   40         50 60


        Stack<Node> stack = new Stack<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node temp = stack.peek();
            while (!stack.isEmpty()) {
                if (temp.left != null) {
                    stack.push(temp.left);
                    temp = temp.left;
                } else {
                    temp = stack.pop();
                    System.out.print(temp.val + " -> ");
                    if (temp.right != null) {
                        stack.push(temp.right);
                        temp = temp.right;
                    }
                }

            }


        }
    }

    void spiralTree() {
        Node temp = root;
        Deque<Node> deque = new LinkedList<>();
        deque.add(temp);
        boolean flag = true;
        while (!deque.isEmpty()) {
            if (flag) {
                temp = deque.removeLast();
                System.out.print(temp.val + " -> ");
                if (temp.right != null) {
                    deque.addLast(temp.right);
                }
                if (temp.left != null) {
                    deque.addLast(temp.left);
                }


            } else {
                temp = deque.removeFirst();
                System.out.print(temp.val + " -> ");
                if (temp.left != null) {
                    deque.addFirst(temp.left);
                }
                if (temp.right != null) {
                    deque.addFirst(temp.right);
                }


            }
            flag = !flag;


        }
    }

}


public class TreeTraverse {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        System.out.println("Preorder :- ");
        bt.preOrder(bt.root);
        System.out.println();

        bt.preOrderWithoutRecursion();
        System.out.println("\nInorder :- ");
        bt.inOrder(bt.root);
        System.out.println();
        bt.inorderWithoutRecursion();
        System.out.println();
        System.out.println("\nPostorder :- ");
        bt.postOrder(bt.root);
        System.out.println();
        bt.postOrderWihoutRecursion();
        System.out.println("\nLevel order :- ");
        bt.levelOrder(bt.root);
        System.out.println("\nFind nth element");
        bt.findNthElement(bt.root, 90);
        if (!bt.isFind) {
            System.out.println("Not found");
        }
        bt.isFind = false;
        bt.findNthNode(bt.root, 7);
        bt.isFind = false;
        System.out.println("Array to binary :- ");
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        bt.arrayToBinary(arr);
        bt.preOrder(bt.root);
        System.out.println();
        System.out.println("Spiral Tree");
        bt.spiralTree();


    }
}
