package Matrix;

public class DeleteMaxEleRow {
    public static void main(String[] args) {
        int[][] a=new int[3][3];
//        Scanner sc=new Scanner(System.in);
        int count=1;
        int max[]=new int[a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=count++;
                if(max[i]<a[i][j]){
                    max[i]=a[i][j];
                }
            }

        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if(max[i]==a[i][j]){
                    continue;
                }
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }

    }
}
