package com.cunliang.day02;

public class Demo4 {
    public static void main(String[] args) {

        //九九乘法表  1*1
        /*
        * 1*1
        * 2*1 2*2
        * 3*1 3*2 3*3
        *
        *
        * */

        for (int i = 1;i<=9;i++){
            for (int j = 1;j<=i;j++){
                int mu = i*j;
                System.out.print(i+" * "+ j + " = " +mu+ "   ");
            }
            System.out.println();

        }




    }
}
