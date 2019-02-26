package com.bootcamp.multithreading;

import java.util.concurrent.*;

public class Q6 {

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> integerFuture = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() {
                return 2;
            }
        });

        executorService.shutdown();

        if (integerFuture.isDone()) {
            System.out.println(integerFuture.get());
        }

        if (integerFuture.isCancelled()) {
            System.out.println("task cancelled");
        }
    }
}
