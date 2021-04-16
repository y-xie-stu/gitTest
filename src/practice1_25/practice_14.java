package practice1_25;

import java.util.Scanner;

public class practice_14 {
    public static void main(String[] args){
        //输入某年某月某日，判断这一天是这一年的第几天？
        System.out.print("请输入年月日（用空格隔开）：");

        Scanner input = new Scanner(System.in); //定义键盘输入
        int year = input.nextInt(); //接收年份
        int month = input.nextInt(); //接收月份
        int day = input.nextInt(); //接收日期
        int count = 0; //判断平、闰年，闰年则+1
        int number = 0;  //记录日期为一年的第几天

        if ((year%4 == 0 && year%100 != 0) || year%400 == 0)
            //判断是否为闰年
            count++;
        if (month == 1)
            number = day;
        else if (month == 2)
            number = day + 31;
        else if (month == 3)
            number = day + 31 + 28 +count;
        else if (month == 4)
            number = day + 31 + 28 + count + 31;
        else if (month == 5)
            number = day + 31 + 28 + count + 31 + 30;
        else if (month == 6)
            number = day + 120+ count + 31;
        else if (month == 7)
            number = day + 120+ count + 31 + 30;
        else if (month == 8)
            number = day + 120+ count + 31 + 30 + 31;
        else if (month == 9)
            number = day + 212+ count + 31;
        else if (month == 10)
            number = day + 212+ count + 31 + 30;
        else if (month == 11)
            number = day + 212+ count + 31 + 30 + 31;
        else if (month == 12)
            number = day + 304+ count + 31;

        System.out.print("这一天为一年的第" + number + "天。");




    }
}
