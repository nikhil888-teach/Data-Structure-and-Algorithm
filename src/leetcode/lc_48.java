package leetcode;

public class lc_48 {

    public static void rotate(int[][] nums) {
        int row = 0;
        int[][] ans = new int[nums.length][nums[0].length];
        for (int i = 0; i < nums[0].length; i++) {
            int col = 0;
            for (int j = nums.length - 1; j >= 0; j--) {

                ans[row][col] = nums[j][i];
                System.out.print(nums[j][i] + " ");
                col++;
            }
            row++;

            System.out.println();
        }
        nums = ans;

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums[0].length; j++) {
//                System.out.print(nums[i][j] + " ");
//            }
//            System.out.println();
//        }

    }

    public static void main(String[] args) {
        rotate(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }
}
