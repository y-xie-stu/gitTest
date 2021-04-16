package practice1_25;

public class practice_9 {
    public static void main(String[] args){
        //找出1000以内的所有完数
        //一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.

        System.out.println("1000以内所有的完数为：");

        int sum; //记录因子之和

        //循环找出完数 1不是完数，为方便从2开始循环
        for (int i = 2; i<=1000; i++){
            sum = 0; //每次循环开始令因子之和重置为0
            for(int j = 1; j<=(i/2)+1; j++){
                if (i % j == 0)
                    sum += j;
            }
            if (sum == i)
                //该数为完数, 进行输出
                System.out.print(i + " ");

        }
    }
}
