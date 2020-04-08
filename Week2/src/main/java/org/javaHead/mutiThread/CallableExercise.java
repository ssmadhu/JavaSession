package org.javaHead.mutiThread;

import java.util.concurrent.*;

public class CallableExercise {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Executor Service - Callable, Future, Pool

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Task t1 = new Task("Madhu");
        System.out.println("Hello...");
        //        List<Thread> a = new ArrayList<>();
//        a.add(new Task1());
//        a.add(new Thread(new Task2()));
        Future<String> a = executorService.submit(t1);

        System.out.println(a.get());
//        Task1 task1 = new Task1();
//        Thread task2 = new Thread(new Task2());
//        executorService.submit(task1);
//        executorService.submit(task2);
        executorService.shutdown();
        // volatile
        //fork/join Pool
    }
}

class Task implements Callable<String> {
    String a;
    public Task(String a){
        this.a = a;
    }
    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello" + a;
    }
}