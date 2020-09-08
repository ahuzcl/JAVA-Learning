package com.cunliang.day01;

public class MaxOfThree {
    public static void main(String[] args) {


        int a = 3;
        int b = 6;
        int c = 9;
        /*

        if (a>b){
            if (a>c){
                System.out.println("max = " + a);
            }
            else {
                System.out.println("max = "+ c);
            }
        }
        else {
            if (b>c){
                System.out.println("max = "+ b);
            }
            else {
                System.out.println("max = " + c);
            }
        }


         */


        int max = a>b?a:b;
        if (max>c)
            System.out.println("max = " + max);
        else
            System.out.println("max = "+ c);


    }
}
