package com.brite.jee.leet.easy;

import javax.swing.text.AttributeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LengthOfLastWord {
    private static int lastwordlength(String input) {
        String[] string = input.split("\\s");
        return string[string.length-1].length();
    }

    public static void main(String[] args) {
        //String input = "Hello World";
        //String input = "   fly me   to   the moon  ";
       // String input =  "luffy is still joyboy";
        String input =  "searching for my laptop      ";
        System.out.println(lastwordlength(input));
    }

}
