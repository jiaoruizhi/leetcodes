package code202309;

import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*
你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。



* */
public class code_0198_rob {
  public static void main(String[] args) {
    code_0198_rob body = new code_0198_rob();
    Scanner sc = new Scanner(System.in);

    // 1 2 3 1
    int[] nums = getIntArray(sc, null);

    System.out.println(body.rob(nums));
  }


  public int rob(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }
    // 子问题：
    // f(k) = 偷 [0..k) 房间中的最大金额

    // f(0) = 0
    // f(1) = nums[0]
    // f(k) = max{ rob(k-1), nums[k-1] + rob(k-2) }

    int N = nums.length;
    int[] dp = new int[N + 1];
    dp[0] = 0;
    dp[1] = nums[0];
    for (int k = 2; k <= N; k++) {
      dp[k] = Math.max(dp[k - 1], nums[k - 1] + dp[k - 2]);
    }
    return dp[N];
  }

  public int rob2(int[] nums) {
    if (nums.length == 0) {return 0;}
    if (nums.length == 1) {return nums[0];}
    // 子问题：
    // f(k) = 偷 [0..k) 房间中的最大金额

    // f(0) = 0
    // f(1) = nums[0]
    // f(k) = max{ rob(k-1), nums[k-1] + rob(k-2) }

    int N = nums.length;
    int[] dp = new int[N + 1];
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);
    for (int k = 2; k < N; k++) {
      dp[k] = Math.max(dp[k - 1], nums[k] + dp[k - 2]);
    }
    return dp[N - 1];
  }

}

