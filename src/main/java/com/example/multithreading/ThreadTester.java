package com.example.multithreading;

public class ThreadTester {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Thread is Runnning");

        Thread1 t1 = new Thread1("T1newThread");
        t1.run();

        Thread1 t3 = new Thread1("T1newThread");
        t3.run();

        t3.join();

        MyTask task = new MyTask(); //represent the task/work
        Thread t2 = new Thread(task); //represent the Execution mechanism
        t2.run();

        System.out.println("Thread is Exiting");
    }
}
