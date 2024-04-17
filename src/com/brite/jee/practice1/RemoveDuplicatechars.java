package com.brite.jee.practice1;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveDuplicatechars {

    public static void main(String[] args) {
        String input ="ddslkjfdskjdskkkdsla";
      List<Character> abc = new LinkedList<>();
       char[] inputchar = input.toCharArray();
       for (char c: inputchar){
           abc.add(c);
       }
       String string = abc.stream().distinct().map(String::valueOf).collect(Collectors.joining());
        System.out.println(string);

      String newString = Arrays.stream(input.split("")).distinct().map(String::valueOf).collect(Collectors.joining());
        System.out.println(newString);










    }
}
