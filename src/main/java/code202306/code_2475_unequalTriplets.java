package code202306;


import static utils.utils.getIntArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
*

给你一个下标从 0 开始的正整数数组 nums 。请你找出并统计满足下述条件的三元组 (i, j, k) 的数目：

    0 <= i < j < k < nums.length
    nums[i]、nums[j] 和 nums[k] 两两不同 。
        换句话说：nums[i] != nums[j]、nums[i] != nums[k] 且 nums[j] != nums[k] 。

返回满足上述条件三元组的数目。

* */
public class code_2475_unequalTriplets {
  public static void main(String[] args) {
    // 4 4 2 4 3
    // 1 1 1 1 2 2 2 3 3 3 3 4 4
    // 1 1 1 1 2 2 2 3 3 4 4 4
    Scanner sc = new Scanner(System.in);
    int[] nums = getIntArray(sc, null);
    System.out.println(unequalTriplets(nums));
  }

  public static int unequalTriplets(int[] nums) {
    Arrays.sort(nums);
    int res = 0, n = nums.length;
    for (int i = 0, j = 0; i < n; i = j) {
      while (j < n && nums[j] == nums[i]) {
        j++;
      }
      res += i * (j - i) * (n - j);
    }
    return res;
  }

  public static int unequalTriplets2(int[] nums) {
    HashMap<Integer, Integer> hash = new HashMap<>();

    for (int i : nums) {
      hash.merge(i,1, Integer::sum);
    }

    int res = 0, n = nums.length, t = 0;
    for (int i : hash.keySet()) {
      int value = hash.get(i);
      res += t * value * (n - t - value);
      t += value;
    }

    return res;
  }
}

