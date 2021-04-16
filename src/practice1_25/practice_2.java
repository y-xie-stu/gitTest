package practice1_25;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class practice_2 {
    public static void main(String args[]){
        // 判断101-200之间有多少个素数

        int count = 0;         // 统计素数个数
        int arr[] = new int[100]; // 记录素数
        // 根据素数性质进行计算
        for (int i = 101; i <= 200; i++){
            boolean bool = true;   // 默认数为素数
            for (int j = 2; j <= 100; j++){
                // 如果i存在因数，即不为素数，跳出进行下一个数的判断
                if (i % j ==0){
                    bool = false;
                    break;
                }
            }
            // 如果bool=true,即为素数
            if(bool) {
                arr[count] = i;
                count += 1;
            }
        }
        // 输出素数个数与素数
        System.out.println("素数个数为：" + count);
        for (int i = 0; i<count; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
