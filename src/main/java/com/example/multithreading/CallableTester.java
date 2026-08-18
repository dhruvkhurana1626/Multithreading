package com.example.multithreading;

import java.util.concurrent.*;

public class CallableTester {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<Integer> task = () -> {
            return 10 + 20;
        };

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<Integer> result = executor.submit(task);

        System.out.println(result.get());

        executor.shutdown();
    }

}
