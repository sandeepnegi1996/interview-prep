# Exception

It is an event that disrupts the normal flow of the prohram.It is an object which is thrown at runtime

### Exception handling

Mechanism to handle the Exceptions or run time error is called as Exception handling.

#### Advantage 
1. It maintains the normal flow of the program

Example:

statement1
statement2
statement3
statement4
**statement5 (Exception Occurs)**
statement6
statement7
statement8

if we do not uses Exception handling statements after 5 won't get executed since we have done the exception handling the lines
after 5 will also get executed.


### Root Class of Java Exception Hierarchy is *java.lang.throwable*

Under throwable we have Exception and Error:
1. Error is irrecoverable
2. Exceptions are of two types checked and unchecked
3. checked exceptions are checked at compile time Ex. IOException,SQLException,RuntimeException
4. Runtime Exceptions are checked at runtime Ex. AirthmeticException,IndexOutOfBound,NullPointerExcepiton


#### Most Important keywords in Exception handling

1. try: put the code that throws exception inside try block.
		Followed by catch or finally.
		Cannot used alone.

2. Catch: will catch or handle the exception thrown by try block.
		  cannot be used alone without try block.

3. finally: it will run whether exception occur or not.
			It must be followed by try/ or catch 

4. throw: This keyword is basically used to throw an exception.

5 throws: this keyword is used to declare an exception.
		 It doesn't throw an exception
		 used with method signature
		 Basically it species there may occur an exception in the method



## Common Scenarios of Java Excepitons

1. Arithmetic Exception: Ex int a = 50/0  
Dividing the number by zero will throws Arithmetic Exception.

2. Null Pointer Exceptio: Ex. String s=null;
							  int l=s.length();
Giving a string a null value and then doing some operations on top of it will throw null Pointer Exception.

3. IndexOutOfBound: int a[]=new int[5];
					a[6]=0;

Since there is no index called as 6 this will throw an exception called as IndexOutOfBound Exception.

4. NumberFormatException: Sting s = "abc"
						  int a=Integer.parseInt(s);

Since we are trying to store string in an integer this will throw number format exception.






Example with code:

1. Arithmetic Exception

```java
public class Main
{
	public static void main(String[] args) {
		
		
		try{
		    int a = 50/0;
		}
		catch(ArithmeticException e){
		    System.out.println(e);
		    
		}
		finally{
		    System.out.println("this will always run");
		}
		
	}
}

```
```java
java.lang.ArithmeticException: / by zero                                                                                                                                                      
this will always run   
```


2. IndexOutOfBoundException

```java
public class Main
{
	public static void main(String[] args) {
		
		int a[]=new int[5];
		try{
		    a[5]=0;
		}
		catch(IndexOutOfBoundsException e){
		    System.out.println(e);
		    
		}
		finally{
		    System.out.println("this will always run");
		}
		
	}
}
```

```java
output
java.lang.ArrayIndexOutOfBoundsException: 5                                                                                                                                                 
this will always run 

```


3. NullPointerException

```java
public class Main
{
	public static void main(String[] args) {
		
		String s=null;
		try{
		   int l=s.length();
		}
		catch(NullPointerException e){
		    System.out.println(e);
		    
		}
		finally{
		    System.out.println("this will always run");
		}
		
	}
}
```


```java
output
this will always run                                                                                                                                                                        
Exception in thread "main" java.lang.NullPointerException                                                                                                                                   
        at Main.main(Main.java:15)  
```

4. NumberFormatException

```java
public class Main
{
	public static void main(String[] args) {
		
		String s="abc";
		try{
		   int l=Integer.parseInt(s);
		}
		catch(NumberFormatException e){
		    System.out.println(e);
		    
		}
		finally{
		    System.out.println("this will always run");
		}
		
	}
}

```

```java
java.lang.NumberFormatException: For input string: "abc"                                                                                                                                    
this will always run 


```

