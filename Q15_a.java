// Use of await() and signal() method.

package com.bootcamp.multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Q15_a {

    Lock lock = new ReentrantLock(true);
    Condition condition = lock.newCondition();

    public void worker1() {
        try {
            lock.lock();
            System.out.println("worker 1 Started");
            condition.await();
            System.out.println("worker 1 Finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void worker2() {
        try {
            lock.lock();
            System.out.println("worker 2 Started");
            System.out.println("worker 2 Finished");
            condition.signal();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Q15_a demo = new Q15_a();
        Thread thread1 = new Thread(() -> {
            demo.worker1();

        });
        Thread thread2 = new Thread(() -> {
            demo.worker2();
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
