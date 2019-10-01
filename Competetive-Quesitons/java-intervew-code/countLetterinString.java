import java.util.*;

class test{
    public static void countAlphabetFrequency(String str){
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();

        for (int i = 0; i < str.length(); i++) {
            
            char letter=str.charAt(i);
            int count=0;
            if (map.containsKey(letter)) {
                count=map.get(letter);
                ++count;
                map.put(letter, count);
            }
            else{
                map.put(letter, 1);
            }
            
        }
        for (Map.Entry element : map.entrySet()) {
            System.out.println(element.getKey()+" "+element.getValue());
        }
        
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        
        countAlphabetFrequency(str);
    }
}