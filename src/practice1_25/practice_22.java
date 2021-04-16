package practice1_25;

public class practice_22 {
    public static void main(String[] args) {
        // 利用递归方法求5!。
        int num = factorial(5);

        System.out.print("5!为：" + num);
    }

    public static int factorial(int n){
        if (n != 1)
            return n * factorial(n-1);
        else
            return n;
    }
}
