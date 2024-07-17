package leetcode;

import java.util.Stack;

public class lc_1475 {
    public static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[prices.length];
        int j = 0;
        for (int i = 0; i < prices.length; i++) {
            int temp = prices.length;
            boolean flag = false;
            if (i != prices.length - 1) {
                j = i + 1;
                while (stack.isEmpty() || (j < prices.length)) {
                    stack.push(prices[j]);
                    if (stack.peek() <= prices[i]) {
                        ans[i] = prices[i] - stack.peek();
                        flag = true;
                        break;
                    }
                    j++;
                }
                if (!flag) {
                    ans[i] = prices[i];
                }
                
                stack.clear();
            } else {
                ans[i] = prices[i];
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(finalPrices(new int[]{8, 4, 6, 2, 3}));
    }
}
