package practice1_25;

public class practice_20 {
    public static void main(String[] args) {
        // 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
        double[] num = new double[21];  // 计算这20项的分子与分母共21个数
        num[0] = 1;
        num[1] = 2;
        for (int i=2; i<21; i++){
            // 按规律后面每个数均为前两个数之和
            num[i] = num[i-1] + num[i-2];
        }

        double sum = 0; // 记录这20项之和
        for (int i = 1; i<21; i++){
            sum += num[i]/num[i-1];
        }

        System.out.print("前20项之和为：" + sum);
    }
}

