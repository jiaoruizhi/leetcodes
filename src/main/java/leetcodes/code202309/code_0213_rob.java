package leetcodes.code202309;


import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*
打家劫舍 II


你是一个专业的小偷，计划偷窃沿街的房屋，每间房内都藏有一定的现金。这个地方所有的房屋都 围成一圈 ，
*
* 这意味着第一个房屋和最后一个房屋是紧挨着的。同时，相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警 。

给定一个代表每个房屋存放金额的非负整数数组，计算你 在不触动警报装置的情况下 ，今晚能够偷窃到的最高金额。
*

* */
public class code_0213_rob {
  public static void main(String[] args) {
    code_0213_rob body = new code_0213_rob();
    Scanner sc = new Scanner(System.in);

    // 1 2 3 1
    // 99 1 2 3 1 500
    int[] nums = getIntArray(sc, null);

    System.out.println(body.rob(nums));
  }

  public int rob(int[] nums) {
    int length = nums.length;
    if (length == 1) {
      return nums[0];
    }
    if (length == 2) {
      return Math.max(nums[0], nums[1]);
    }

    int a1 = robRange(nums, 0, length - 2);
    int a2 = robRange(nums, 1, length - 1);
    return Math.max(a1, a2);
  }

  public int robRange(int[] nums, int start, int end) {

    int N = end + 1;
    int[] dp = new int[N + 1];
    dp[start] = 0;
    dp[start + 1] = nums[start];
    for (int k = start + 2; k <= N; k++) {
      dp[k] = Math.max(dp[k - 1], nums[k - 1] + dp[k - 2]);
    }
    return dp[N];
  }

}

