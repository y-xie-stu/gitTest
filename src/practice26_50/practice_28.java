package practice26_50;

import java.util.Arrays;

public class practice_28 {
    public static void main(String[] args) {
        // 对10个数进行排序(为便捷不使用键盘输入)

        int[] arr = new int[]{10,23,45,24,46,23,12,5656,78,56};

        // 使用插入排序法（升序）
        // 即将第j+1个数插入前j个数中
        int j;
        int key; // 为方便连接设置 要插入的数
        for (int i = 1; i<10; i++){
            key = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j]>key){
                arr[j+1] = arr[j];
                arr[j] = key;
                j--;
            }
//            // 上面循环可改为以下循环，更为高效
//            while (j >= 0 && arr[j]>key){
//                arr[j+1] = arr[j];
//                j--;
//            }
//            arr[j+1] = key;
        }

        // 冒泡排序
        // 快速排序
        // 堆排序
        // 归并排序
        // 简单选择排序

        System.out.print("排序后的数组为：" + Arrays.toString(arr));
    }
}
