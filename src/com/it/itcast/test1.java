package com.it.itcast;
//算法流程,先确定每一行中数组元素存在的规则,再确定临近的上下列数组元素存在的关系
public class test1 {
    public static void main(String[] args) {
        //1.创建存储上一行数据的数组temp
        int k = 2;
        int[] temp = new int[k];
        //1.1 因为两端数均为1，所以给第一个数temp[0]和最后一个数temp[k-1]赋值为1
        temp[0] = temp[k - 1] = 1;

        //2.打印杨辉三角
        //打印的行数--即杨辉三角行数rowCount
        int rowCount = 8;
        for (int i = 1; i <= rowCount; i++) {
            // 建立数组，存取当前行数据
            int[] arr = new int[i];
            // 给当前行数组赋值
            for (int j = 0; j < i; j++) {
                // 先给第一个和最后一个数赋值
                if (j == 0 || j == i - 1) {
                    arr[j] = 1;
                } else {
                    // 中间数为上一行斜对角的两数之和
                    arr[j] = temp[j - 1] + temp[j];
                }
            }
            // 给当前行赋值完毕后让k+1，增加数组长度，用于存取当前行的数据
            k++;
            temp = new int[k];

            //打印空格来实现等腰三角形
            for(int z=0;z<rowCount-i;z++){
                System.out.print(" ");
            }

            // 打印当前行数组，并给新temp赋值，便于下一行使用当前行数据
            for (int y = 0; y < arr.length; y++) {
                temp[y] = arr[y];
                System.out.print(arr[y] + " ");
            }
            System.out.println();
        }

    }

}
