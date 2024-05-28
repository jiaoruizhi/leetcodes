package leetcodes.code202404_2;

import java.util.Scanner;

/*
*
给你一个整数 n ，返回 和为 n 的完全平方数的最少数量 。

完全平方数 是一个整数，其值等于另一个整数的平方；
* 换句话说，其值等于一个整数自乘的积。例如，1、4、9 和 16 都是完全平方数，而 3 和 11 不是。
*
* */
public class code_0279_numSquares {
  public static void main(String[] args) {
    code_0279_numSquares body = new code_0279_numSquares();
    Scanner sc = new Scanner(System.in);

    // 12
    // 13
    int n = sc.nextInt();

    System.out.println(body.numSquares(n));
  }

  public int numSquares(int n) {
    int[] dp = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      dp[i] = i;
      for (int j = 1; j * j <= i; j++) {
        dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
      }
    }
    return dp[n];
  }

}
