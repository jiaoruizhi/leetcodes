package leetcodes.code202406;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/*
*
给你两个长度为 n 下标从 0 开始的整数数组 cost 和 time ，分别表示给 n 堵不同的墙刷油漆需要的开销和时间。你有两名油漆匠：

    一位需要 付费 的油漆匠，刷第 i 堵墙需要花费 time[i] 单位的时间，开销为 cost[i] 单位的钱。
    一位 免费 的油漆匠，刷 任意 一堵墙的时间为 1 单位，开销为 0 。但是必须在付费油漆匠 工作 时，免费油漆匠才会工作。

请你返回刷完 n 堵墙最少开销为多少。
*
* */


public class code_0494_findTargetSumWays {
  public static void main(String[] args) {
    code_0494_findTargetSumWays body = new code_0494_findTargetSumWays();
    Scanner sc = new Scanner(System.in);

    // 1 1 1 1 1
    // 3
    int[] nums = getIntArray(sc, " ");
    int target = sc.nextInt();

    System.out.println(body.findTargetSumWays(nums, target));
  }


  int result = 0;
  int[] flags = new int[] {1, -1};
  Stack<Integer> stack = new Stack<Integer>(); // 结果栈
  public int findTargetSumWays(int[] nums, int target) {

    backtrack(nums, target);
    return result;
  }

  public void backtrack( //
    int[] nums,
    int target
  ) {
    int n = nums.length;

    // 所有数都填完了
    if (stack.size() == n) {
      int get = 0, index = 0;
      for (int flag : stack) {
        get += flag * nums[index++];
      }
      if (get == target) {
        result++;
      }
      return;
    }
    for (int i = 0; i < 2; i++) {
      // 动态维护数组
      stack.push(flags[i]);
      // 继续递归填下一个数
      backtrack(nums, target);
      // 撤销操作
      stack.pop();
    }
  }

  private int[] nums;

  private int[][] memo;



  public int findTargetSumWays2(int[] nums, int target) {
    int s = 0;
    for (int x : nums) {
      s += x;
    }

    s -= Math.abs(target);
    if (s < 0 || s % 2 == 1) {
      return 0;
    }

    int m = s / 2; // 背包容量
    this.nums = nums;
    int n = nums.length;
    memo = new int[n][m + 1];
    for (int[] row : memo) {
      Arrays.fill(row, -1); // -1 表示没有计算过
    }
    return dfs(n - 1, m);
  }



  private int dfs(int i, int c) {
    if (i < 0) {
      return c == 0 ? 1 : 0;
    }

    if (memo[i][c] != -1) { // 之前计算过
      return memo[i][c];
    }

    if (c < nums[i]) {
      return memo[i][c] = dfs(i - 1, c); // 只能不选
    }
    return memo[i][c] = dfs(i - 1, c) + dfs(i - 1, c - nums[i]); // 不选 + 选
  }
}

