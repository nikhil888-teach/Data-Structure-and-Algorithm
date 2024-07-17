package Array;

public class oneNumMiss {
    public static void main(String[] args) {

        int arr[]={1,2,3,5};
        int sum=arr.length+1*(arr.length+2)/2;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum2+=arr[i];
        }
        System.out.println(sum2-sum);
    }
}
