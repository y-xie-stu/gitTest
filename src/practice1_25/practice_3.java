package practice1_25;

public class practice_3 {
    public static void main(String args[]){
        // 打印出所有的水仙花数(三位数 满足每个位数数的立方之和等于这个数 153 = 1^3 + 5^3 +3^3)

        System.out.println("所有的水仙花数：");
        for (int i = 100; i<1000; i++){
            int b; // 记录百位数
            int s; // 记录十位数
            int g; // 记录个位数
            b = i / 100;
            s = (i / 10) % 10;
            g = i % 10;
            if ((int)(Math.pow(b,3)+ Math.pow(s,3)+Math.pow(g,3)) ==i){
                System.out.print(i + " ");
            }
        }
    }
    public static String getType(Object i){
        // 返回变量的数据类型（简单数据是无法直接获得数据类型的， 想要获取必须自定义函数进行返回）
        return i.getClass().toString();
    }
}
