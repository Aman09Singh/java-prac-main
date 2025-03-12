package com.prac.main.concurrency;
// Instantiate thread normally and manage the threads explicitly.
// Extend Runnable interface
public class ThreadInstantiationRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Inside run method");
    }

    public static void main(String ar[]){
        //manual object creation
        ThreadInstantiationRunnable threadInstantiation = new ThreadInstantiationRunnable();
        threadInstantiation.run();
        //direct calling the start method to start a thread
        new Thread(new ThreadInstantiationRunnable()).start();
    }

}
