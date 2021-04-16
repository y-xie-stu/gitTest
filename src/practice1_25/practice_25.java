package practice1_25;

import java.util.Scanner;

public class practice_25 {
    public static void main(String[] args) {
        // 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。

        System.out.print("请输入一个五位数：");
        Scanner input = new Scanner(System.in); // 定义键盘输入
        int num = input.nextInt(); // 接收输入的数字
        int a[] = new int[5]; // 记录输入数字各个位数的数字

        // 数组a从高位获取数据
        a[0] = num / 10000;  // 记录万位数
        a[1] = (num / 1000) % 10;  // 记录千位数
        a[2] = (num / 100) % 10;  // 记录百位数
        a[3] = (num / 10) % 10;  // 记录十位数
        a[4] = num % 10;  // 记录个位数

        if (a[0] == a[4] && a[1] == a[3])
            System.out.println("这是一个回文数。");
    }
}
