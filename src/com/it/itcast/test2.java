package com.it.itcast;

public class test2 {
    public static void main(String[] args) {
        //创建存储上一行的数组
        //起始行的长度
        int n = 2;
        //定于数组arr,规定数组的长度
        int[] arr = new int[n];
        //确认数组中的简易规则,两端的数组元素相同,数组元素从0到 n-1
        arr[0] = arr[n - 1] = 1;
        //定义杨辉三角的行数
        int RowCount = 9;
        //先遍历行数
        for (int i = 1; i <= RowCount; i++) {
            //定义数组,准备存储数组元素
            int[] arr1 = new int[i];
            //遍历给每一行的数组赋值
            for (int j = 0; j < i; j++) {
                //先确定每一行数组的首,尾元素
                if (j == 0 || j == i - 1) {
                    arr1[j] = 1;
                } else {
                    //上一行数组小一位的元素与同位的元素的和
                    arr1[j] = arr[j - 1] + arr[j];
                }
            }
            //当前行赋值以后给每行数组增加长度,存取当前行的数据
            n++;
            arr = new int[n];
            //打印空格实现等腰三角形--------注意:""不表空格,还需要再""中点一下空格键
            for (int m = 0; m < RowCount - i; m++) {
                System.out.print(" ");
            }
            for (int k = 0; k < arr1.length; k++) {
                //打印当前行的数组,下一行就可以使用当前行数组
                arr[k] = arr1[k];
                System.out.print(arr[k] + " ");
            }
            System.out.println();
        }
    }
}
