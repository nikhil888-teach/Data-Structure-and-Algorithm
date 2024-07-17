package Matrix;

public class searchRowColuMatrix {
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
        int r=0,c=col-1,search=6;
        while (r<row && col>=0){
            if(a[r][c]==search){
                System.out.println("Present");
                return;
            } else if (a[r][c]>search){
                c--;
            }else{
                r++;
            }
        }
        System.out.println("Not Present");
    }
}
