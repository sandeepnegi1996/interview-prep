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
			It must be followed by try/
			

