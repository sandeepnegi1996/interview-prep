public class Main
{
    public static int factorial(int n){
        if (n==0 || n==1){      //this is the base condition 
            return 1;
        } 
        else{
            return n*factorial(n-1);  //this is the recursive call
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int result=factorial(5);
		System.out.println(result);
	}
}
