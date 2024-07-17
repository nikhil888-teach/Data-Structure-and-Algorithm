package Matrix;

public class PrintReverse {
    public static void main(String[] args) {
        int[][] a=new int[3][3];
        int count=1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=count++;
            }
        }


        for (int i = a.length-1; i >= 0; i--) {
            for (int j = a[0].length-1; j >=0; j--) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
