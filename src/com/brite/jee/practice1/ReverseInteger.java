package com.brite.jee.practice1;

public class ReverseInteger {

    public static void main(String[] args) {
       Long x = Long.valueOf(Integer.MAX_VALUE)+1;

        Long sum = Long.valueOf(0);
        while (x > 0) {
            Long reminder = x % 10;
            //System.out.print(reminder+" ");
            sum = (sum * 10 + reminder) <= Integer.MAX_VALUE && ((sum * 10 + reminder) >= Integer.MIN_VALUE) ?  sum * 10 + reminder:0;
            if (sum == 0) {
                break;
            }
            x = x / 10;
        }

        System.out.println(sum);
    }
}
