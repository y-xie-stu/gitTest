package practice1_25;

public class practice_19 {
    public static void main(String[] args) {
        // 打印出如下图案（菱形）
        //    *
        //   ***
        // ******
        //********
        // ******
        //  ***
        //   *

        for (int i = 0; i<7; i++){
            if (i<4) {
                for (int j = i; j < 3; j++)
                    System.out.print(" ");
                for (int k = 0; k <= i * 2; k++)
                    System.out.print("*");
            }
            else{
                for (int j = 0; j < i-3; j++)
                    System.out.print(" ");
                for (int k = 0; k <= (6-i) * 2; k++)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
