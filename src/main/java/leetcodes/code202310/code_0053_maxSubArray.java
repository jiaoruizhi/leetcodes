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
public class code_0053_maxSubArray {
  public static void main(String[] args) {
    code_0053_maxSubArray body = new code_0053_maxSubArray();
    Scanner sc = new Scanner(System.in);


    // -2,1,-3,4,-1,2,1,-5,4
    int[] nums = getIntArray(sc, ",");



    System.out.println(body.maxSubArray(nums));
  }

  public int maxSubArray(int[] nums) {
    int pre = 0, maxAns = nums[0];
    for (int x : nums) {
      pre = Math.max(pre + x, x);
      maxAns = Math.max(maxAns, pre);
    }
    return maxAns;
  }

}

