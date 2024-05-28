package leetcodes.code202404;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;

/*
*

给你一个数字数组 arr 。

如果一个数列中，任意相邻两项的差总等于同一个常数，那么这个数列就称为 等差数列 。

如果可以重新排列数组形成等差数列，请返回 true ；否则，返回 false 。
* */
public class code_1502_canMakeArithmeticProgression {
  public static void main(String[] args) {
    code_1502_canMakeArithmeticProgression body = new code_1502_canMakeArithmeticProgression();

    // -2 -1 -1 1 2 3
    int[] nums = getIntArray(null, null);

    System.out.println(body.canMakeArithmeticProgression(nums));
  }

  public boolean canMakeArithmeticProgression(int[] arr) {
    Arrays.sort(arr);

    if (arr.length < 3)
      return true;

    int k = arr[1] - arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[i - 1] + k)
        return false;
    }
    return true;
  }

}

