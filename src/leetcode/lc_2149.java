package leetcode;

import java.util.Arrays;

public class lc_2149 {
    public static int[] rearrangeArray(int[] nums) {
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0 && count < nums.length) {
                if (count != i && nums[count] > 0) {
                    int temp = nums[i];
                    nums[i] = nums[count];
                    nums[count] = temp;
                }
                if (nums[count] < 0) {

                    count = count + 2;
                }
            }
        }
        return nums;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rearrangeArray(new int[]{1, -9, -8, -7, 3, 2})));
    }
}
