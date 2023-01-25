package com.java.features.jdk8.stream;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCountUsingStream {

    public static void main(String[] args) {
        String name = "Mayur Chakalasiya";

        Map<String,Long> countMap = Arrays.stream(name.split(""))
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),Collectors.counting())
                );
        System.out.println(countMap);
    }

}
