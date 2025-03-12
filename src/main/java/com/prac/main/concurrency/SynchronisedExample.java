package com.prac.main.concurrency;
// to make a method synchronised, add synchronised keyword at the declaration of the method
//cannot use synchronised with constructors

public class SynchronisedExample {

    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }

}
