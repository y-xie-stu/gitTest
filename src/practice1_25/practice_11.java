package practice1_25;

public class practice_11 {
    public static void main(String[] args){
        //有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？


        int[] a = new int[4];   //存放这四个数
        for (int i = 0; i<4; i++){
            //这里设置四个数为1、2、3、4，也可改为键盘输入
            a[i] = i+1;
        }
        int[] b = new int[24]; //存放三位数
        int count = 0; //三位数个数

        for (int i = 0; i<4; i++){
            //选取a[i]作为百位数
            for (int j = 0; j<4; j++){
                //选取a[j]作为十位数
                if (j != i){
                    for (int k = 0; k<4; k++){
                        //选取a[k]作为个位数
                        if(k != i && k != j){
                            b[count] = a[i]*100 + a[j]*10 +a[k];
                            count++;
                        }
                    }
                }
            }
        }

        //输出结果
        System.out.println("组成的三位数个数为：" + count);
        System.out.print("三位数为：");
        for (int i = 0; i<count; i++){
            System.out.print(b[i] + " ");
        }
    }
}
