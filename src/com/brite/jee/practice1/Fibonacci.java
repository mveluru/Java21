package com.brite.jee.practice1;

import java.util.Arrays;

public class Fibonacci {

    protected int[] fiboseries(int n) {
        int[] fibo = new int[n];
        if (n == 0) {
            fibo[0] = 0;
            return fibo;

        } else if (n == 1) {
            fibo[0] = 0;
            fibo[1] = 1;
            return fibo;
        } else {
            fibo[0] = 0;
            fibo[1] = 1;
            for (int i = 2; i < n; i++)
                fibo[i] = fibo[i - 2] + fibo[i - 1];
        }
        return fibo;
    }
 public static void main(String[] args){
     Fibonacci fibo  = new Fibonacci();
     Arrays.stream(fibo.fiboseries(15)).forEach(e-> System.out.print(e+" "));

 }

}
