package practice1_25;

import java.util.Scanner;

public class practice_4 {
    public static void main(String args[]){
        // 将一个正整数分解质因数

        Scanner in = new Scanner(System.in); // 定义从键盘输入
        System.out.print("请输入一个正整数：");
        int n = in.nextInt();                // 将输入的数赋值给变量n

        //方法一、调用递归函数对n进行质因数分解
        System.out.print(n + "=");
        primeSplit(n);

        // 方法二、不使用递归进行质因数分解
        System.out.println();  //换行
        System.out.print(n + "=");
        int k = 2; // 循环体设置
        while (k<=n) {
            if (n % k == 0 && n != k) {
                System.out.print(k + "*");
                n = n / k;
                k = 1;
            } else if (n == k) {
                System.out.print(k);
                break;
            }
            k++;
        }
    }

    public static void primeSplit(int n){
        // 计算n最小的质因数并打印，递归可达到质因数分解的目的

        for (int k = 2; k<=n; k++){
            int s = n / k;  // 记录n除以k的商
            if (n%k == 0 && n != k){
                // k能整除n，即打印，并将s作为n再递归调用函数，跳出循环
                System.out.print(k + "*");
                primeSplit(s);
                break;
            }
            else if (n == k){
                // n=k即到了质因数分解最后一个，打印，跳出循环即可
                System.out.print(k);
                break;
            }
        }
    }
}
