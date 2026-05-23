package com.interview2026;

import java.util.Arrays;
import java.util.Scanner;

public class AnagaramExample {
    public static void main(String[] args) {
        String s1 = "Silent".toLowerCase();
        String s2 = "listen".toLowerCase();
        char[] s1char = s1.toCharArray();
        char[] s2char = s2.toCharArray();
        Arrays.sort(s1char);
        Arrays.sort(s2char);
        if (Arrays.equals(s1char,s2char)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
