import java.util.*;
// product count whenever a product is created its value should be incremented 
// and it should be associated with every new product as its product id 


class Product{

    private int pid;
    private String pname;
    private static int pCounter=0;
    private int pcount;


    Product(int pid,String pname){

        this.pid=pid;
        this.pname=pname;
        this.pcount=++pCounter;

    }

    public int getpid(){
        return pid;
    }

    public String getpname(){
        return pname;
    }

    public int getpcount() {
        return pcount;
    }
    public static void main(String[] args) {
        System.out.println("hello world");

        Product p1 = new Product(1,"Apple Juice");
        Product p2 = new Product(2,"Orange Juice");

        System.out.println("Product ID :"+ p1.getpid());
        System.out.println("Product Name: "+ p1.getpname());
        System.out.println("Product Counter : "+ p1.getpcount());

        System.out.println("=====================================================");

        System.out.println("Product ID :"+ p2.getpid());
        System.out.println("Product Name: "+ p2.getpname());
        System.out.println("Product Counter : "+ p2.getpcount());

        System.out.println( "Total count is " + Product.pCounter);
        

    }
}