package leetcode;

public class lc_1052 {
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {


        int ans = 0;
        if (customers.length <= 3) {
            for (int i = 0; i < customers.length; i++) {
                ans += customers[i];

            }
            return ans;
        }
        for (int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0) {
                ans += customers[i];
            }
        }
        int left = 0;
        int right = minutes;
        int max = 0;
        int sum = 0;
        while (right <= grumpy.length) {
            int temp = 0;
            int count = 0;


            while (left != (right)) {
                if (grumpy[left] == 1) {
                    count++;
                    temp += customers[left];
                }
                left++;
            }
            System.out.println(count + " : " + temp);

            if (sum <= temp) {
                sum = temp;
            }
            left -= (minutes - 1);

            right++;
        }
        System.out.println(sum);
        ans += sum;
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(maxSatisfied(new int[]{141, 355, 676, 685, 312, 521, 828, 344, 996, 404, 439, 73, 278, 759, 384, 899, 365, 342, 109, 981, 473, 490, 632, 738, 55, 531, 116, 988, 335, 461, 774, 359, 509, 258, 427, 824, 95, 677, 313, 477, 712, 533, 636, 636, 433, 617, 766, 592, 993, 838}, new int[]{0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1}, 14));
    }
}
