package practice26_50;

import java.util.Scanner;

public class practice_26 {
    public static void main(String[] args) {
        // 请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续 判断第二个字母。

        System.out.print("请输入星期几的英文（最少输入两个字母）：");
        Scanner input = new Scanner(System.in); // 定义键盘输入
        String str = input.nextLine(); // 接收输入的英文字母
        char[] letter = str.toCharArray(); // 将其转换为字符数组

        if (letter[0] == 'm' || letter[0] == 'M')
            System.out.print("这是星期一");
        else if ((letter[0] == 't' || letter[0] == 'T') && (letter[1] == 'u' || letter[1] == 'U'))
            System.out.print("这是星期二");
        else if (letter[0] == 'w' || letter[0] == 'W')
            System.out.print("这是星期三");
        else if ((letter[0] == 't' || letter[0] == 'T') && (letter[1] == 'h' || letter[1] == 'H'))
            System.out.print("这是星期四");
        else if (letter[0] == 'f' || letter[0] == 'F')
            System.out.print("这是星期五");
        else if ((letter[0] == 's' || letter[0] == 'S') && (letter[1] == 'a' || letter[1] == 'A'))
            System.out.print("这是星期六");
        else if ((letter[0] == 's' || letter[0] == 'S') && (letter[1] == 'u' || letter[1] == 'U'))
            System.out.print("这是星期天");
    }
}
