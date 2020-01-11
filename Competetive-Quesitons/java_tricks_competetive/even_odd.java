public class Main
{
	public static void main(String[] args) {
		int x=3;
		if ((x&1)==0){
		    System.out.println("even");
		}
		else{
		    System.out.println("odd");
		}
		
		System.out.println(((x&1)==0) ? "EVEN":"ODD");
	}
}



