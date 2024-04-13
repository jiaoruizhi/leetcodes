package code202404;

import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*
*
* 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。

示例 1:

输入: [1,2,3,1]
输出: 4
解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
     偷窃到的最高金额 = 1 + 3 = 4 。

示例 2:

输入: [2,7,9,3,1]
输出: 12
解释: 偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
     偷窃到的最高金额 = 2 + 9 + 1 = 12 。

*
*
*
*
* */
public class code_0198_rob {
  public static void main(String[] args) {
    code_0198_rob body = new code_0198_rob();
    Scanner sc = new Scanner(System.in);

    // -2 -1 -1 1 2 3
    int[] nums = getIntArray(sc, " ");
    System.out.println(body.rob(nums));
  }

  public int rob(int[] nums) {
    int[] cache = new int[nums.length + 1];

    cache[0] = 0;
    cache[1] = nums[0];
    for (int i = 2; i < cache.length; i++) {
      cache[i] = Math.max(cache[i-1], cache[i-2] + nums[i - 1]);
    }
    return cache[nums.length];
  }
}
