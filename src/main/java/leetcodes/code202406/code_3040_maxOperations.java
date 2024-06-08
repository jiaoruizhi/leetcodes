package leetcodes.code202406;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
*
给你一个整数数组 nums ，如果 nums 至少 包含 2 个元素，你可以执行以下操作中的 任意 一个：

    选择 nums 中最前面两个元素并且删除它们。
    选择 nums 中最后两个元素并且删除它们。
    选择 nums 中第一个和最后一个元素并且删除它们。

一次操作的 分数 是被删除元素的和。

在确保 所有操作分数相同 的前提下，请你求出 最多 能进行多少次操作。

请你返回按照上述要求 最多 可以进行的操作次数。
*
*
* */


public class code_3040_maxOperations {
  public static void main(String[] args) {
    code_3040_maxOperations body = new code_3040_maxOperations();
    Scanner sc = new Scanner(System.in);

    // 3 2 1 2 3 4
    // 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000 1000
    int[] nums = getIntArray(sc, " ");

    System.out.println(body.maxOperations(nums));
  }

  int[] data;

  public int maxOperations(int[] nums) {
    if (nums.length < 2) {
      return 0;
    }
    data = nums;
    int result = 0, n = nums.length, left = 0, right = n - 1;
    HashSet<Integer> set = new HashSet<>() {{
      add(nums[0] + nums[1]);
      add(nums[0] + nums[n - 1]);
      add(nums[n - 1] + nums[n - 2]);
    }};

    for (int target : set) {
      result = Math.max(result, getOperation(left, right, target));
    }
    return result;
  }

  public int getOperation(int left, int right, int target) {
    int result = 0, start = 0, end = data.length - 1;
    if (left < start || right > end || left > end || right < start || left >= right) {
      return 0;
    }
    if (data[left] + data[right] == target) {
      result = Math.max(result, getOperation(left + 1, right - 1, target) + 1);
    }
    if (left + 1 <= right && data[left] + data[left + 1] == target) {
      result = Math.max(result, getOperation(left + 2, right, target) + 1);
    }
    if (right - 1 >= left && data[right] + data[right - 1] == target) {
      result = Math.max(result, getOperation(left, right - 2, target) + 1);
    }

    return result;
  }



  ////////////////////////////////////////////////////////////////////////////////////////////////////////


  private int[] nums;
  private int[][] memo;
  private boolean done;

  public int maxOperations2(int[] nums) {
    this.nums = nums;
    int n = nums.length;
    memo = new int[n][n];
    int res1 = helper(2, n - 1, nums[0] + nums[1]); // 删除前两个数
    int res2 = helper(0, n - 3, nums[n - 2] + nums[n - 1]); // 删除后两个数
    int res3 = helper(1, n - 2, nums[0] + nums[n - 1]); // 删除第一个和最后一个数
    return Math.max(Math.max(res1, res2), res3) + 1; // 加上第一次操作
  }

  private int helper(int i, int j, int target) {
    if (done) { // 说明之前已经算出了 res = n / 2
      return 0; // 返回任意 <= n/2 的数均可
    }
    for (int[] row : memo) {
      Arrays.fill(row, -1); // -1 表示没有计算过
    }
    return dfs(i, j, target);
  }

  private int dfs(int i, int j, int target) {
    if (done) {
      return 0;
    }
    if (i >= j) {
      done = true;
      return 0;
    }
    if (memo[i][j] != -1) { // 之前计算过
      return memo[i][j];
    }
    int res = 0;
    if (nums[i] + nums[i + 1] == target) { // 删除前两个数
      res = Math.max(res, dfs(i + 2, j, target) + 1);
    }
    if (nums[j - 1] + nums[j] == target) { // 删除后两个数
      res = Math.max(res, dfs(i, j - 2, target) + 1);
    }
    if (nums[i] + nums[j] == target) { // 删除第一个和最后一个数
      res = Math.max(res, dfs(i + 1, j - 1, target) + 1);
    }
    return memo[i][j] = res; // 记忆化
  }
}

