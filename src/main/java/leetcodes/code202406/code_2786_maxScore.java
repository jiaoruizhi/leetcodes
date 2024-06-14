package leetcodes.code202406;

import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*
给你一个下标从 0 开始的整数数组 nums 和一个正整数 x 。

你 一开始 在数组的位置 0 处，你可以按照下述规则访问数组中的其他位置：

    如果你当前在位置 i ，那么你可以移动到满足 i < j 的 任意 位置 j 。
    对于你访问的位置 i ，你可以获得分数 nums[i] 。
    如果你从位置 i 移动到位置 j 且 nums[i] 和 nums[j] 的 奇偶性 不同，那么你将失去分数 x 。

请你返回你能得到的 最大 得分之和。

注意 ，你一开始的分数为 nums[0] 。
*
* */


public class code_2786_maxScore {
  public static void main(String[] args) {
    code_2786_maxScore body = new code_2786_maxScore();
    Scanner sc = new Scanner(System.in);

    // 2 3 6 1 9 2
    // 5
    int[] nums = getIntArray(sc, " ");
    int x = sc.nextInt();

    System.out.println(body.maxScore(nums, x));
  }


  public long maxScore(int[] nums, int x) {
    int n = nums.length;
    int[] jo = new int[n];
    for (int i = 0; i < n; i++) {
      jo[i] = nums[i] & 1;
    }
    long[][] last = new long[n + 1][2];
    last[n][0] = 0;
    last[n][1] = 0;

    for (int i = n - 1; i >= 0; i--) {
      int now = jo[i];
      int other = now == 0 ? 1 : 0;

      long a1 = nums[i] + last[i + 1][now];
      long b1 = nums[i] - x + last[i + 1][other];
      last[i][now] = Math.max(a1, b1);

      long a2 = last[i + 1][other];
      long b2 = nums[i] - x + last[i + 1][now];
      last[i][other] = Math.max(a2, b2);
    }
    return last[0][jo[0]];
  }
}

