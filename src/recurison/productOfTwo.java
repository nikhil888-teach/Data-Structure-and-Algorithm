package recurison;

public class productOfTwo {
    public static int product(int x, int y) {
        if (x < y) {
            return product(y, x);
        }
        if (y == 0) {
            return 0;
        }
        return x + product(x, y - 1);
    }

    public static void main(String[] args) {
        System.out.println(product(3, 3));
    }
}
