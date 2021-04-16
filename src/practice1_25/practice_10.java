package practice1_25;

public class practice_10 {
    public static void main(String[] args){
        //一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，
        // 求它在 第10次落地时，共经过多少米？第10次反弹多高？

        double journey; //第10次落地时总共经过的路程


        // 第二次落地的高度为第一次落地反弹高度的两倍，以此类推
        journey = 100;
        double height = 100; //每次落地反弹的高度
        for (int i = 2; i<=10; i++){
            height /= 2;
            journey += height*2;
        }

        System.out.println("第10次落地时，共经过" + journey + "米，第10次反弹" + height + "米。");
    }
}
