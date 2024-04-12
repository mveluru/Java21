package com.brite.jee.practice1;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean isAnagram = true;
        if (a.length() != b.length() && (a.length()<1 && a.length()>50) &&
                (b.length()<1 && b.length()>50)){
            return isAnagram=false;
        }else{
            a = a.toLowerCase();
            b = b.toLowerCase();
            char[] achars = a.toCharArray();
            char[] bchars = b.toCharArray();

            Arrays.sort(achars);
            System.out.println(achars);
            Arrays.sort(bchars);
            System.out.println(bchars);

            for (int i=0;i<achars.length;i++){
                isAnagram =false;
                if (achars[i]==bchars[i]){
                    isAnagram = true;
                }else{
                    return isAnagram;
                }
            }

        }
        return isAnagram;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //String a = "anagram";
        //String b = "margana";

        String a = "anagramm";
        String b = "marganaa";
        boolean isAnagram = Anagram.isAnagram(a,b);
        if (isAnagram){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }

    }
}
