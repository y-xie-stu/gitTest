package practice1_25;

import java.util.Scanner;

public class practice_12 {
    public static void main(String[] args){
        //利润(I)低于或等于10万元时，奖金可提10%；
        //利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
        //20万到40万之间时，高于20万元的部分，可提成5%；
        //40万到60万之间时，高于40万元的部分，可提成3%；
        //60万到100万之间时，高于60万元的部分，可提成1.5%，
        //高于100万元时，超过100万元的部分按1%提成，
        //从键盘输入当月利润I，求应发放奖金总数？

        System.out.print("请输入当月利润（万元）：");
        Scanner input = new Scanner(System.in); //定义键盘输入
        double profit = input.nextDouble(); //接收输入的利润
        double bonus = 0; //奖金

        if (profit <= 10)
            bonus = profit * 0.1;
        else if (profit <= 20)
            bonus = 1 + (profit-10) * 0.075;
        else if (profit < 40)
            bonus = 1 + 0.75 + (profit-20) * 0.05;
        else if (profit < 60)
            bonus = 1 + 0.75 + 1 + (profit-40) * 0.03;
        else if (profit < 100)
            bonus = 1 + 0.75 + 1 + 0.6 + (profit-60) * 0.015;
        else if (profit >= 100)
            bonus = 1 + 0.75 + 1 + 0.6 + 0.6 + (profit-100) * 0.01;

        System.out.println("应发放奖金总数为：" + bonus + "万元");


    }
}
