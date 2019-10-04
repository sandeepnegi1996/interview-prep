import java.util.*;

class test{
	

	public static void reverseWord(String str){

		Stack<Character> mystack=new Stack<Character>();
		
		char arr[]=str.toCharArray();

		for(int i=0;i<arr.length;i++){
			
			//if the charAt(i) is not a space then push 
			//if it is space start popping out of the stack
			// so what will happen
			// we will push each word in the stack and pop the word as space occur 


			if(arr[i]==' '){
				while(!mystack.empty())

					System.out.print(mystack.pop());

			System.out.print(" ");
			}

			else
				mystack.push(arr[i]);

		}

		while(!mystack.empty())
			System.out.print(mystack.pop());


		
	}

	public static void main(String args[]){

		String bio="My name Sandeep";

		reverseWord(bio);

	}

}
