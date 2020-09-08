package com.cunliang.day01;

import java.util.Scanner;

public class MaxOfThree {
    public static void main(String[] args) {


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

/*
        int max = a>b?a:b;
        if (max>c)
            System.out.println("max = " + max);
        else
            System.out.println("max = "+ c);


 */


        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println("a = "+ a +" b = " + b +" c= " + c );



        }


    }
}
