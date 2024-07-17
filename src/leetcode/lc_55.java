package leetcode;

public class lc_55 {


    public static boolean canJump(int[] nums) {
        int i = 0;
        int reach = 0;
        while (i < nums.length && i <= reach) {
            reach = Math.max(i + nums[i], reach);
            i++;
        }
        return i == nums.length;
    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 5, 0, 0}));
    }
}
