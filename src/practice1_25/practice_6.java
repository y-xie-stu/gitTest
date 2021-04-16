package practice1_25;

import java.util.Scanner;

public class practice_6 {
    public static void main(String args[]){
        //输入两个数，输出其最大公因数与最小公倍数

        System.out.print("请输入两个正整数：");

        Scanner in = new Scanner(System.in); //定义键盘输入
        int n = in.nextInt(); //接收输入的第一个数
        int m = in.nextInt(); //接收输入的第二个数

        int maxCommonDirisor;  //记录最大公因数
        int minCommonMultiple;  //记录最大公倍数

        //调用类CommonData的函数
        maxCommonDirisor = new CommonData().CommonDirisor(n, m);
        minCommonMultiple = new CommonData().CommonMultiple(n, m);

        System.out.println("最大公因数为：" + maxCommonDirisor);
        System.out.println("最小公倍数为：" + minCommonMultiple);
    }
}

class CommonData {
    public int CommonDirisor(int n, int m){
        // 使用辗转相除法求这两个数的最大公因数
        while (n != 0){
            if (n < m){
                // 交换两个数的值，确保n大于m
                int temp = n;
                n = m;
                m = temp;
            }
            n = n % m;
        }
        return m;
    }

    public int CommonMultiple(int n, int m){
        // 求这两个数的最大公倍数
        int k = 1;
        if (n < m){
            // 交换两个数的值，确保n大于m
            int temp = n;
            n = m;
            m = temp;
        }
        while (k<=m){
            if ((n*k) % m == 0)
                // 此时n*k即为最小公倍数
                break;
            else
                k++;
        }
        return n*k;
    }
}
