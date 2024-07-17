package recurison;

public class countDigit {
    public static int countDigit(int num) {
        if (num == 0) {
            return 0;
        }
        return 1 + (countDigit(num / 10));
    }

    public static void main(String[] args) {
        System.out.println(countDigit(432567));
    }
}
