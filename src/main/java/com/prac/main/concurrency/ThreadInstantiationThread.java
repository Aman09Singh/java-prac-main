package com.prac.main.concurrency;
// Instantiate thread normally and manage the threads explicitly.
// Extend Thread class
public class ThreadInstantiationThread extends Thread{

    public void run(){
        System.out.println("inside run method");
    }

    public static void main(String ars[]) throws InterruptedException {
        //manually creating obj
        ThreadInstantiationThread threadInstantiationThread =  new ThreadInstantiationThread();
        threadInstantiationThread.run();
        //using ThreadInstantiationThread class so that we can directly use this instead of the Thread class.
        new ThreadInstantiationThread().start();
        // join() - used to pause the current thread and wait till T is completed
        //throws InterruptedException
        threadInstantiationThread.join();
    }
}
