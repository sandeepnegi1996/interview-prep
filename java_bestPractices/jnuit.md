# Junit4 

1. This project is build just to test the working of the junit3 with the java project

### Working

1. first create a project using maven choosing archtetype to be quickstart
2. Second Create a class in the project with some data in our case it is out Dog with getters and setters
3. now click on the default package and create the jnuit test cases 
4. Above option will automatically create the class
5. we just have to add the test cases to our class
4. @BeforeClass --> will run before any test case will run --> its name should be setUpBeforeClass
5. @AfterClass  --> will run at the last of the test cases --> Its name should be tearDownAfterClass
4. @Before      --> will run before every test cases       --> Its name should be setUp
5. @After       --> will run after every test cases        --> Its name should be tearDown
6. @Test        --> is used to create a test case          --> just put this above any of the function
7. 

#### How to create a test case

1. Add the annotaion @Test above any funciton with void return type
2. In this function we will compare some values using **assert.Equals** like there are other methods that can be used.

    ```java
		assertEquals("Error name is different","tommy",mdogName);
    ```

3. full example of the test case is 
```java
   	public void myDogBreedTest() {
           
		String breed=myDog.getBreed();
		assertEquals("Breed not same","bernard",breed);
		
	}
```
   
4. If you want to perform some operation which is common to all the test cases do it in the **@BeforeClass**
5. **To import a package we will just write *import packageName.ClassName***
6. JUnit provide setUp and tearDown so if we need to allocate something or start something before a testcase we can do that in the @Before
and if we want to remove or deallocate something we will do that in the @After These are the Classes in the **org.junit**
7. The order of testcases is not guaranteed so to do this we will use JUnit Test Suites.
8. Junit Annotations are @Before,@After,@BeforeClass,@AfterClass,@Test
   

### JUnit Assert Class

1. **assertEquals("string1","string2")** 