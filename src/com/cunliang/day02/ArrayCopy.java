package com.cunliang.day02;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[] args) {

        int []arr1;
        int []arr2;

        arr1 = new int[]{2,3,5,7,11,13,17,19};
        System.out.println("aar1:" + Arrays.toString(arr1));
        arr2 = arr1; //把地址给了2。实际上只有一个数组
        for (int i =0;i<arr2.length;i++){
            if (i%2==0){
                arr2[i] = i;
            }
        }
        System.out.println("aar2:" + Arrays.toString(arr2));
        System.out.println("aar1:" + Arrays.toString(arr1));


    }
}
