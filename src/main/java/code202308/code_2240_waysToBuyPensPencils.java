package code202308;

import java.util.Arrays;
import java.util.Scanner;

/*
*

给你一个整数 total ，表示你拥有的总钱数。同时给你两个整数 cost1 和 cost2 ，分别表示一支钢笔和一支铅笔的价格。你可以花费你部分或者全部的钱，去买任意数目的两种笔。

请你返回购买钢笔和铅笔的 不同方案数目 。
*
* */
public class code_2240_waysToBuyPensPencils {
  public static void main(String[] args) {
    code_2240_waysToBuyPensPencils body = new code_2240_waysToBuyPensPencils();

    Scanner sc = new Scanner(System.in);
    int total = sc.nextInt();
    int cost1 = sc.nextInt();
    int cost2 = sc.nextInt();

    System.out.println(body.waysToBuyPensPencils(total, cost1, cost2));
  }

  public long waysToBuyPensPencils(int total, int cost1, int cost2) {
    long[] dp = new long[total + 1];

    int[] costs = new int[] {cost1, cost2};
    Arrays.sort(costs);

    for (int cost : costs) {
      for (int i = cost; i <= total; i++) {
        if (i >= cost) {
          dp[i] += dp[i - cost] + 1;
        }
      }
    }
    return dp[total] + 1;
  }

}

