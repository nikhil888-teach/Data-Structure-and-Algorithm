package Matrix;

public class sumOFDignol {
    public static void main(String[] args) {
        int[][] a=new int[3][3];
//        Scanner sc=new Scanner(System.in);
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

        int sum=0;
        int row=a.length;
        int col=a[0].length;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i][i];
            sum+=a[i][col-i-1];
        }
        if ((row * col) % 2 != 0) {
            sum -= a[row / 2][col / 2];
        }
        System.out.println(sum);
    }
}
