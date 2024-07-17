package leetcode;

import java.util.*;

public class lc_15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        HashSet<List<Integer>> hashSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> sum = new ArrayList<>();
            for (int j = i + 1; j < nums.length; j++) {
                boolean flag = false;
                int x = nums[i] + nums[j];
                int diff = (0 - x);
                if (map.containsValue(diff)) {
                    for (int n = 0; n < nums.length; n++) {
                        if (map.get(n) == diff) {
                            if (i != j && i != n && j != n) {
                                sum.add(nums[i]);
                                sum.add(nums[j]);
                                sum.add(nums[n]);
                                if (!hashSet.contains(sum)) {
                                    ans.add(sum);
                                    flag = true;

                                    hashSet.add(sum);
                                }
                                sum = new ArrayList<>();
                                break;
                            }
                        }
                    }
                }
                if (flag) {
                    break;
                }
            }

        }


/*        for (int i = 0; i < nums.length - 2; i++) {
            List<Integer> sum = new ArrayList<>();
            boolean flag = false;
            for (int j = i + 1; j < nums.length - 1; j++) {
                sum.clear();
                for (int k = j + 1; k < nums.length; k++) {
                    if ((nums[i] + nums[j] + nums[k]) == 0) {
                        sum.add(nums[i]);
                        sum.add(nums[j]);
                        sum.add(nums[k]);
                        flag = true;
                        break;
                    }
                }
            }
            if (flag) {
                ans.add(sum);
            }
        }*/
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        ;
    }
}
