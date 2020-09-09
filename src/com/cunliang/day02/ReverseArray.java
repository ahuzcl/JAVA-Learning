package com.cunliang.day02;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String []string = new String[]{"a","b","c","d","f","g"};
        int length = string.length;
        int start = 0;
        while (start<length/2){

            String tmp = string[start];
            string[start] = string[length-start-1];
            string[length-start-1] = tmp;
            start++;
        }
        System.out.println(Arrays.toString(string));
    }
}
