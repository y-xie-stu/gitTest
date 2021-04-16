import java.util.Arrays;
import java.util.Scanner;

public class practice_30 {
    public static void main(String[] args) {
        //有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。

        System.out.print("请输入一个数：");
        Scanner input = new Scanner(System.in); // 定义键盘输入
        int num = input.nextInt(); // 接收输入得数字

//        int[] array = new int[]{4,4,5,5,5,7,7,9,12,56,56}; //已经排好为升序的数组
        int[] array = new int[]{56, 53, 34, 26, 9, 6, 4}; //已经排好为降序的数组


        // 方法一：新建一个数组存储插入后的数组数据
        int[] newArray = new int[array.length+1]; // 插入数据后新的数组

        if (array[0] < array[array.length-1]){
            // 判断原数组为升序
            if (array[array.length-1] < num){
                for (int i = 0; i<newArray.length; i++){
                    if (i == newArray.length-1)
                        newArray[i] = num;
                    else
                        newArray[i] = array[i];
                }
            }else if (array[0] > num){
                for (int i = 1; i<newArray.length; i++) {
                    newArray[0] = num;
                    newArray[i] = array[i - 1];
                }
            }
            else {
                for (int i = 0; i<array.length-1; i++){
                    if ((array[i] < num && array[i+1] > num) || (array[i] == num) || (array[i+1] == num)){
                        // 这个判断条件的设置：考虑到数组第一个数与最后一个数可能会与输入的数相等的情况
                        for (int j = 0, k = 0; j<newArray.length; j++, k++){
                            if (j == i+1){
                                newArray[j] = num;
                                k--;
                            }
                            else
                                newArray[j] = array[k];
                        }
                    }

                }
            }

        }
        else {
            if (array[array.length-1] > num){
                for (int i = 0; i<newArray.length; i++){
                    if (i == newArray.length-1)
                        newArray[i] = num;
                    else
                        newArray[i] = array[i];
                }
            }else if (array[0] < num) {
                for (int i = 1; i < newArray.length; i++) {
                    newArray[0] = num;
                    newArray[i] = array[i - 1];
                }
            }
            else {
                for (int i = 0; i<array.length-1; i++){
                    if ((array[i] > num && array[i+1] < num) || (array[i] == num) || (array[i+1] == num)){
                        // 这个判断条件的设置：考虑到数组第一个数与最后一个数可能会与输入的数相等的情况
                        for (int j = 0, k = 0; j<newArray.length; j++, k++){
                            if (j == i+1){
                                newArray[j] = num;
                                k--;
                            }
                            else
                                newArray[j] = array[k];
                        }
                    }

                }
            }
        }

        System.out.println("排序后的数组为：" + Arrays.toString(newArray));

        // 方法二：使用Arrays.copyof()方法重定义数组的长度(具体功能略)
        int[] NewArray = Arrays.copyOf(array, array.length+1);
        // 此时NewArray获取了原有array的数据且长度+1,输出如下
        System.out.println("方法二的数组为：" + Arrays.toString(NewArray));

    }
}
