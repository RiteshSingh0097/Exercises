package com.bootcamp.multithreading;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Q8 {

    public static void main(String[] args) {

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        // scheduling the task with schedule() method
        executorService
                .schedule(new Runnable() {
                              @Override
                              public void run() {
                                  System.out.println("Task executed after 1 second");
                              }
                          },
                        1,
                        TimeUnit.SECONDS);
        // scheduling the task with scheduleWithFixedDelay()
        executorService
                .scheduleWithFixedDelay(new Runnable() {
                                            @Override
                                            public void run() {
                                                try {
                                                    Thread.sleep(2000L);
                                                    System.out.println("ScheduleWithFixedDelay");
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }

                                            }
                                        }
                        ,
                        0,
                        1,
                        TimeUnit.SECONDS);
        // scheduling the task with scheduleAtFixedRate()
        executorService
                .scheduleAtFixedRate(new Runnable() {
                                         @Override
                                         public void run() {
                                             try {
                                                 Thread.sleep(2000L);
                                                 System.out.println("ScheduleAtFixedRate");
                                             } catch (InterruptedException e) {
                                                 e.printStackTrace();
                                             }
                                         }
                                     }
                        ,
                        0,
                        1, TimeUnit.SECONDS);
    }
}
