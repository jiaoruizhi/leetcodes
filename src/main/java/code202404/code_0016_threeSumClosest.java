package code202404;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*
给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。

返回这三个数的和。

假定每组输入只存在恰好一个解。
*
* */
public class code_0016_threeSumClosest {
  public static void main(String[] args) {
    code_0016_threeSumClosest body = new code_0016_threeSumClosest();
    Scanner sc = new Scanner(System.in);

    // nums = [-1,2,1,-4], target = 1
    // -1 2 1 -4
    // 1

    // 4 0 5 -5 3 3 0 -4 -5
    // -2
    int[] nums = getIntArray(sc, " ");

    int n = sc.nextInt();

    System.out.println(body.threeSumClosest(nums, n));
  }

  public int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int n = nums.length;
    int best = 10000000;

    // 枚举 a
    for (int i = 0; i < n; ++i) {
      // 保证和上一次枚举的元素不相等
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      // 使用双指针枚举 b 和 c
      int j = i + 1, k = n - 1;
      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        // 如果和为 target 直接返回答案
        if (sum == target) {
          return target;
        }
        // 根据差值的绝对值来更新答案
        if (Math.abs(sum - target) < Math.abs(best - target)) {
          best = sum;
        }
        if (sum > target) {
          // 如果和大于 target，移动 c 对应的指针
          int k0 = k - 1;
          // 移动到下一个不相等的元素
          while (j < k0 && nums[k0] == nums[k]) {
            --k0;
          }
          k = k0;
        } else {
          // 如果和小于 target，移动 b 对应的指针
          int j0 = j + 1;
          // 移动到下一个不相等的元素
          while (j0 < k && nums[j0] == nums[j]) {
            ++j0;
          }
          j = j0;
        }
      }
    }
    return best;
  }

}

