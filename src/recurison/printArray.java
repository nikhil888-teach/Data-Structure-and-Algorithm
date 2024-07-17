package recurison;

public class printArray {
    public static void printArray(int num[], int i) {
        if (num.length == i) {
            return;

        }
        System.out.println(num[i]);
        printArray(num, i + 1);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 7, 6, 5, 8, 9};
        printArray(nums, 0);
    }
}
