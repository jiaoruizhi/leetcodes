package leetcodes.code202407;

import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*
给你一个
二进制数组
nums 。

如果一个
子数组
中 不存在 两个 相邻 元素的值 相同 的情况，我们称这样的子数组为 交替子数组 。

返回数组 nums 中交替子数组的数量。


*
*
* */


public class code_3101_countAlternatingSubarrays {
  public static void main(String[] args) {
    code_3101_countAlternatingSubarrays body = new code_3101_countAlternatingSubarrays();
    Scanner sc = new Scanner(System.in);

    // 0 1 1 1
    // 1 0 1 0
    int[] nums = getIntArray(sc, " ");

    System.out.println(body.countAlternatingSubarrays(nums));
  }

  public long countAlternatingSubarrays(int[] nums) {
    long result = nums.length, count = 1;
    int last = nums[0];

    for (int i = 1; i < nums.length; i++) {
      int now = nums[i];
      if (now == last) {
        result += count * (count - 1) / 2;
        count = 1;
      } else {
        count++;
      }
      last = now;
    }
    result += count * (count - 1) / 2;
    return result;
  }
}

