package com.cunliang.day02;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int [] nums =  {1,3,5,6,8,9,10,12,15};
        System.out.println("请输入要查找的数： ");
        int x = new Scanner(System.in).nextInt();
        int length = nums.length;
        int min = 0;
        int max = length-1;
        int middle = max/2;
        boolean flag = false;
        while (min<=max) {
            if (x == nums[middle]) {
                System.out.println("找到了");
                flag=true;
                break;
            }
            else if (x < nums[middle]){
                max = middle-1;
                middle = ( max + min )/2;
            }
            else if (x>nums[middle]){
                min = middle+1;
                middle = (max+min)/2;
            }

        }

        if (!flag) System.out.println("没找到");

    }
}
