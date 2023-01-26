package com.java.features.jdk9;

import java.util.Set;

/*
All Set factory methods have the same signature as List.

static <E> Set<E> of()
static <E> Set<E> of(E e1)
static <E> Set<E> of(E e1, E e2)
static <E> Set<E> of(E e1, E e2, E e3)
static <E> Set<E> of(E e1, E e2, E e3, E e4)
static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5)
static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6)
static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7)
static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8)
static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9)
static <E> Set<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10)
//varargs
static <E> Set<E> of(E... elements)


Set behave very similar to List with only few differences. e.g.

Set do not allow duplicate elements as well. Any duplicate element passed will result in IllegalArgumentException.
The iteration order of set elements is unspecified and is subject to change.
 */
public class ImmutableSet {
    public static void main(String[] args) {
        Set<String> names = Set.of("Lokesh", "Amit", "John");

        //Elements order not fixed
        System.out.println(names);

        //names.add("Brian"); //UnsupportedOperationException occured

        //java.lang.NullPointerException
        //Set<String> names2 = Set.of("Lokesh", "Amit", "John", null);

        //java.lang.IllegalArgumentException
        //Set<String> names3 = Set.of("Lokesh", "Amit", "John", "Amit");

    }
}
