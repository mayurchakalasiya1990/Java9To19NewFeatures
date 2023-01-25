package com.java.features.jdk8.functionalinterface;

public class Paytm implements UPIPayment{
    @Override
    public void doPayment(String source, String test) {
        UPIPayment.datePatterns("yyyy-MM-dd");
    }
}
