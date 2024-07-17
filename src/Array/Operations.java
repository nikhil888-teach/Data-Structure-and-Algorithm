package Array;

public class Operations {
    static  int insert(int arr[],int p,int val){
        if(p== arr.length){
            System.out.println("Array is full");
            return p;
        }
        arr[p]=val;
        p++;
        return p;
    }
    static void update(int arr[],int p,int exs,int val){
        boolean flag=false;
        for(int i=0;i<p;i++){
            if(arr[i]==exs){
                arr[i]=val;
                flag=true;
            }
        }
        if(!flag){
            System.out.println("Not found");
        }
    }
    static void search(int arr[],int p,int val){
        int first=0;
        int last=p-1;
        int mid=(first+last)/2;
        while (first<=last){
            if(arr[mid]==val){
                System.out.println("Found At position "+mid+ " value "+val);
            return;
            } else if (arr[mid]<val) {
                first=mid+1;
            }else{
                last=mid-1;
            }
            mid=(first+last)/2;

        }
        System.out.println("Value not found");
//        boolean flag=false;
//        for(int i=0;i<p;i++){
//            if(arr[i]==val){
//                System.out.println("Found At position "+i+ " value "+val);
//                flag=true;
//            }
//        }
//        if(!flag){
//            System.out.println("Not found");
//        }

    }
    static void display(int arr[],int p){
        if (p == 0) {
            System.out.println("empty");
            return;
        }
        for (int i = 0; i < p; i++) {
            System.out.println(arr[i] + " ");
        }

    }
    static int delete(int arr[],int p,int val){
        boolean flag=false;
        for(int i=0;i<p;i++){
            if(arr[i]==val){
                for (int j = i; j < p-1; j++) {
                    arr[j] =arr[j+1];
                }
                flag=true;
                i--;
                p--;
            }
        }
        if(!flag){
            System.out.println("Not found");
        }
        return p;
    }
    public static void main(String[] args) {
    int p=0;
    int arr[]=new int[5];
    display(arr,p);
    p=delete(arr,p,10);
    p=insert(arr,p,10);
    p=insert(arr,p,20);
    p=insert(arr,p,30);
    p=insert(arr,p,40);
    p=insert(arr,p,10);
    update(arr,p,40,100);
    search(arr,p,100);
    display(arr,p);

    }
}
