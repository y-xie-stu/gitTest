package practice1_25;

import java.util.Scanner;

public class practice_7 {
    public static void main(String[] args){
        //输入一行字符串，统计其英文字母、数字、空格和其他字符串的数量

        System.out.println("请输入一行字符串：");
        Scanner input = new Scanner(System.in);  //定义键盘输入
        String str = input.nextLine();           //接收输入的字符串
        char[] ch = str.toCharArray();           //将字符串转换为字符数组

        int abccount = 0;       //记录英文字母的个数
        int spacecount = 0;     //记录空格的个数
        int numbercount = 0;    //记录数字的个数
        int othercount = 0;     //记录其他字符的个数

        for (int i = 0; i<ch.length; i++){
            //循环判断字符数组每个位置的字符类型
            if (Character.isLetter(ch[i]))
                //判断是否为英文字符
                abccount++;
            else if (Character.isSpaceChar(ch[i]))
                //判断是否为空格
                spacecount++;
            else if (Character.isDigit(ch[i]))
                //判断是否为数字
                numbercount++;
            else
                othercount++;
        }

        System.out.println("英文字符的个数为：" + abccount);
        System.out.println("数字的个数为：" + numbercount);
        System.out.println("空格的个数为：" + spacecount);
        System.out.println("其他字符的个数为：" + othercount);

    }
}
