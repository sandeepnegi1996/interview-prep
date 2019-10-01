


import java.util.*;

class test{

    public static boolean checkPalindromeNum(int n){
        int rev=0;int rem=0;
        int originalNum=n;
        while (n>0) {
            rem=0;
            rem=n%10;
            rev=rem+rev*10;
            n/=10;
            
        }
        if (originalNum==rev) {
            return true;
            
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        boolean ans;
        ans=checkPalindromeNum(n);
        System.out.println(ans);
    }
}