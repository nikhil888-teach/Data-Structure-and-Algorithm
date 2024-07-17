package Matrix;

public class FindEleSortMarix {
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
        int search=7;
        int rowsearch=-1;
        int top=0,bottom=row-1;
        while (top<=bottom){
            int mid=(top+bottom)/2;
            if(a[mid][0]<=search && a[mid][col-1]>=search){
                rowsearch=mid;
                break;
            }else if(a[mid][0]>search){
                bottom=mid-1;
            }else{
                top=mid+1;
            }
        }
        if(rowsearch==-1){
            System.out.println("Not Present");
            return;
        }
        int left=0,right=col-1;

        while (left<=right){
         int mid=(left+right)/2;
         if(a[rowsearch][mid]==search){
             System.out.println("Present");
             return;
         }else if(a[rowsearch][mid]>search){
             right=mid-1;
         }else{
             left=mid+1;
         }
        }
        System.out.println("Not present");


    }
}
