package leetcodes.code202310;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*

一个厨师收集了他 n 道菜的满意程度 satisfaction ，这个厨师做出每道菜的时间都是 1 单位时间。

一道菜的 「 like-time 系数 」定义为烹饪这道菜结束的时间（包含之前每道菜所花费的时间）乘以这道菜的满意程度，也就是 time[i]*satisfaction[i] 。

返回厨师在准备了一定数量的菜肴后可以获得的最大 like-time 系数 总和。

你可以按 任意 顺序安排做菜的顺序，你也可以选择放弃做某些菜来获得更大的总和。
*
* */
public class code_1402_maxSatisfaction {
  public static void main(String[] args) {
    code_1402_maxSatisfaction body = new code_1402_maxSatisfaction();
    Scanner sc = new Scanner(System.in);

    // s
    int[] nums = getIntArray(sc, null);
    System.out.println(body.maxSatisfaction(nums));
  }

  public int maxSatisfaction(int[] satisfaction) {
    int n = satisfaction.length;
    int[][] dp = new int[n + 1][n + 1];
    Arrays.sort(satisfaction);
    int res = 0;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        dp[i][j] = dp[i - 1][j - 1] + satisfaction[i - 1] * j;
        if (j < i) {
          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j]);
        }
        res = Math.max(res, dp[i][j]);
      }
    }
    return res;
  }

  public int maxSatisfaction2(int[] satisfaction) {
    int ans = 0, sum = 0;
    Arrays.sort(satisfaction);
    for (int i = satisfaction.length - 1; i >= 0; i--) {
      sum += satisfaction[i];
      if (sum <= 0) break;
      ans += sum;
    }
    return ans;
  }



}

