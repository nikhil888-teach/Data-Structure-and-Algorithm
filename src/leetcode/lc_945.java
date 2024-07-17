package leetcode;

import java.util.HashSet;
import java.util.Set;

public class lc_945 {
    public static int minIncrementForUnique(int[] nums) {
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            } else {
                int temp = 0;

                nums[i] = (nums[i] + 1);
                temp++;
                i--;

                set.add(nums[i]);
            }
        }

        return ans;

    }

    public static void main(String[] args) {

    }
}
