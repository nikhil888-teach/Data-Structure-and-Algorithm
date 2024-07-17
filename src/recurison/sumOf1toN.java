package recurison;

public class sumOf1toN {
    public static int sumofn(int num) {
        if (num == 0) {
            return 0;
        }
        return num + sumofn(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumofn(3));
    }
}
