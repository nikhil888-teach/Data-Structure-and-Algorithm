package Matrix;

import java.util.Scanner;

public class PrintMatrix {
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
    }
}
