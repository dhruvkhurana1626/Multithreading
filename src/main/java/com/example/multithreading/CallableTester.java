package com.example.multithreading;

import java.util.concurrent.*;

public class CallableTester {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //task
        Callable<Integer> task = () -> {
            return 10 + 20;
        };

        //rather than creating threads manually
        //im using executor service to create threads for me
        ExecutorService executor = Executors.newSingleThreadExecutor();

        //future represent the future integer result from this task
        Future<Integer> result = executor.submit(task);

        //wait for and retrieve the result
        System.out.println(result.get());

        //shutdown the executor when finished
        executor.shutdown();
    }

}
