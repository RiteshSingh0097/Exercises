package com.bootcamp.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class Q12 {

    // using AtomicInteger class to make variable synhronized.
    AtomicInteger count = new AtomicInteger();

    public void worker1() {
        for (int i = 1; i <= 1000; i++) {
            count.incrementAndGet();
        }
    }

    public void worker2() {
        for (int i = 1; i <= 1000; i++) {
            count.incrementAndGet();
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Q12 synchronizeDemo = new Q12();
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
