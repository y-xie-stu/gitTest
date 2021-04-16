package practice1_25;

public class practice_5 {
    public static void main(String args[]){
        // 学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。

        float score = 78;  // 成绩示例，可改为键盘输入
        if (score >= 90)
            System.out.println('A');
        else if (score >= 60)
            System.out.println('B');
        else
            System.out.println('C');

    }
}
