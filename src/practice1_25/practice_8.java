package practice1_25;

import java.util.Scanner;

public class practice_8 {
    public static void main(String[] args){
        //求s=a+aa+aaa+aaaa+aa...a的值
        //其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)
        //几个数相加由键盘控制

        System.out.println("请输入数字a（0-9）与相加的个数：");
        Scanner input = new Scanner(System.in);  //定义键盘输入
        int a = input.nextInt();  //接收数字a
        int num = input.nextInt(); //接收相加的个数
        int sum = 0; //所求的和

        //根据规律循环求和
        int temp = 0; //中间值 随循环的进行temp依次为：a aa aaa aaaa aaaaa……
        for (int i = 1; i<=num; i++){
            temp = temp *10 +a;
            sum += temp;
        }

        System.out.println("所求结果为：" + sum);
    }
}
