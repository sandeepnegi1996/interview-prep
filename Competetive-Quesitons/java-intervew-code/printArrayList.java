import java.util.*;

class test{
    public static void main(String[] args) {
        ArrayList list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator itr= list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");         
        }
        System.out.println();
        for (Object obj : list) {
            System.out.print(obj+" ");
            
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));          
        }
    }
}