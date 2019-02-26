//Create and Run a Thread using Thread class.

package com.bootcamp.multithreading;

public class Q1_b extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " running...");
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " running...");
        new Q1_b().start();
    }
}
