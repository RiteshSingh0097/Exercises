package com.bootcamp.multithreading;


public class Q13 {

    public static void main(String[] args) {
        Q13 demo = new Q13();
        new Thread(() -> {
            demo.worker1();
        }).start();

        new Thread(() -> {
            demo.worker2();
        }).start();
    }

    public void worker1() {
        synchronized (this) {
            System.out.println("Worker1 Started");
            try {
                // wait() method call
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Worker1 Done");
        }
    }

    public void worker2() {
        synchronized (this) {
            System.out.println("Worker 2 Started");
            System.out.println("Worker 2 Done");
            // notify() method revoked
            notify();
        }
    }
}
