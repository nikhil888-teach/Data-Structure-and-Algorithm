package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class lc_826 {
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < difficulty.length; i++) {
            if (map.containsKey(difficulty[i])) {
                if (profit[i] > map.get(difficulty[i])) {
                    map.put(difficulty[i], profit[i]);
                }
            } else {
                map.put(difficulty[i], profit[i]);
            }
        }
        System.out.println(map);
        Arrays.sort(worker);
        Arrays.sort(difficulty);

        System.out.println(Arrays.toString(difficulty));
        System.out.println(Arrays.toString(profit));

        for (int i = 0; i < worker.length; i++) {
            int min = 0;
            boolean flag = false;
            for (int j = 0; j < difficulty.length; j++) {
                if (difficulty[j] < worker[i] || difficulty[j] == worker[i]) {


                    if (map.get(difficulty[j]) >= map.get(difficulty[min])) {
                        min = j;
                        flag = true;
                    }


                }

            }
            if (flag) {
                ans += map.get(difficulty[min]);

            }
        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(maxProfitAssignment(new int[]{66, 1, 28, 73, 53, 35, 45, 60, 100, 44, 59, 94, 27, 88, 7, 18, 83, 18, 72, 63}, new int[]{66, 20, 84, 81, 56, 40, 37, 82, 53, 45, 43, 96, 67, 27, 12, 54, 98, 19, 47, 77}, new int[]{61, 33, 68, 38, 63, 45, 1, 10, 53, 23, 66, 70, 14, 51, 94, 18, 28, 78, 100, 16}));
    }
}
