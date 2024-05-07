package com.brite.jee.leet;

public class IndexOfFirstOccurrence {

    private static void strStr(String haystack, String needle) {
        if (haystack.indexOf(needle)!=-1) {
            int haystacklength = haystack.length();
            int needleLength = needle.length();
            for(int i=0;i<haystacklength;i++){
                String substring = haystack.substring(i,i+needleLength);
                if (needle.equals(substring)){
                //System.out.println(substring);
                System.out.println("equal  "+"beginning Index :" +(i+1) + " ending index  "+((i+needleLength)));
                break;
                }
            }

        }else{
            System.out.println(-1);
            //System.out.println(0);
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
        //String haystack ="dubaikamir";
        //String needle = "mir";

        IndexOfFirstOccurrence.strStr(haystack, needle);
    }
}
