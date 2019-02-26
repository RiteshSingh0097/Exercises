package com.bootcamp.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Process implements Runnable {
    int id;

    public Process(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Thread name::" + Thread.currentThread().getName() + " Start :" + id);
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread name::" + Thread.currentThread().getName() + " End :" + id);
    }
}

public class Q9 {
    public static void main(String[] args) {


        // creates a thread pool with newFixedThreadPool()
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        /*
         * creates a thread pool with newCachedThreadPool()
         * */
        //  ExecutorService executorService= Executors.newCachedThreadPool();

        for (int i = 0; i <= 9; i++) {
            executorService.submit(new Process(i));
        }
        executorService.shutdown();
    }
}
