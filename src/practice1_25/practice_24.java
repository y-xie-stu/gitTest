package practice1_25;

import java.util.Scanner;

public class practice_24 {
    public static void main(String[] args) {
        // 给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。

        System.out.print("请输入一个不多于五位的正整数：");
        Scanner in = new Scanner(System.in); // 定义键盘输入
        int num = in.nextInt(); // 接收输入的数字
        int a[] = new int[5]; // 记录输入数字各个位数的数字

        // 数组a从高位获取数据
        a[0] = num / 10000;  // 记录万位数
        a[1] = (num / 1000) % 10;  // 记录千位数
        a[2] = (num / 100) % 10;  // 记录百位数
        a[3] = (num / 10) % 10;  // 记录十位数
        a[4] = num % 10;  // 记录个位数

        int len = 0; //记录数字长度
        for (int i=0; i<5; i++){
            if (a[i] != 0) {
                len = 5-i;
                System.out.println("这是一个" + len + "位数");
                break;
            }
        }

        System.out.print("逆序输出为：");
        for (int i=4; i>=5-len; i--){
            System.out.print(a[i]);
        }

    }
}
