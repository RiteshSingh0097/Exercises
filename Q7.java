package com.bootcamp.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Q7 {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000L);
                    System.out.println("Thread Running");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        executorService.shutdown();

        executorService.awaitTermination(4000L, TimeUnit.MILLISECONDS);

        if (executorService.isTerminated()) {
            System.out.println("Terminated");
        } else {
            System.out.println("tasks still remaining");
        }
    }
}
