package main.java.async;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(()->{
            try{
                System.out.println("Hello from Ali");
                Thread.sleep(20000);
                System.out.println("Hello from sleep");

            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            return "Hello";
        });
        try {
            System.out.println("Hello from java");
            String result = future.get();
            System.out.println("Hi");
            System.out.println(result);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
    }
}
