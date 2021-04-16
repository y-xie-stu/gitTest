package practice1_25;

public class practice_23 {
    public static void main(String[] args) {
        // 有5个人坐在一起，
        // 问第五个人多少岁？他说比第4个人大2岁。
        // 问第4个人岁数，他说比第3个人大2岁。
        // 问第3个人，又说比第2人大两岁。
        // 问第2个人，说比第一个人大两岁。
        // 最后问第一个人，他说是10岁。
        // 请问第五个人多大？

        int age[] = new int[5]; // 记录这五个人的年龄
        age[0] = 10; // 已知第一个人的年龄为10
        for (int i=1; i<5; i++){
            // 后面每个人均比前一个人大2岁
            age[i] = age[i-1] + 2;
        }

        System.out.print("第五个人的年龄为：" + age[4]);
    }
}
