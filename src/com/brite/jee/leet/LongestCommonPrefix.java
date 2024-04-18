package com.brite.jee.leet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import static java.util.Arrays.stream;

public class LongestCommonPrefix {

    public static void main(String[] args) {


        String[] stringArray = {"flower", "flow", "flight"};

        int length= Arrays.stream(stringArray).map(e->e.length()).reduce((i1, i2) -> Math.min(i1,i2)).get();
        System.out.println(length);
        String value = Arrays.stream(stringArray).filter(e->e.length()==length).findAny().get();
        Set<String> prefixset = new LinkedHashSet<>();
        for (int i=0;i<=value.length();i++){
           String prefix = value.trim().substring(0,i);

           // System.out.println(substringvalue);
            for(int j =0;j<stringArray.length;j++){

               String substr = stringArray[j].trim().substring(0,i);
                System.out.println(substr+": "+prefix);
               if(prefix.equals(substr)){
                   System.out.println(true);
               }else{
                 break;
               }
            }
        }
       // System.out.println(prefixset);

    }
}
