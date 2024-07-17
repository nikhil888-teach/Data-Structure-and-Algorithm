package recurison;

public class reverseInteger {

    static int rev = 0;

    public static int reverseInte(int num) {
        if (num == 0) {
            return rev;
        }
        rev = rev * 10 + (num % 10);
        reverseInte(num / 10);
        return rev;

    }

    public static void main(String[] args) {
        reverseInte(234);
        System.out.println(rev);
    }
}
