package com.brite.jee.practice1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExamples {
    public static void main(String[] args) {
        IntStream intStream1 = IntStream.rangeClosed(1, 50); //includes both starting and ending
        IntStream intStream2 = IntStream.range(51, 100); //includes starting end exclusive
        Set<Integer> set1 = intStream1.boxed().collect(Collectors.toSet());
        Set<Integer> set2 = intStream2.boxed().collect(Collectors.toSet());
        System.out.println(set1);
        System.out.println("\n" + set2);

        int[] nums = {1, 3, 5, 7, 9};
        int value = Arrays.stream(nums).boxed().reduce(0, Integer::sum).intValue();
        System.out.println(value);

        int value1 = Arrays.stream(nums).boxed().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(value1);

        int[] numss =new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11};
        int[] abc = Arrays.stream(numss).sorted().toArray();
        System.out.println(Arrays.toString(abc));
        List<Integer> list = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
       int a = Arrays.stream(numss).boxed().sorted().skip((numss.length-1)).findFirst().get();
        System.out.println(a);

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.stream(array).boxed().skip(array.length-1).findFirst().get());

        int[] dupsarray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 8,9};

        Set<Integer> finalDupsets = new HashSet<>();
        System.out.println(Arrays.stream(dupsarray).boxed().filter(e->!finalDupsets.add(e)).collect(Collectors.toSet()));

        // common integers
        int[] input1 = {2,7,17,19,20,45,56,159,239};
        int[] intput2 = {7,12,15,19,22,34,55,150,159};

        List<Integer> input1list = Arrays.stream(input1).boxed().toList();
        List<Integer> input2list = Arrays.stream(intput2).boxed().toList();
        List<Integer> commonlist = input1list.stream().filter(input2list::contains).toList();
        System.out.println(commonlist);


    }
}
