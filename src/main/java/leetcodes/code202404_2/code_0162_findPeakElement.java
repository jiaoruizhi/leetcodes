package leetcodes.code202404_2;

import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*
峰值元素是指其值严格大于左右相邻值的元素。

给你一个整数数组 nums，找到峰值元素并返回其索引。数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。

你可以假设 nums[-1] = nums[n] = -∞ 。

你必须实现时间复杂度为 O(log n) 的算法来解决此问题。
* */
public class code_0162_findPeakElement {
  public static void main(String[] args) {
    code_0162_findPeakElement body = new code_0162_findPeakElement();
    Scanner sc = new Scanner(System.in);

    // 1 2 1 3 5 6 4
    int[] nums = getIntArray(sc, " ");
    System.out.println(body.findPeakElement(nums));
  }


  public int findPeakElement(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
      int last = nums[i - 1];
      int current = nums[i];
      if (current < last) {
        return i - 1;
      }
    }
    return nums.length - 1;
  }
}

