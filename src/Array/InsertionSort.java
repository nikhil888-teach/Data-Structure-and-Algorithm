package Array;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={10,11,9,4,2};
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
