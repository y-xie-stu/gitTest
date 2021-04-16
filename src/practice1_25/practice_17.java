package practice1_25;

import java.util.Arrays;

public class practice_17 {
    public static void main(String[] args){
        // 猴子吃桃问题：
        // 猴子第一天摘下若干个桃子，当即吃了一半，又多吃了一个 第二天早上又将剩下的桃子吃掉一半，又多吃了一个。
        // 以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。
        // 求第一天共摘了多少?

        // 第九天的桃子数量为第十天的两倍加一个，以此类推可计算第一天的采摘数
        int num[] = new int[10]; //记录这10天每天树上的桃子数
        num[9] = 1; //从第10天开始计算
        for (int i = 9; i>0; i--){
            num[i-1] = 2 * num[i] + 1;
        }

        System.out.println("第一天摘的个数为：" + (num[0]/2+1));
//        System.out.println(Arrays.toString(num));

    }
}
