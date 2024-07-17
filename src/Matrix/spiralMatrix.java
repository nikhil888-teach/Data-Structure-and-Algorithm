package Matrix;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] a=new int[2][3];
        int count=1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j]=count++;
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        int rs=0,re=a.length-1;
        int cs=0,ce=a[0].length-1;
        int total=(re+1) *(ce+1);
        count=0;
        while (count<total){
            for (int i = cs; i <= ce && count<total; i++) {
                System.out.print(a[rs][i]+",");
                count++;
            }
            rs++;


            for (int i = rs; i <= re && count<total; i++) {
                System.out.print(a[i][ce]+",");
                count++;
            }
            ce--;

            for (int i = ce; i >=cs && count<total; i--) {

                System.out.print(a[re][i]+",");
                count++;
            }
            re--;

            for (int i = re; i >= rs && count<total; i--) {
                System.out.print(a[i][cs]+",");
                count++;
            }
            cs++;
        }

    }
}
