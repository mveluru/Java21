package com.brite.jee.leet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionShuffle {

    public static void main(String[] args){

        List<Integer> integers = new ArrayList<>();
        int count=0;
        while (count<50){
            integers.add(++count);
        }


        System.out.println("IntStream of Integers");
        System.out.println(integers);
        Collections.shuffle(integers);
        System.out.println("Shuffled Integers");
        System.out.println(integers);
    }
}
