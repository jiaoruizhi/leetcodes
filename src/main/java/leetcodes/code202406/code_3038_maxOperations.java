package leetcodes.code202406;

import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*
给你一个整数数组 nums ，如果 nums 至少 包含 2 个元素，你可以执行以下操作：

    选择 nums 中的前两个元素并将它们删除。

一次操作的 分数 是被删除元素的和。

在确保 所有操作分数相同 的前提下，请你求出 最多 能进行多少次操作。

请你返回按照上述要求 最多 可以进行的操作次数。
*
*
* */


public class code_3038_maxOperations {
  public static void main(String[] args) {
    code_3038_maxOperations body = new code_3038_maxOperations();
    Scanner sc = new Scanner(System.in);

    // 3 2 1 4 5
    int[] nums = getIntArray(sc, " ");

    System.out.println(body.maxOperations(nums));
  }

  public int maxOperations(int[] nums) {
    if (nums.length < 2) {
      return 0;
    }
    int result = 0, i1 = 0, i2 = 1, point = nums[i1] + nums[i2], n = nums.length;

    while (i1 < n && i2 < n) {
      int cache = nums[i1] + nums[i2];
      if (cache != point) {
        break;
      }
      i1 += 2;
      i2 += 2;
      result++;
    }

    return result;
  }
}

