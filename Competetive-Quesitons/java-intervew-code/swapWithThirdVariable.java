
import java.util.*;
class test{

    public static void swapTemp(int a,int b){
        int temp=0;
        temp=a;
        a=b;
        b=temp;

        System.out.println(a+" "+b);
    
    }

    public static void swapWithoutTemp(int a,int b){
        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        

        // ! swap using third varibale 
        swapTemp(a,b);

        // TODO: swap without using third variable

        swapWithoutTemp(a,b);

    }
}