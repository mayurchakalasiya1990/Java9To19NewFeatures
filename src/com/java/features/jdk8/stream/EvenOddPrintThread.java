package com.java.features.jdk8.stream;

import java.util.stream.IntStream;

public class EvenOddPrintThread {

    public static void main(String[] args) {
        Runnable evenRunnable = () -> {
            IntStream.rangeClosed(1,100).forEach(i -> {
                if(i%2==0){
                    System.out.println(Thread.currentThread().getName()+" "+i);
                }
            });
        };

        Runnable oddRunnable = () -> {
            IntStream.rangeClosed(1,100).forEach(i -> {
                if(i%2==1){
                    System.out.println(Thread.currentThread().getName()+" "+i);
                }
            });
        };

        new Thread(evenRunnable).start();
        new Thread(oddRunnable).start();
    }
}
