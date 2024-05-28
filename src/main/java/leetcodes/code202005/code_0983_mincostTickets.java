package leetcodes.code202005;

import java.util.*;

/*
*
*
* 在一个火车旅行很受欢迎的国度，你提前一年计划了一些火车旅行。在接下来的一年里，你要旅行的日子将以一个名为 days 的数组给出。每一项是一个从 1 到 365 的整数。

火车票有三种不同的销售方式：

    一张为期一天的通行证售价为 costs[0] 美元；
    一张为期七天的通行证售价为 costs[1] 美元；
    一张为期三十天的通行证售价为 costs[2] 美元。

通行证允许数天无限制的旅行。 例如，如果我们在第 2 天获得一张为期 7 天的通行证，那么我们可以连着旅行 7 天：第 2 天、第 3 天、第 4 天、第 5 天、第 6 天、第 7 天和第 8 天。

返回你想要完成在给定的列表 days 中列出的每一天的旅行所需要的最低消费。

输入：days = [1,4,6,7,8,20], costs = [2,7,15]
输出：11

6
1 4 6 7 8 20
2 7 15


12
1 2 3 4 5 6 7 8 9 10 30 31
2 7 15



* */
public class code_0983_mincostTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] days = new int[num];
        int[] costs = new int[3];
        for(int i = 0;i< num ; i++){
            days[i] = sc.nextInt();
        }
        for(int i = 0;i< 3 ; i++){
            costs[i] = sc.nextInt();
        }

        long startTime = new Date().getTime();

        int ret = mincostTickets(days,costs);
        System.out.println(ret);
        long endTime = new Date().getTime();
        System.out.println("本程序运行 " + (endTime - startTime) + " 毫秒完成。" );

    }



    private static  int mincostTickets(int[] days, int[] costs) {
        int ret = 0;
        int [] all = new int[366];

        int daysid = 0;
        int costofday = costs[0];
        int costofweek = costs[1];
        int costofmonth = costs[2];
        all[0]=0;

        for(int today = 1 ; today <=365 ; today ++){
            if(daysid>=days.length){break;}
            if (days[daysid] != today) {
                all[today] = all[today - 1];
                continue;
            }
            daysid++;

            all[today] = mymin(
                    all[Math.max(0, today - 1)] + costofday,
                    all[Math.max(0, today - 7)] + costofweek  ,
                    all[Math.max(0, today - 30)] + costofmonth);
        }
        return all[days[days.length - 1]];
    }
    private static int mymin(int a , int b ,int c){
        return Math.min(   Math.min(a,b)    ,  c   );
    }


}





/*


51
1 2 4 7 12 13 15 16 26 28 30 32 34 36 38 40 41 43 44 46 48 49 50 51 55 57 58 59 60 61 65 70 72 73 74 76 78 79 81 82 84 85 86 88 89 92 93 94 95 96 99
6 24 87

*/
