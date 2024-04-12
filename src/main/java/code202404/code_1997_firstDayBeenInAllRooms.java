package code202404;

import static utils.utils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*
给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。

返回这三个数的和。

假定每组输入只存在恰好一个解。
*
* */
public class code_1997_firstDayBeenInAllRooms {
  public static void main(String[] args) {
    code_1997_firstDayBeenInAllRooms body = new code_1997_firstDayBeenInAllRooms();
    Scanner sc = new Scanner(System.in);

    // -1 2 1 -4

    // 4 0 5 -5 3 3 0 -4 -5
    int[] nums = getIntArray(sc, " ");

    System.out.println(body.firstDayBeenInAllRooms(nums));
  }

  public int firstDayBeenInAllRooms(int[] nextVisit) {
    int mod = 1000000007;
    int len = nextVisit.length;
    int[] dp = new int[len];

    dp[0] = 2; //初始化原地待一天 + 访问下一个房间一天
    for (int i = 1; i < len; i++) {
      int to = nextVisit[i];
      dp[i] = 2 + dp[i - 1];
      if (to != 0) {
        dp[i] = (dp[i] - dp[to - 1] + mod) % mod; //避免负数
      }

      dp[i] = (dp[i] + dp[i - 1]) % mod;
    }
    return dp[len - 2]; //题目保证n >= 2
  }

}

