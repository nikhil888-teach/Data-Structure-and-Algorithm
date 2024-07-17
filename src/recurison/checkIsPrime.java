package recurison;

public class checkIsPrime {
    public static boolean isPrime(int i, int num) {
        if (num == i) {
            return true;
        }
        if (num % i == 0) {
            return false;
        }
        return isPrime(i + 1, num);
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2, 7));
    }
}
