package com.brite.jee.practice1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Instreams {
    public static void main(String[] args){
        int[] m1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] m2 = new int[]{2, 5, 6};
        int[] m3 = IntStream.concat(IntStream.of(m1),IntStream.of(m2)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(m3));
    }
}
