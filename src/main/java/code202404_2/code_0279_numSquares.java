package code202404_2;

import java.util.Scanner;

/*
*
给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。*
*
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
