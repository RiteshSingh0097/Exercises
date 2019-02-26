
// Create and Run a Thread using Runnable Interface.

package com.bootcamp.multithreading;

public class Q1_a implements Runnable {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " running...");
        new Thread(new Q1_a()).start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " running...");
    }
}
