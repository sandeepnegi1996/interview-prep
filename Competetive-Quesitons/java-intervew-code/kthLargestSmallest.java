import java.util.*;

class test{

    public static void kthSmallestBruteForce(int arr[],int k)
    {
        // // Todo: first find the first minimum
        int min=Integer.MAX_VALUE;
        int min1=Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min1){
                min1=arr[i];

            }

        }
        int min2=Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min2  && arr[i]>min1) {
                min2=arr[i];
            
            }
            
        }
        System.out.println(min1 +" "+min2);
    }
    public static void main(String[] args) {
      int arr[] = {7, 10, 4, 3, 20, 15};
      int k=3;
      kthSmallestBruteForce(arr,k);
    }
}