package Matrix;

public class PrintColumnWise {
    public static void main(String[] args) {
        int[][] a=new int[3][4];
        int count=1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=count++;
            }
        }


        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j][i]+" ");
            }
//            System.out.println();
        }
    }
}
