package com.java.features.jdk9;

import java.util.Map;

/*
Map factory methods are same as List or Set overloaded factory methods.
Only difference is that the signatures of the of methods take alternating keys and values as arguments. e.g.

static <K,V> Map<K,V> of()
static <K,V> Map<K,V> of(K k1, V v1)
static <K,V> Map<K,V> of(K k1, V v1, K k2, V v2)
...
...
static <K,V> Map<K,V> ofEntries(Map.Entry<? extends K,? extends V>... entries)

 */
public class ImmutableMap {
    public static void main(String[] args) {
        Map<String, String> names = Map.ofEntries(
                Map.entry("1", "Lokesh"),
                Map.entry("2", "Amit"),
                Map.entry("3", "Brian"));

        System.out.println(names);

        //UnsupportedOperationException
        //names.put("2", "Ravi");
    }
}
