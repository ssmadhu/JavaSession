package org.javaHead.mutiThread;

public class SyncronizedExercise {
    public static void main(String[] args) throws InterruptedException {
        myTask task1 = new myTask();
        Thread t1 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i =0;i<1000;i++){
                            task1.add();

                        }
                    }
                }
        );

        Thread t2 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        for(int i =0;i<1000;i++){
                            task1.add();
                        }
                    }
                }
        );

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(task1.i);
    }
}
class myTask {
    int i;
    public synchronized void add(){
        i++;
    }
}
