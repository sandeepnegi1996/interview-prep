# Java Tricks

### This guide will contain all the shortcuts using bit manipulation and other concept that you can use to speed up the process



1. Find Even or Odd : This question can be done in 2 ways 
	1. First way is by taking a mod of the number if it is 1 than it is odd otherwise it is even
	2. Second way this is the way i have done I have done the & operation with 1
		and if it is 0 than number is even since the & operation works on binary number it will do the & and since
		even number last bit is 0 so & with 1 is zero hence number is even else odd

		
```java

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

```