package com.cunliang.day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {


        boolean flag = true;
        List<Integer> list = new ArrayList();
        int negtive = 0;
        int postive = 0;
        while (flag){

            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            if (x==0){
                flag = false;
            }
            else {
                list.add(x);
            }

        }

        for (int i=0;i<list.size();i++){
             if (list.get(i)>0){
                 postive++;
             }
             else negtive++;
        }
        System.out.println("大于0有"+postive);
        System.out.println("小于0有"+negtive);
    }
}
