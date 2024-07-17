package recurison;

public class Fibonnacii {

    public static int printFibo(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1 || num == 2) {
            return 1;
        }
        return printFibo(num - 1) + printFibo(num - 2);
    }
    

    public static void main(String[] args) {
        System.out.println(printFibo(6));
    }
}
