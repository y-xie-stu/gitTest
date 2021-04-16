package practice26_50;

import java.util.Scanner;

public class practice_29 {
    public static void main(String[] args) {
        // 求一个3*3矩阵对角线元素之和

        System.out.println("请输入一个3*3的矩阵：");
        Scanner input = new Scanner(System.in); // 定义键盘输入
        double[][] matrix = new double[3][3];

        double sum = 0; // 记录对角线元素之和


        for (int i=0; i<3; i++){
            for (int j = 0; j<3; j++){
                matrix[i][j] = input.nextDouble(); // 接收输入的矩阵
                if (j == i)
                    sum += matrix[i][j]; // 计算对角线元素
            }
        }

        System.out.println("对角线元素之和为:" + sum);

    }
}
