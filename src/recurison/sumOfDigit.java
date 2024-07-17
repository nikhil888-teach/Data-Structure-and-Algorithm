package recurison;

public class sumOfDigit {
    public static int sumOfDigit(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigit(num / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigit(23));

    }
}
