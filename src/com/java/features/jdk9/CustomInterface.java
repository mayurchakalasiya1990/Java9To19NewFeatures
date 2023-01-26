package com.java.features.jdk9;

/*

In Java 7 and all earlier versions, interfaces were very simple. They could only contain public abstract methods. These interface methods MUST be implemented by classes which choose to implement the interface.

From Java 8, apart from public abstract methods, you can have public static methods and public default methods.

Since java 9, you will be able to add private methods and private static method in interfaces.

These private methods will improve code re-usability inside interfaces. Foe example, if two default methods needed to share code, a private interface method would allow them to do so, but without exposing that private method to it’s implementing classes.

Using private methods in interfaces have four rules :

1. Private interface method cannot be abstract.
2. Private method can be used only inside interface.
3. Private static method can be used inside other static and non-static interface methods.
4. Private non-static methods cannot be used inside private static methods.

 */
public interface CustomInterface {

    public abstract void method1();

    public default void method2() {
        method4();  //private method inside default method
        method5();  //static method inside other non-static method
        System.out.println("default method");
    }

    public static void method3() {
        method5(); //static method inside other static method
        System.out.println("static method");
    }

    private void method4(){
        System.out.println("private method");
    }

    private static void method5(){
        System.out.println("private static method");
    }
}
