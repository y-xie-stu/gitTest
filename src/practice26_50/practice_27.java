package practice26_50;

public class practice_27 {
    public static void main(String[] args) {
        // 求100之内的素数

        boolean b; // 判断是否为素数，默认为素数

        System.out.println("100以内的素数有：");
        for (int i=2; i<=100; i++){
            b = true;
            for (int j=2; j<=i; j++){
                if (j != i && i % j ==0) {
                    b = false;
                    break;
                }
            }
            if (b)
                System.out.print(i + " ");

        }
    }
}
