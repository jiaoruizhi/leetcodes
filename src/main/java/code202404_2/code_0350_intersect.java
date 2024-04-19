package code202404_2;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*
给你两个整数数组 nums1 和 nums2 ，
* 请你以数组形式返回两数组的交集。
* 返回结果中每个元素出现的次数，
* 应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 *
* */
public class code_0350_intersect {
  public static void main(String[] args) {
    code_0350_intersect body = new code_0350_intersect();
    Scanner sc = new Scanner(System.in);

    // 4 9 5 4
    int[] nums1 = getIntArray(sc, " ");

    // 9 4 9 8 4
    int[] nums2 = getIntArray(sc, " ");
    System.out.println(Arrays.toString(body.intersect(nums1, nums2)));
  }

  public int[] intersect(int[] nums1, int[] nums2) {
    int[] data1 = new int[1001];
    for (int num : nums1) {
      data1[num]++;
    }

    int index = 0;
    int[] cache = new int[nums2.length];

    for (int i = 0; i < nums2.length; i++) {
      int value = nums2[i];
      if (data1[value] > 0) {
        cache[index++] = value;
        data1[value]--;
      }
    }

    int[] result = new int[index];
    System.arraycopy(cache, 0, result, 0, index);
    return result;
  }
}

