package Array;

public class OneToNDup {

    public static void main(String[] args) {
        int arr[]={1,2,2,3,4};
        int n=(arr.length-1)*(arr.length)/2;

        for (int i = 0; i < arr.length; i++) {
            n-=arr[i];
        }
        System.out.println(Math.abs(n));

    }
}
