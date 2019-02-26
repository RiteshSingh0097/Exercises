//Use sleep and join methods with thread.

package com.bootcamp.multithreading;

public class Q2 implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {

                // sleep() method invoked.
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " running...");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Q2());
        thread.start();
        try {

            // join() method invoked.
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 5; i++)
            System.out.println(Thread.currentThread().getName() + " running...");
    }
}
