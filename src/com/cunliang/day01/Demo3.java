package com.cunliang.day01;

public class Demo3 {
    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;
        short z = 40;
        if ((z++==40) && (y=true)){
            z++;
        }
        if ((x=false) || (++z==43)){
            z++;
        }

        System.out.println("z = " + z);



    }
}
