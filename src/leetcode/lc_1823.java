package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class lc_1823 {
    public static void main(String[] args) {
        System.out.println(findTheWinner(5, 2));
    }

    public static int findTheWinner(int n, int k) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            linkedList.add(i);
        }
        k--;
        int temp = k;
        while (linkedList.size() != 1) {
            if (k >= linkedList.size()) {
                k = temp;
            }
            if (k < linkedList.size()) {
                linkedList.remove(k);
                k += k;
            }

        }
        return linkedList.get(0);

    }
}
