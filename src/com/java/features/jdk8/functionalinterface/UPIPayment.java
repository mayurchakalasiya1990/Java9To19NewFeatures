package com.java.features.jdk8.functionalinterface;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface UPIPayment {

    void doPayment(String source, String test);
    default  double getScratchCard(){
        return new Random().nextDouble();
    }

    static String datePatterns(String patterns){
        SimpleDateFormat format =new SimpleDateFormat(patterns);
        return format.format(new Date());
    }
}
