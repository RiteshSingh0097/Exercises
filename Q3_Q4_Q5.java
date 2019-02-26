package com.bootcamp.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q3_Q4_Q5 {

    public static void main(String[] args) {

        // Q3. Use a singleThreadExecutor to submit multiple threads.
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread 1");
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread 2");
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread 3");
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("thread 4");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            // Q6. Try shutdown() and shutdownNow() and observe the difference.

            /* shutdown() will just tell the executor service that it can't accept
               new tasks, but the already submitted tasks continue to run
            */
            executorService.shutdown();
        }
        // Q5. Use isShutDown() and isTerminate() with ExecutorService.
        System.out.println(executorService.isShutdown());
        System.out.println(executorService.isTerminated());

        /*
        shutdownNow() will do the same AND will try to cancel the already
        submitted tasks by interrupting the relevant threads. Note that if
        your tasks ignore the interruption, shutdownNow will behave exactly
        the same way as shutdown.
        */
        executorService.shutdownNow();
        System.out.println(executorService.isTerminated());
    }
}
