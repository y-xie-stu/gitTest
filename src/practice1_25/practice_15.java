package practice1_25;

import java.util.Scanner;

public class practice_15 {
    public static void main(String[] args){
        //输入三个整数x,y,z，请把这三个数由小到大输出。

        System.out.print("请输入三个整数：");
        Scanner input = new Scanner(System.in); //定义键盘输入

        //接收三个整数
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        for (int i = 1; i<=3; i++){
            if (x > y){
                int temp = x;
                x =y;
                y =temp;
            }
            else if (y > z){
                int temp = y;
                y =z;
                z =temp;
            }
        }

        System.out.print("这三个数由小到大输出为：" + x + " " + y + " " + z);
    }
}
