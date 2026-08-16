package com.example.multithreading;

public class MyTask implements Runnable{

    //run() is the abstract method in Runnable
    //So we have to give the implementation of it

    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Inside Thread2 " + i);
        }
    }

}
