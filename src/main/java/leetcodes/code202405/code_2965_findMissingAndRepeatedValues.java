package leetcodes.code202405;

import static utils.arrayUtils.getIntDoubleArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
*
给你一个下标从 0 开始的二维整数矩阵 grid，大小为 n * n ，其中的值在 [1, n2] 范围内。除了 a 出现 两次，b 缺失 之外，每个整数都 恰好出现一次 。

任务是找出重复的数字a 和缺失的数字 b 。

返回一个下标从 0 开始、长度为 2 的整数数组 ans ，其中 ans[0] 等于 a ，ans[1] 等于 b 。
* */


public class code_2965_findMissingAndRepeatedValues {
  public static void main(String[] args) {
    code_2965_findMissingAndRepeatedValues body = new code_2965_findMissingAndRepeatedValues();
    Scanner sc = new Scanner(System.in);

    // 2 2 5 2 1 6
    // 2
    int[][] grid = getIntDoubleArray();
    // 2 4 3 3 5 4 9 6
    // 4
    int k = sc.nextInt();

    System.out.println(Arrays.toString(body.findMissingAndRepeatedValues(grid)));
  }


  public int[] findMissingAndRepeatedValues(int[][] grid) {
    int[] result = new int[2];
    int n = grid.length;
    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < n; i++) {
      for (int value : grid[i]) {
        if (!set.add(value)) {
          result[0] = value;
        }
      }
    }
    for (int i = 1; i <= n * n; i++) {
      if (!set.contains(i)) {
        result[1] = i;
        break;
      }
    }
    return result;
  }
}

