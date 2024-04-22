package com.brite.jee.leet;

public class Sum9 {

    public static void main(String[] args) {
        int[] nums = {2, 1, 6, 4, 2, 1};
        int beginIndex = 0;
        int endIndex = nums.length - 1;
        while (beginIndex < endIndex) {
            boolean isvaluesFound = false;
            for (int i = 0 ; i <=nums.length ; i++) {
                if ((nums[beginIndex] + nums[endIndex] + nums[i] == 9) && (i!=beginIndex && i!=endIndex)) {
                    System.out.println(nums[beginIndex] + " " + nums[endIndex] + " " + nums[i]);
                    isvaluesFound = true;
                    i=nums.length;
                }

            }//for loop

            if (isvaluesFound) {
                break;
            }
            beginIndex++;
            endIndex--;

        }

    }
}
