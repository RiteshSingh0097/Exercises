package com.bootcamp.multithreading;

public class Q10 {

    int count;

    //  synchronized method to enable synchronization
    synchronized public void incrementCount() {
        count++;
    }

    public void worker1() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount();
        }
    }

    public void worker2() {
        for (int i = 1; i <= 1000; i++) {
            incrementCount();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Q10 synchronizeDemo = new Q10();
        Thread thread1 = new Thread(() -> {
            synchronizeDemo.worker1();
        });
        Thread thread2 = new Thread(() -> {
            synchronizeDemo.worker2();
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchronizeDemo.count);
    }
}
