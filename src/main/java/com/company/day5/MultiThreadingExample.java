package com.company.day5;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public  class MultiThreadingExample {
    public static void main(String[] args) throws InterruptedException {
        // Thread pools used to execute a task efficiently
//        Task task = new Task();
//        Thread thread = new Thread();
//       thread.start()
        // 10 ms will just be wasted to create a thread
        // and start a thread -> run() method will get executed
        // 10 ms <--
        // Thread pool you already maintain a set of thread objects ready
        // It's like during the start of the program
        // you create say 10 Thread objects.
        // thread1.start() <-- run() method and start executing statements.
// creating a threadpool of a single thread will not achieve concurrency
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
        ExecutorService executorService = Executors.newCachedThreadPool();
        // when a task is required to be executed it will create a new thread then.
        // thread-1 is created to execute task-1 and 1 ms
        // Task-1 terminates. thread-1 will still stay in the pool.
        // when a next task comes Task-2 , thread-1 and assign it to Task-2
        // The new threads created by the cachedThreadPool will stay for a short period of time.

        // creates a fixed number of threads in a pool.
        // If a thread completes executing a task, it can be reused to excute another task.

        // The overhead for creating the threads is when you run your program.
        // And then whenever you want to run a task at that time there is no overhead.
        executorService.execute(new Print(1,1));
        executorService.execute(new Print(2,1));
        executorService.execute(new Print(3,1));
        executorService.execute(new Print(4,1));
        executorService.execute(new Print(5,1));
        executorService.wait();

        // round-robin scheduling algorithm
        // Each tasks execute a certain amount of time
        // before that tasks leaves the CPU
        // 3 threads are used to execute 4 tasks
        // Each task is assigned a time quanta to run say = 1 ms.
        // T1 -> thread1 , T2-> thread2 , T3 -> thread3
        // T4-> thread1, T2-> thread3 , T2-> thread2
/*
1) I have a web site running / software
so any user can come on my website and interact with it...
and during this interaction process my code may run several tasks.
task-1, task-2, task-3  -> 10 ms will be wasted to create threads
2) I use the executorservice
ExecutorService executorService = Executors.newFixedThreadPool(10);
The threads are created when the software is run or when the code is ready to be executed.
the overhead of creating threads is shifted from the point of user interactivity to
the software launch.
 */

        executorService.shutdown();
    }
}
class Print implements Runnable{
    private Integer integerToPrint;
    private Integer numOfTimeToPrint;

    public Print(Integer _integerToPrint,Integer _numOfTimeToPrint){
        integerToPrint=_integerToPrint;
        numOfTimeToPrint=_numOfTimeToPrint;
    }

    @Override
    public void run() {
        for(int i=0;i<numOfTimeToPrint;i++) {
            System.out.println(Thread.currentThread().getName() + " , "+integerToPrint);
//                 try {
//                     Thread.sleep(10);
//                 } catch (InterruptedException e) {
//                     e.printStackTrace();
//                 }
        }
    }
}