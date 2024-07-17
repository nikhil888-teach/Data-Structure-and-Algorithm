package Matrix;

public class SumMatrix {
    public static void main(String[] args) {
        int[][] a=new int[3][3];
        int sum=0;
        int count=1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=count++;
            }
        }


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                sum+=a[i][j];
            }
        }
        System.out.println("SUM :- "+sum);
    }
}
