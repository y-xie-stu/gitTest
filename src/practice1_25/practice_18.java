package practice1_25;

public class practice_18 {
    public static void main(String[] args) {
        // 两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。
        // 已抽签决定比赛名单。有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比
        // 找出三队赛手的名单。


        // 方法一
        char[] team1 = new char[]{'a', 'b','c',}; // 记录甲队队员
        char[] team2 = new char[]{'x', 'y', 'z'}; // 记录乙队队员
        char[][] all_team2 = new char[][]{{'x', 'y', 'z'}, {'x', 'z', 'y'},{'y', 'x', 'z'}
                                    ,{'y', 'z', 'x'},{'z', 'x', 'y'},{'z', 'y', 'x'}}; // 记录乙队队员所有的排列可能

        for (int i = 0; i<all_team2.length; i++){
            // team1与team2对应位置的队员为对手
            if (all_team2[i][0] != 'x' && (all_team2[i][2] != 'x' && all_team2[i][2] != 'z')){
                team2[0] = all_team2[i][0];
                team2[1] = all_team2[i][1];
                team2[2] = all_team2[i][2];
                break;
            }
        }

        for (int i = 0; i<3; i++)
            System.out.println(team1[i] + "的对手为：" + team2[i]);


        // 方法二
        for (char a='x'; a<='z'; a++){
            for (char b='x'; b<='z'; b++){
                if (a != b){
                    for (char c='x'; c<='z'; c++){
                        if (a != c && b != c){
                            if (a != 'x' && c != 'x' && c != 'z') {
                                System.out.println("a的对手为：" + a);
                                System.out.println("b的对手为：" + b);
                                System.out.println("c的对手为：" + c);
                            }
                        }
                    }
                }
            }
        }


    }
}
