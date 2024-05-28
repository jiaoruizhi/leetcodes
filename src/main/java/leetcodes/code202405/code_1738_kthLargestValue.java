package leetcodes.code202405;

import static utils.arrayUtils.getIntDoubleArray;

import java.util.PriorityQueue;
import java.util.Scanner;

/*
*
给你一个二维矩阵 matrix 和一个整数 k ，矩阵大小为 m x n 由非负整数组成。

矩阵中坐标 (a, b) 的 值 可由对所有满足 0 <= i <= a < m 且 0 <= j <= b < n 的元素 matrix[i][j]（下标从 0 开始计数）执行异或运算得到。

请你找出 matrix 的所有坐标中第 k 大的值（k 的值从 1 开始计数）。
* */


public class code_1738_kthLargestValue {
  public static void main(String[] args) {
    code_1738_kthLargestValue body = new code_1738_kthLargestValue();
    Scanner sc = new Scanner(System.in);

    // 2 2 5 2 1 6
    // 2
    int[][] matrix = getIntDoubleArray();
    // 2 4 3 3 5 4 9 6
    // 4
    int k = sc.nextInt();

    System.out.println(body.kthLargestValue(matrix, k));
  }


  PriorityQueue<Integer> q = new PriorityQueue<Integer>((a, b) -> b - a);
  public int kthLargestValue(int[][] matrix, int k) {
    int m = matrix.length, n = matrix[0].length;
    int[][] dp = new int[m][n];

    dp[0][0] = matrix[0][0];
    q.offer(dp[0][0]);

    for (int i = 1; i < n; i++) {
      dp[0][i] = matrix[0][i] ^ dp[0][i - 1];
      q.offer(dp[0][i]);
    }
    for (int i = 1; i < m; i++) {
      dp[i][0] = matrix[i][0] ^ dp[i - 1][0];
      q.offer(dp[i][0]);
    }
    for (int i = 1; i < m; i++) {
      for (int j = 1; j < n; j++) {
        dp[i][j] = dp[i - 1][j - 1] ^ dp[i - 1][j] ^ dp[i][j - 1] ^ matrix[i][j];
        q.offer(dp[i][j]);
      }
    }
    int result = 0;
    for (int i = 0; i < k; i++) {
      result = q.poll();
    }
    return result;
  }
}

