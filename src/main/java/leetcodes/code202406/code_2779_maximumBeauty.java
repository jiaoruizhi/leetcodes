package leetcodes.code202406;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*
给你一个下标从 0 开始的整数数组 nums 和一个 非负 整数 k 。

在一步操作中，你可以执行下述指令：

    在范围 [0, nums.length - 1] 中选择一个 此前没有选过 的下标 i 。
    将 nums[i] 替换为范围 [nums[i] - k, nums[i] + k] 内的任一整数。

数组的 美丽值 定义为数组中由相等元素组成的最长子序列的长度。

对数组 nums 执行上述操作任意次后，返回数组可能取得的 最大 美丽值。

注意：你 只 能对每个下标执行 一次 此操作。

数组的 子序列 定义是：经由原数组删除一些元素（也可能不删除）得到的一个新数组，且在此过程中剩余元素的顺序不发生改变。
*
* */


public class code_2779_maximumBeauty {
  public static void main(String[] args) {
    code_2779_maximumBeauty body = new code_2779_maximumBeauty();
    Scanner sc = new Scanner(System.in);

    // 4 6 1 2
    // 2
    int[] nums = getIntArray(sc, " ");
    int k = sc.nextInt();

    System.out.println(body.maximumBeauty(nums, k));
  }


  public int maximumBeauty(int[] nums, int k) {
    Arrays.sort(nums);

    int ans = 0;
    int left = 0;
    for (int right = 0; right < nums.length; right++) {
      while (nums[right] - nums[left] > k * 2) {
        left++;
      }
      ans = Math.max(ans, right - left + 1);
    }
    return ans;
  }

}
