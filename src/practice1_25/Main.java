package practice1_25;

import java.util.Scanner;

/**
 * @author y_xie
 * @create 2021-04-10 20:18
 */
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = 2;
        int x = 0;
        n = cin.nextInt(); // 获取树的数量
        x = cin.nextInt(); // 等差大小
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){ // 树的高度
            arr[i] = cin.nextInt();
        }
        int i = 0;
        int min = n-1; // 默认最少为n-1次
        int count = 0; // 用于次数计数
        while (i < n) {
            count = 0;
            int j = i - 1;
            int k = i + 1;
            while (j >= 0) {
                if (arr[j] != arr[i] - x) {
                    arr[j] = arr[i] - x;
                    count++;
                }
                j--;
            }
            while (k < n) {
                if (arr[k] != arr[i] + x) {
                    arr[k] = arr[i] + x;
                    count++;
                }
                k++;
            }
            min = count > min ? min : count;
            i++;
        }
        System.out.print(min);

    }
}
