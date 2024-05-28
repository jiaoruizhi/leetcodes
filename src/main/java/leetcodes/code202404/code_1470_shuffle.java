package leetcodes.code202404;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*
给你一个数组 nums ，数组中有 2n 个元素，按 [x1,x2,...,xn,y1,y2,...,yn] 的格式排列。

请你将数组按 [x1,y1,x2,y2,...,xn,yn] 格式重新排列，返回重排后的数组。

* */
public class code_1470_shuffle {
  public static void main(String[] args) {
    code_1470_shuffle body = new code_1470_shuffle();
    Scanner sc = new Scanner(System.in);

    // -2 -1 -1 1 2 3
    int[] nums = getIntArray(sc, " ");

    int n = sc.nextInt();

    System.out.println(Arrays.toString(body.shuffle(nums, n)));
  }

  public int[] shuffle(int[] nums, int n) {
    int left = 0, right = n;

    int[] result = new int[2 * n];
    for (int i = 0; i < n; i++) {
      result[2 * i] = nums[left];
      result[2 * i + 1] = nums[right];
      left++;
      right++;
    }
    return result;

  }

}

