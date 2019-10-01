import java.util.*;

class reversingString{

    public static void stringReverseIterative(String s){
        String s1="";
        
        for (int i = s.length()-1; i >=0 ; i--) 
            s1+=s.charAt(i);
        
        System.out.println(s1);

    }

    public static String stringReverseRecursively(String s){

        if (s.isEmpty() || s==null) 
            return s;
            
        return s.charAt(s.length()-1)+stringReverseRecursively(s.substring(0, s.length()-1));
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();

     //   stringReverseIterative(s);
        

        String str=stringReverseRecursively(s);
        System.out.println(str);
    }
}