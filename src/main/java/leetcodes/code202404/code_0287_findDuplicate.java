package leetcodes.code202404;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
*
* 给定一个包含 n + 1 个整数的数组 nums，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。假设只有一个重复的整数，找出这个重复的数。

示例 1:

输入: [1,3,4,2,2]
输出: 2

示例 2:

输入: [3,1,3,4,2]
输出: 3

说明：

    不能更改原数组（假设数组是只读的）。
    只能使用额外的 O(1) 的空间。
    时间复杂度小于 O(n2) 。
    数组中只有一个重复的数字，但它可能不止重复出现一次。

*
*
* */
public class code_0287_findDuplicate {
  public static void main(String[] args) {
    code_0287_findDuplicate body = new code_0287_findDuplicate();
    Scanner sc = new Scanner(System.in);

    // -2 -1 -1 1 2 3
    int[] nums = getIntArray(sc, " ");

    System.out.println(body.findDuplicate(nums));
  }

  public int findDuplicate(int[] nums) {
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 1; i++) {
      if ((nums[i] ^ nums[i + 1]) == 0) {
        return nums[i];
      }
    }
    return 0;
  }

  public int findDuplicate2(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length - 1; i++) {
      if (!set.add(nums[i])) {
        return nums[i];
      }
    }
    return 0;
  }
}
