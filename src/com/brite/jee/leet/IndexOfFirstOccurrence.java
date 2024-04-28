package com.brite.jee.leet;

public class IndexOfFirstOccurrence {

    private static void strStr(String haystack, String needle) {
        if (needle.indexOf(haystack)==-1) {
            int haystacklength = haystack.length();
            int needleLength = needle.length();
            for(int i=0;i<haystacklength;i++){
                String substring = haystack.substring(i,i+needleLength);
                if (needle.equals(substring)){
                System.out.println(substring);
                System.out.println("equal  "+i+" , "+(i+needleLength));
                break;
                }
            }
            System.out.println(-1);

        }else{
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        //String haystack = "leetcode";
        //String needle = "leetco";
        //String haystack = "sadbutsad";
        //String needle = "sad";
        //String haystack = "greekforgreek";
        //String needle = "for";
        String haystack ="kavihellohello";
        String needle = "hello";

        IndexOfFirstOccurrence.strStr(haystack, needle);
    }
}
