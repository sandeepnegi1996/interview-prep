import java.util.*;

class test{

    public static void reduce(int n){
        if (n>=0) {
            reduce(n-1);    
        }
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        reduce(3);
    }
}