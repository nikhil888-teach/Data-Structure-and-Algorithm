package Array;

import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args) {

        int arr[] ={9,2,25,4,5};
        for(int i=0;i<arr.length;i++){
            int min=i;

            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[min]){
                    min=j;
                }
            }
            if(min!=i){
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
