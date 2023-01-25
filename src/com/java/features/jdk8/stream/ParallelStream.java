package com.java.features.jdk8.stream;

import java.util.stream.IntStream;

public class ParallelStream {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,10).forEach(t-> System.out.println(Thread.currentThread()+" "+t));
        System.out.println("==============================================================================");
        IntStream.rangeClosed(1,10).parallel().forEach(t-> System.out.println(Thread.currentThread()+" "+t));
    }
}
