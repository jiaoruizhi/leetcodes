package code202404_2;


import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
 *

给定一个整数数组 A，返回其中元素之和可被 K 整除的（连续、非空）子数组的数目。



示例：

输入：A = [4,5,0,-2,-3,1], K = 5
输出：7
解释：
有 7 个子数组满足其元素之和可被 K = 5 整除：
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]

*
*/
public class code_0974_subarraysDivByK {
  public static void main(String[] args) {
    code_0974_subarraysDivByK body = new code_0974_subarraysDivByK();
    Scanner sc = new Scanner(System.in);

    // 4 5 0 -2 -3 1
    int[] nums = getIntArray(sc, " ");

    // 5
    int k = sc.nextInt();
    System.out.println(body.subarraysDivByK(nums, k));
  }

  public int subarraysDivByK(int[] nums, int k) {
    long[] restArray = new long[k];
    int result = 0, cache = 0, length = nums.length;
    for (int i = 0; i < length; i++) {
      cache += nums[i];
      cache %= k;
      int rest = cache;
      rest = rest < 0 ? k + rest : rest;
      if (rest == 0) {
        result++;
      }
      restArray[rest]++;
    }
    for (int i = 0; i < k; i++) {
      if (restArray[i] == 0) {
        continue;
      }
      result += restArray[i] * (restArray[i] - 1) / 2;
    }
    return result;
  }
}
