package code202404_2;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*
给定两个数组 nums1 和 nums2 ，返回 它们的
交集
 。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 *
 *
 *
* */
public class code_0349_intersection {
  public static void main(String[] args) {
    code_0349_intersection body = new code_0349_intersection();
    Scanner sc = new Scanner(System.in);

    // 4 9 5
    int[] nums1 = getIntArray(sc, " ");

    // 9 4 9 8 4
    int[] nums2 = getIntArray(sc, " ");
    System.out.println(Arrays.toString(body.intersection(nums1, nums2)));
  }

  public int[] intersection(int[] nums1, int[] nums2) {
    int[] data = new int[1001];
    for (int num : nums1) {
      data[num] = 1;
    }

    int index = 0;
    int[] cache = new int[nums2.length];

    for (int i = 0; i < nums2.length; i++) {
      int value = nums2[i];
      if (data[value] > 0) {
        cache[index++] = value;
        data[value] = 0;
      }
    }

    int[] result = new int[index];
    System.arraycopy(cache, 0, result, 0, index);
    return result;
  }
}

