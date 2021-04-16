package practice1_25;

public class practice_21 {
    public static void main(String[] args) {
        // 求1+2!+3!+...+20!的和

        int sum = 0; // 记录和
        int temp; // 记录每一项的值
        for (int i=1; i<=20; i++){
            temp = 1;
            for (int j=1; j<=i; j++){
                temp *= j;
            }
            sum += temp;
        }

        System.out.print("和为：" + sum);
    }
}
