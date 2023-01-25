package com.java.features.jdk8.stream;

import java.util.Comparator;
import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class EvenOddThreadPrintCompletableFuture {

    private static Object object=new Object();
    private static IntPredicate evenCond = e->e%2 == 0;
    private static IntPredicate oddCond = e->e%2 == 1;
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync(()-> EvenOddThreadPrintCompletableFuture.printNumber(oddCond));
        CompletableFuture.runAsync(()-> EvenOddThreadPrintCompletableFuture.printNumber(evenCond));
        Thread.sleep(1000);
    }

    private static void printNumber(IntPredicate condition) {
        IntStream.rangeClosed(1,50).filter(condition).forEach(EvenOddThreadPrintCompletableFuture::execute);
    }

    private static void execute(int no){
        synchronized (object){
            try{
                System.out.println(Thread.currentThread().getName()+" - "+no);
                object.notify();
                object.wait();
                            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
