package com.cunliang.day03.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        //冒泡排序

        int [] nums = {1,5,7,3,-3,9,1,2,0,-7};
        for (int i = 0;i<nums.length;i++){

            for (int j = 0;j<nums.length-1-i;j++){
                if (nums[j]>nums[j+1]){
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }
        System.out.println( Arrays.toString(nums));
    }
}
