package code202405;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*
给你一个下标从 0 开始、长度为 n 的整数数组 nums ，以及整数 indexDifference 和整数 valueDifference 。

你的任务是从范围 [0, n - 1] 内找出  2 个满足下述所有条件的下标 i 和 j ：

    abs(i - j) >= indexDifference 且
    abs(nums[i] - nums[j]) >= valueDifference

返回整数数组 answer。如果存在满足题目要求的两个下标，则 answer = [i, j] ；
* 否则，answer = [-1, -1] 。如果存在多组可供选择的下标对，只需要返回其中任意一组即可。

注意：i 和 j 可能 相等 。
* */


public class code_2903_findIndices {
  public static void main(String[] args) {
    code_2903_findIndices body = new code_2903_findIndices();
    Scanner sc = new Scanner(System.in);

    // 3 5 2 6
    // 2
    int[] nums = getIntArray(sc, " ");
    // 2 4 3 3 5 4 9 6
    // 4
    int indexDifference = sc.nextInt();
    int valueDifference = sc.nextInt();

    System.out.println(Arrays.toString(body.findIndices(nums, indexDifference, valueDifference)));
  }


  public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
    int l = nums.length;
    for (int i = 0; i < l - indexDifference; i++) {
      int a = nums[i];
      for (int j = i + indexDifference; j < l; j++) {
        int b = nums[j];
        if (Math.abs(a - b) >= valueDifference) {
          return new int[] {i, j};
        }
      }
    }
    return new int[] {-1, -1};
  }
}

