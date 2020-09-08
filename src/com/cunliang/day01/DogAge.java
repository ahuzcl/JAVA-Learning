package com.cunliang.day01;


import java.util.Scanner;

public class DogAge {
    public static void main(String[] args) {

        System.out.println("请输入狗狗的年龄: ");

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        int humanAge = 0;

        if (age < 0) System.out.println("输入有误！");
        else {

            if (age >2){
                humanAge = (int) (10.5+10.5+(age-2)*4);
                System.out.println("狗狗的年龄相当于人类" + humanAge+"岁");
            }


            else if (age==2){
                System.out.println("狗狗的年龄相当于人类21岁");
            }
            else {
                System.out.println("狗狗的年龄相当于人类10.5岁");
            }
        }

    }
}
