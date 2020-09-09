package com.cunliang.day02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FamilyAccount {
    public static void menu(){
        System.out.println("-------------------家庭收支记账软件-------------------");
        System.out.println("\t\t\t\t\t1.收支明细");
        System.out.println("\t\t\t\t\t2.登记收入");
        System.out.println("\t\t\t\t\t3.登记支出");
        System.out.println("\t\t\t\t\t4.退出");

        System.out.println();


    }







    public static void main(String[] args) {

        boolean flag = true;
        String details = " \t收入 \t账户金额 \t收支金额 \t说明\n ";
        int money = 10000;

        while (flag){
            menu();

            System.out.println("请输入你需要执行的操作：");
            int operator = new Scanner(System.in).nextInt();
            switch (operator){

                case 1:
                    System.out.println("----------------------收支明细----------------------");
                    System.out.println(details);
                    break;

                case 2:
                    System.out.println("登记收入");
                    System.out.println("本次收入金额");
                    int saveMoney = new Scanner(System.in).nextInt();
                    System.out.println("说明");
                    String explains = new Scanner(System.in).next();
                    money += saveMoney;
                    details += ("\t收入\t" + money + "\t\t" + saveMoney + "\t\t\t" +explains +'\n');

                    break;


                case 3:
                    System.out.println("登记支出");
                    System.out.println("本次支出金额");
                    int reduceMoney = new Scanner(System.in).nextInt();
                    System.out.println("说明");
                    String explain = new Scanner(System.in).next();
                    money -= reduceMoney;
                    details += ("\t收入\t" + money + "\t\t" + reduceMoney + "\t\t\t" +explain+"\n");
                    break;


                case 4:
                    System.out.println("退出");
                    System.out.println("是否退出？Y、N");
                    char x =   new Scanner(System.in).next().charAt(0);
                    if (x=='y'||x=='Y') flag=false;
                    else break;


            }


        }





    }
}
