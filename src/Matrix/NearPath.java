package Matrix;

public class NearPath {
    public static void main(String[] args) {
        int[][] a=new int[3][3];
        int count=1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=count++;
            }
        }


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int row=a.length;
        int col=a[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i==0 && j==0){

                } else if (i == 0) {
                    a[i][j]+=a[i][j-1];
                } else if (j == 0) {
                    a[i][j]+=a[i-1][j];
                }else {
                    a[i][j]+=Math.min(a[i][j-1],a[i-1][j]);
                }
            }
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(a[row-1][col-1]);


    }
}
