package practice26_50;

public class practice_31 {
    public static void main(String[] args) {
        // 将一个数组逆序输出
        int[] array = new int[]{56, 53, 34, 26, 9, 6, 4};

        System.out.println("数组逆序输出为：");
        for (int i = array.length-1; i>=0; i--){
            System.out.print(array[i] + " ");
        }


    }
}
