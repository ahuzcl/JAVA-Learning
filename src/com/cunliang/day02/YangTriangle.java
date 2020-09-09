package com.cunliang.day02;

public class YangTriangle {
    public static void main(String[] args) {
        //打印十行杨辉三角
        int [][] angel = new int[10][];

        for (int i =0;i<angel.length;i++){

            angel[i] = new int[i+1];

            angel[i][0] = 1;
            angel[i][i] = 1;
            if (i>1){
                for (int j=1;j<angel[i].length-1;j++){
                    angel[i][j] = angel[i-1][j-1] + angel[i-1][j];
                }
            }

        }



        for (int k = 0;k<10;k++){
            for (int w = 0;w<=k;w++){
                System.out.print(angel[k][w]+" ");
            }
            System.out.println();
        }

    }
}
