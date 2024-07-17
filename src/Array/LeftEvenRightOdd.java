package Array;

import java.util.Arrays;

public class LeftEvenRightOdd {
    public static void main(String[] args) {
        int arr[]={5,3,2,6,7};
        int left=0,right=arr.length-1;
        while (left<right){
            if(arr[left]%2==0){
                left++;
            }else if(arr[right]%2!=0){
                right--;
            }else{
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
