package com.example.multithreading;

public class Thread1 extends Thread{

    public Thread1(String threadName){
        Thread1.currentThread().setName(threadName);
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Inside Thread1 " + i + " " + currentThread().getName());
        }
    }
}
