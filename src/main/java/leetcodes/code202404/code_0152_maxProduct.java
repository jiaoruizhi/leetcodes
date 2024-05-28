package leetcodes.code202404;


import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*
* https://leetcode.cn/problems/maximum-product-subarray/description/
*
* 给定一个数组，求出其中子数组 的   最大乘积
*
输入: [2,3,-2,4]
输出: 6
解释: 子数组 [2,3] 有最大乘积 6。

输入: [-2,0,-1]
输出: 0
解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。


*
* */
public class code_0152_maxProduct {
  public static void main(String[] args) {
    code_0152_maxProduct body = new code_0152_maxProduct();
    Scanner sc = new Scanner(System.in);

    // 2 3 -2 4
    int[] get = getIntArray(sc, " ");
    int max = body.maxProduct(get);
    System.out.println(max);

  }

  public int maxProduct(int[] nums) {
    int length = nums.length;
    int[] maxF = new int[length];
    int[] minF = new int[length];
    System.arraycopy(nums, 0, maxF, 0, length);
    System.arraycopy(nums, 0, minF, 0, length);
    for (int i = 1; i < length; ++i) {
      maxF[i] = Math.max(maxF[i - 1] * nums[i], Math.max(nums[i], minF[i - 1] * nums[i]));
      minF[i] = Math.min(minF[i - 1] * nums[i], Math.min(nums[i], maxF[i - 1] * nums[i]));
    }
    int ans = maxF[0];
    for (int i = 1; i < length; ++i) {
      ans = Math.max(ans, maxF[i]);
    }
    return ans;
  }
}
