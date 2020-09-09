package com.cunliang.day02;

public class Demo5 {
    public static void main(String[] args) {

        //100以内的所有质数

        int i = 1;
        while (i<=100){
            int flag=0;

            for (int j=1;j<=i;j++){
                if (i%j==0){
                    flag++;
                }
            }
            if (flag==2) System.out.print(i+" ");


            i++;
        }

    }
}
