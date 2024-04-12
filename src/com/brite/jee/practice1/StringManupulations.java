package com.brite.jee.practice1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringManupulations {
    public static void main(String[] args) {
        String join = String.join("-","Murali","Dhar","Reddy","Veluru");
        System.out.println(join);

        // count similar worlds
        String value = "Hello Hello Guru Guru Murali Murali Hello Hello Guru Guru Murali Murali " +
                "Hello Hello Guru Guru Murali Murali Hello Hello Guru Guru Murali Murali";
        String[] countSimilar = value.split("\\s");
        Map<String,Long> countMap = Arrays.stream(countSimilar).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        countMap.forEach((k,v)-> System.out.println(k+": "+v));

    }
}
