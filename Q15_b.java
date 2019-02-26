// use of await() and signalAll()

package com.bootcamp.multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Q15_b {

    Lock lock = new ReentrantLock(true);
    Condition condition = lock.newCondition();

    public void worker1() {
        try {
            lock.lock();
            System.out.println("Worker1 Started");

            // await() method invoked
            condition.await();
            System.out.println("Worker1 Done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void worker2() {
        try {
            lock.lock();
            System.out.println("Worker 2 Started");
            condition.await();
            System.out.println("Worker 2 Done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }

    public void worker3() {

        try {
            lock.lock();
            System.out.println("Worker 3 Started");
            condition.await();
            System.out.println("Worker 3 Done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public void worker4() {
        try {
            lock.lock();
            System.out.println("Worker 4 Started");
            System.out.println("Worker 4 Done");

            // signalAll() method invoked
            condition.signalAll();
        } finally {
            lock.unlock();
        }


    }

    public static void main(String[] args) {
        Q15_b demo = new Q15_b();
        new Thread(() -> {
            demo.worker1();
        }).start();
        new Thread(() -> {
            demo.worker2();
        }).start();
        new Thread(() -> {
            demo.worker3();
        }).start();
        new Thread(() -> {
            demo.worker4();
        }).start();
    }
}
