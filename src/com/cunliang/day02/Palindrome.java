package com.cunliang.day02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("输入：");
        int num = 3;
        int [][] pali = new int[num][num];
        int total = num*num;

        int k=1,i=0,j=0;

        for (int w=1;w<=total;w++){

            if (k==1){
                if (j<num && pali[i][j]== 0){
                    pali[i][j++]= w;
                }
                else {
                    k=2;
                    i++;
                    j--;
                    w--;
                }
            }else if (k==2){
                if (i<num && pali[i][j]==0){
                    pali[i++][j] = w;
                }else {
                    k=3;
                    i--;
                    j--;
                    w--;
                }
            }else if (k==3){
                if (j>=0 &&pali[i][j]==0){
                    pali[i][j--]=w;
                }else {
                    k=4;
                    i--;
                    w--;
                    j++;
                }
            }else if (k==4){
                if (i>=0 &&pali[i][j]==0){
                    pali[i--][j]=w;
                }else {
                    k = 1;
                    i++;
                    j++;
                    w--;
                }
            }


        }


        for (int e =0;e<num;e++){
            for (int y=0;y<num;y++){
                System.out.print(pali[e][y]+" ");
            }
            System.out.println();
        }


    }
}
