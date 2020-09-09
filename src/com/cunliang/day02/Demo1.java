package com.cunliang.day02;

import java.util.Scanner;


public class Demo1 {
    public static void main(String[] args) {

        //求两个数的最大公约数和最小公倍数，12 20

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数： ");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数： ");
        int b = scanner.nextInt();
        int maxCommon = 0;
        int minCommon = 0;
        int max = a > b ? a : b;
        for (int i = max;i>=1;i--){
            if (a%i==0 && b%i==0){
              //  System.out.println(i);
                maxCommon = i;
                break; //只需最大的，所以第一次找到的就直接跳出for循环。
            }
        }
        
        for (int j = max;j<a*b;j++){
            if (j%a==0&&j%b==0){
                minCommon = j;
                break;
            }
        }

        System.out.println("最大公约数： "+maxCommon);
        System.out.println("最小公倍数： "+minCommon);



    }
}
