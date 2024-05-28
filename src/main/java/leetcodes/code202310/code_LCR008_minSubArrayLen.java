package leetcodes.code202310;

import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*

给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

子数组 是数组中的一个连续部分。
*
*
* */
public class code_LCR008_minSubArrayLen {
  public static void main(String[] args) {
    code_LCR008_minSubArrayLen body = new code_LCR008_minSubArrayLen();
    Scanner sc = new Scanner(System.in);



    // 2,3,1,2,4,3
    int[] nums = getIntArray(sc, ",");

    int target = sc.nextInt();

    System.out.println(body.minSubArrayLen(target, nums));
  }

  public int minSubArrayLen(int target, int[] nums) {
    int left = 0, right = 0, sum = 0, min = Integer.MAX_VALUE;

    while (right < nums.length) {
      sum += nums[right++];
      while (sum >= target) {
        min = Math.min(min, right - left);
        sum -= nums[left++];
      }
    }
    return min == Integer.MAX_VALUE ? 0 : min;
  }

}

