package com.brite.jee.leet;

import java.util.*;
import java.util.stream.Collectors;

public class NonRepeatsubstring {

    public static void main(String[] args) {
        String input = "lkjsdflkjldsfffffsss";
        Set<String> setinput = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String ss = input.substring(i, j);
                if (ss.length()>2 && (ss.chars().distinct().count() == ss.length())) {
                    setinput.add(input.substring(i, j));
                }

            }
        }


        //Arrays.sort(setinput.toArray());


        setinput= setinput.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toSet());
        System.out.println(setinput);




    }
}
