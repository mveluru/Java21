package com.java21.grind75.week1;

import java.util.Arrays;

public class Bubblesort {
    public void bsort(int[] array) {
        int len = array.length;
        for (int i = 0; i < len; i++) {
            boolean flag = true;
            for (int j = 1; j < len; j++) {
                if (array[j] > array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(Arrays.toString(array));
                break;
            }
        }

    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 5, 7, 8, 9, 10};
        Bubblesort bubblesort = new Bubblesort();
        bubblesort.bsort(array);
    }
}
