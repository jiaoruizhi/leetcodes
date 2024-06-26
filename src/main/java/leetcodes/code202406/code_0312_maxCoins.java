package leetcodes.code202406;

import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*
有 n 个气球，编号为0 到 n - 1，每个气球上都标有一个数字，这些数字存在数组 nums 中。

现在要求你戳破所有的气球。戳破第 i 个气球，你可以获得 nums[i - 1] * nums[i] * nums[i + 1] 枚硬币。
*
* 这里的 i - 1 和 i + 1 代表和 i 相邻的两个气球的序号。如果 i - 1或 i + 1 超出了数组的边界，那么就当它是一个数字为 1 的气球。

求所能获得硬币的最大数量。
*
*
*
* */


public class code_0312_maxCoins {
  public static void main(String[] args) {
    code_0312_maxCoins body = new code_0312_maxCoins();
    Scanner sc = new Scanner(System.in);

    // 3 1 5 8
    // 1
    int[] nums = getIntArray(sc, " ");

    System.out.println(body.maxCoins(nums));
  }

  public int maxCoins(int[] nums) {
    int n = nums.length;
    // 添加两侧的虚拟气球
    int[] points = new int[n + 2];
    points[0] = points[n + 1] = 1;
    for (int i = 1; i <= n; i++) {
      points[i] = nums[i - 1];
    }
    // base case 已经都被初始化为 0
    int[][] dp = new int[n + 2][n + 2];
    // 开始状态转移
    // i 应该从下往上
    for (int i = n; i >= 0; i--) {
      // j 应该从左往右
      for (int j = i + 1; j < n + 2; j++) {
        // 最后戳破的气球是哪个？
        for (int k = i + 1; k < j; k++) {
          // 择优做选择
          dp[i][j] = Math.max(
            dp[i][j],
            dp[i][k] + dp[k][j] + points[i] * points[j] * points[k]);
        }
      }
    }
    return dp[0][n + 1];
  }
}

