package com.java.features.jdk9;


public class PrivateInterfaceMethods implements CustomInterface{
    @Override
    public void method1() {
        System.out.println("abstract method");
    }

    public static void main(String[] args){
        CustomInterface instance = new PrivateInterfaceMethods();
        instance.method1();
        instance.method2();
        CustomInterface.method3();
    }
}
