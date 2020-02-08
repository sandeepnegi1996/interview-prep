# Important Coding Guidelines


```java
public class SomeClass {
  // Static variables in order of visibility
  public static final Integer PUBLIC_COUNT = 1; 
  static final Integer PROTECTED_COUNT = 1; 
  private static final Integer PRIVATE_COUNT = 1;
  // Instance variables in order of visibility
  public String name; 
  String postalCode; 
  private String address;
  // Constructor and overloaded in sequential order
  //first default constructor and then paramatertized constructor
  public SomeClass() {}    
  public SomeClass(String name) {
    this.name = name;
  }
  // Methods
  public String doSomethingUseful() {
    return "Something useful"; 
  } 
  // getters, setters, equals, hashCode and toString at the end
}

```
2. Class and interface name should be CamelCase
    1. Ex:- class EmplpoyeeResult

3. Package Name :- **com.deepspace**   rather then *com.deepSpace*   or   

```java
    //spaceing in while loops 
    //this is the right way
    while ( ) {

    }

    //this is wrong way
    while(){

    }

    //Function Definition

    //right way
    void doSomething(x<10>) {

    }
    //wrong way

    void doSomething ( ) {

    }

```
###  Comments

1. Implemnetaiton Comment : if you want to tell what this peice of code does
2. Documentation Comment :  Comment that are written what this function will do not necessarily depends on code it will be read by people may be who don't have the code itself


## Types of Comment
1. Block Comment :- 
```java
    /*
    *  Block of comments that can be added before a funciton or a class that will basically tell us 
    *   about the working of that things 
    *
    */
```

2. Single Line Comment
```java
    // Single line comment
    if (condition) {
    /* Handle the condition. */
    ...
    }

```
3. Always use @Override annotation when overriding
4. Encourage use of @Nullable when a field or method returns null
