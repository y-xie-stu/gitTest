package practice1_25;

public class practice_1 {
    public static void main(String args[]){
        // 计算并输出12个月每个月的兔子数量

        int arr[] = new int[12];     // 用以记录每个月的兔子数量
        // 根据规律计算每个月数量 前两个月只有一对兔子  之后每个月兔子数均为前两个月兔子数之和
        arr[0] = 2;
        arr[1] = 2;
        for(int i = 2; i < 12; i++){
            arr[i] = arr[i-1] + arr[i - 2];
        }
        // 输出每个月的兔子数量
        for (int i = 0; i < 12; i++){
            System.out.println("第" + (i+1) +"个月的兔子数量为：" + arr[i]);
        }
    }

}
