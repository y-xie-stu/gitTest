package practice1_25;

public class practice_16 {
    public static void main(String[] args){
        //输出9*9口诀

        for (int i = 1; i<=9; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j + "x" +i + "=" + j*i + " ");
            }
            System.out.println();
        }
    }
}
