package Matrix;

public class DeleteMaxEleCol {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
//        Scanner sc=new Scanner(System.in);
        int count = 1;
        int max;
        int c = 0, d = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = count++;
            }

        }
        for (int i = 0; i < a.length; i++) {
            max = 0;
            for (int j = 0; j < a[0].length; j++) {
                if (a[j][i] > max) {
                    max = a[j][i];
                    c = j;
                    d = i;
                }
            }
            a[c][d] = -1;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == -1) {
                    continue;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
