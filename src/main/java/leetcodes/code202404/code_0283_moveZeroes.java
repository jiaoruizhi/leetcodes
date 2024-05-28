package leetcodes.code202404;


import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

请注意 ，必须在不复制数组的情况下原地对数组进行操作。

*
* */
public class code_0283_moveZeroes {
  public static void main(String[] args) {
    code_0283_moveZeroes body = new code_0283_moveZeroes();
    Scanner sc = new Scanner(System.in);

    // 2 3 -2 4
    int[] nums = getIntArray(sc, " ");
    body.moveZeroes(nums);
    System.out.println(Arrays.toString(nums));

  }

  public void moveZeroes(int[] nums) {
    int len = nums.length;
    //初始化第一个指针
    int p = 0;
    for (int i = 0; i < len; i++) {
      if (nums[i] != 0) {
        nums[p++] = nums[i];
      }
    }
    for (int j = p; j < len; j++) {
      nums[j] = 0;
    }
  }
}
