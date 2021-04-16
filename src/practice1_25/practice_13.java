package practice1_25;

public class practice_13 {
    public static void main(String[] args){
        //一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？

        for (double i = 0; i<500; i++){
            if (Math.sqrt( i+100)%1 == 0 && Math.sqrt(i + 100 + 168)%1 == 0) {
                System.out.println("这个整数为：" + (long)i);
                break;
            }
        }
//        判断double是否为整数的两种简单方法
//        double d = 3.01;
//        System.out.println(d % 1 == 0);
//        System.out.print(((long) d) + 0.0 ==d);
    }
}
