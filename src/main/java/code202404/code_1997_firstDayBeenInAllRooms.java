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
    int n = nextVisit.length;
    long MOD = 1000000007;
    long[] dp = new long[n];
    for (int i = 1; i < n; i++) {
      dp[i] = (2 * dp[i - 1] - dp[nextVisit[i - 1]] + 2 + MOD) % MOD;
    }
    return (int) dp[n - 1];
  }

}

