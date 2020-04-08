package org.javaHead.mutiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Exercise {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        // Normal Thread - Runnable, Thread, join, yield, Priority
        // . New
        // . Runnable
        // . Running
        // . Terminate
        // . Blocked / Sleep

        Task1 task1 = new Task1();
        task1.start();

        Thread task2 = new Thread(new Task2());
        task2.start();

        task1.join();
        task2.join();

        for(int i = 200;i<300; i++){
            System.out.println(i);
        }
    }
}


class Task1 extends Thread {
    @Override
    public void run() {
        for(int i = 1;i<100; i++){
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Task2 implements Runnable {
    @Override
    public void run() {
        for(int i = 100;i<200; i++){
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}












