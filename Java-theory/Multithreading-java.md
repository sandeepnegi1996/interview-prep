

# Multithreading in java

1. Thread is a light weight process that excecute some tasks
2. There are two types of threads user thread and daemon thread. When we run a java program main is the first user thread that we create we can create multiple threads in java both user and daemon thread.

### There are two types of multitasking 
	1. multiprocessing
	2. multithreading


* at least one thread is required for each process.


3. When all the threads are executed the JVM terminates the program
4. we can set priority on the threads 
5. when the thread run the controls goes to thread scheduler and thread scheduler is part of the JVM
so sometimes it can happen that the lower priority thread will run first and the higher priority thread will run later.

6. There are two ways by which we can use thread implementing runnable or extending thread class.
7. threads running concurrently is known as multithreading 
8. Threads  share the memory space hence it saves memory moreover the context switching between the process is much easier.

9. in multiprocessing the memory of each process is different and hence the context swithcing also takes larger time 
10. Thread Sleep : If we want to pause the execution of the thread for sometime then it that case we can use thread sleep
11. Thread Join: If we want to start one thread as soon as one thread is completed we can use thread join.
12. Thread safety and Syncronization : Since threads share the memory resources this can lead to data corruption since these operations are not atomic.


*******************************************************************************************************

### Thread Life-Cycle :- 

1. new 
2. runnable 
3. running
4. blocked 
5. terminated


1. Thread is in new state before the invocation of the start method 
2. Runnable means we have run the function called as start but the thread is not choosed by the scheduler
3. running :- The thread is in running state if the scheduler has selected it.
4. blocked : thread is still alive but not in running state.
5. Terminated :- when the run method exits the thread comed to terminated state.


#### Example of threads by extending the thread class

 
```java

class mythread extends Thread{
    public void run(){
        System.out.println("hello mythread");
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		mythread t1 =new mythread();
		t1.start();
	}
}

```


#### Example of thread by implementing the runnable interface

```java

class mythread implements Runnable{
    public void run(){
        System.out.println("hello mythread");
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		mythread t1 =new mythread();
		Thread t2=new Thread(t1);
		t2.start();
	}
}

```



### Thread Scheduler in java

1. Thread Scheduler is a part of JVM but the algorithm which is used to schedule the thread will depend on the OS.
2. There can be multiple thread in a process.
3. Thread scheduler can use either preemptive or time slicing algorithm.
4. At a time only single thread can be run so thats why we need the thread scheduler to go to the other thread.



### Thread Sleep Method

1. Sleep method of thread class is used to stop the execution of the thread for some time
2. Thread.sleep()
3. in the below example I have created two threads and as soon as sleep method is called in one thread
thread scheduler chooose the second thread to be running.


```java
class mysleepthread extends Thread{
    public void run(){
        
        for (int i=0;i<5 ;i++ ){
            
            try {
                //Thread.sleep(500);
            } catch(Exception e) {
                System.out.println(e);
            }
            
            System.out.println(i);
        } 
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		mysleepthread t1=new mysleepthread();
		mysleepthread t2=new mysleepthread();
		t1.start();
		t2.start();
		
	}
}
```


### Can we start a thread twice

1. yes we can start the thread twice but in that case the first time the thread will run but for the next time it will throw an exception.

```java
public class TestThreadTwice1 extends Thread{  
 public void run(){  
   System.out.println("running...");  
 }  
 public static void main(String args[]){  
  TestThreadTwice1 t1=new TestThreadTwice1();  
  t1.start();  
  t1.start();  
 }  
} 

```

```java

output: running
		Exception
```


### What will happen if we call the run directly

1. it wont generate the different call stack it will go to the same call stack

```java

class myThread extends Thread{
    public void run(){
        System.out.println("running");
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		myThread t1=new myThread();
		t1.run();
		
	}
}

```	
2. 	In this case it will run properly but the run function will act as a normal funtion and will pushed in the same call stack

3. we call the run method of two threads than in that case it will run as a normal function.
	like in below case it will print 0-4 and then again print 0-4

```java
class myThread extends Thread{
    public void run(){
        for (int i=0;i<5;i++ ){
            System.out.println(i);
        } 
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		myThread t1=new myThread();
		myThread t2=new myThread();
		t1.run();
		t2.run();
		
	}
}
```
