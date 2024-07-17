package recurison;

public class getLargeFromArray {
    public static int findMaxFromArray(int[] nums, int i) {
        if (i == 1) {
            return nums[0];
        }
        return Math.max(nums[i - 1], findMaxFromArray(nums, i - 1));
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 10, 1, 6};
        System.out.println(findMaxFromArray(nums, nums.length));
    }
}
