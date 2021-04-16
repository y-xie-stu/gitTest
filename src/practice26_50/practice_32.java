package practice26_50;

public class practice_32 {
    public static void main(String[] args) {
        // 取一个整数a从右端开始的4～7位

        long a = 43545462;
        String str = String.valueOf(a); // 转为字符串
        char[] ch = str.toCharArray(); // 转换为字符数组

        for (int k = 4; k<=7; k++){
            System.out.print("从右端开始" + k + "位为：");
            for (int i = ch.length-k; i<ch.length; i++){
                System.out.print(ch[i]);
            }
            System.out.println();
        }
        float b= 3;

    }
}
