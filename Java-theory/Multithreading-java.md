

# Multithreading in java

1. Thread is a light weight process that excecute some tasks
2. There are two types of threads user thread and daemon thread. When we run a java program main is the first user thread that we create we can create multiple threads in java both user and daemon thread.

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