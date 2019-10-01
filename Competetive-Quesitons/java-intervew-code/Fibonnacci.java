import java.util.*;

class test{

    public static void printFibonaci(int f,int s,int n){
        System.out.print(f+" ");
        System.out.print(s+" ");
        int result=0;
        for (int i = 3; i <=n; i++) {
            result=f+s;
            System.out.print(result+" ");
            f=s;
            s=result;
            
        }
    }
    public static void fibonacciMemorization(int first,int second,int n){

        
        int arr[]=new int[n];
        arr[0]=first;
        arr[1]=second;

        for (int i = 2; i < n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
            
        }
    }
    public static void main(String[] args) {
        
        int first=0;
        int second=1;
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        printFibonaci(first,second,num);

        //! print fibonacci using memorization
        System.out.println();
        fibonacciMemorization(first,second,num);
    }
}