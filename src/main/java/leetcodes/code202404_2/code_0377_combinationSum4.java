package leetcodes.code202404_2;

import static utils.arrayUtils.getIntArray;
import static utils.utils.printArray;

import java.util.Scanner;

/*
*
给你一个由 不同 整数组成的数组 nums ，和一个目标整数 target 。请你从 nums 中找出并返回总和为 target 的元素组合的个数。

题目数据保证答案符合 32 位整数范围。
*
*
*
* */
public class code_0377_combinationSum4 {
  public static void main(String[] args) {
    code_0377_combinationSum4 body = new code_0377_combinationSum4();
    Scanner sc = new Scanner(System.in);

    // 2 3 6 7
    int[] nums = getIntArray(sc, " ");

    // 7
    int target = sc.nextInt();
    System.out.println(body.combinationSum4(nums, target));
  }

  public int combinationSum4(int[] nums, int target) {
    int[] dp = new int[target + 1];
    dp[0] = 1;
    for (int i = 1; i <= target; i++) {
      for (int num : nums) {
        if (num <= i) {
          dp[i] += dp[i - num];
        }
      }
      printArray(dp);
    }
    return dp[target];
  }
}

