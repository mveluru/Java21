package com.brite.jee.leet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AdduniqueElements {


    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 4, 4, 5};
        //identify duplicate elements
        //add elements != duplicate elements
        Set<Integer> uniqueelements = new HashSet<>();
        List<Integer> dups = Arrays.stream(nums).filter(e -> !uniqueelements.add(e)).boxed().toList();
        int sum=0;
        for(Integer i: uniqueelements){
            if (!dups.contains(i)){
                sum = sum+i;
            }

        }
        System.out.println(sum);
    }

}
