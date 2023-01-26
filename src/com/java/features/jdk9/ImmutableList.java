package com.java.features.jdk9;

import java.util.List;
/*

Use List.of() static factory methods to create immutable lists. It has following different overloaded versions –

static <E> List<E>  of()
static <E> List<E>  of(E e1)
static <E> List<E>  of(E e1, E e2)
static <E> List<E>  of(E e1, E e2, E e3)
static <E> List<E>  of(E e1, E e2, E e3, E e4)
static <E> List<E>  of(E e1, E e2, E e3, E e4, E e5)
static <E> List<E>  of(E e1, E e2, E e3, E e4, E e5, E e6)
static <E> List<E>  of(E e1, E e2, E e3, E e4, E e5, E e6, E e7)
static <E> List<E>  of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8)
static <E> List<E>  of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9)
static <E> List<E>  of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10)
//varargs
static <E> List<E>  of(E... elements)

The List instances created by these methods have the following characteristics:

These lists are immutable. Elements cannot be added, removed, or replaced in these lists. Calling any mutator method (i.e. add, addAll, clear, remove, removeAll, replaceAll) will always cause UnsupportedOperationException to be thrown.
They do not allow null elements. Attempts to add null elements result in NullPointerException.
They are serializable if all elements are serializable.
The order of elements in the list is the same as the order of the provided arguments, or of the elements in the provided array.

 */
public class ImmutableList {
    public static void main(String[] args)
    {
        List<String> names = List.of("Lokesh", "Amit", "John");

        //Preserve the elements order
        System.out.println(names);

        //names.add("Brian"); //UnsupportedOperationException occured

        //java.lang.NullPointerException
        //List<String> names2 = List.of("Lokesh", "Amit", "John", null);
    }
}
