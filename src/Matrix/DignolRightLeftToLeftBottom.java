package Matrix;

public class DignolRightLeftToLeftBottom {
    public static void main(String[] args) {
        int[][] a=new int[4][4];
        int count=1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=count++;

            }

        }
        count=a.length-1;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][count--]+" , ");
        }
    }
}
