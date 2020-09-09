package com.cunliang.day02;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {

        int arr[] = new int[6]; //

        for (int i=0;i<arr.length;i++){
            arr[i] = (int) (Math.random()*6) +1;
            for (int j = 0;j<i;j++){
                if (arr[i]==arr[j]){
                    i--;
                    break;
                }
            }


        }
        System.out.println(Arrays.toString(arr));


    }
}
