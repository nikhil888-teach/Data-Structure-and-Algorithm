package Matrix;

public class MaxSumColl {
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
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        int max=0,sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=0;
            for (int j = 0; j < a[0].length; j++) {
                sum+=a[j][i];
            }
            if(max<=sum){
                max=sum;
            }
        }
        System.out.println("Max :- "+max);
    }
}
