import java.util.*;

class Test{

    public static void stringReverseBuffer(String s1){
        StringBuffer str=new StringBuffer();
        str.append(s1);
         str.reverse();         
         String s2=str.toString();

        if (s1.equals(s2)) {
            System.out.println("palindrome");
            
        } else {
            System.out.println("not palindrome");
        }

    }

    public static void secondApproach(String s){
        int start=0;
        int end=s.length()-1;
        int flag=0;
        while (start<end) {
            if (s.charAt(start)==s.charAt(end)) {
                start++;
                end--;
                
            } else {
                flag=1;
                break;
            }   
            
        }
        if (flag==0) {
            System.out.println(" palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String s1=scan.next();

        //stringReverseBuffer(s1);
        secondApproach(s1);
        
    }
}