package com.cunliang.day02;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {

        //水仙花数 3位数，各个位的数字的立方和。

        for (int i=100;i<=999;i++){

            int g = 0;
            int s = 0;
            int b = 0;
            List<Integer> list = list(i);
            g = list.get(0);
            s = list.get(1);
            b = list.get(2);

            if (g*g*g+s*s*s+b*b*b==i){
                System.out.println("水仙花数：" + i);
            }


        }

    }

    public static List<Integer> list(int x){
        List arrlist = new ArrayList();

        while (x>=1){
            int j = x%10;
            arrlist.add(j);
            x= x/10;
        }


        return arrlist;
    }
}
