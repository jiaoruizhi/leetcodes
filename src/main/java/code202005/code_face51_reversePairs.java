package code202005;

import java.util.*;

/*
*
* 在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
*
输入: [7,5,6,4]
输出: 5
*
* */
public class code_face51_reversePairs {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] get = new int[num];
    for (int i = 0; i < num; i++) {
      get[i] = sc.nextInt();
    }


    long startTime = new Date().getTime();
    int ret = reversePairs(get);
    System.out.println(ret);
    long endTime = new Date().getTime();
    System.out.println("本程序运行 " + (endTime - startTime) + " 毫秒完成。");

  }

  private static int reversePairs(int[] nums) {
    int len = nums.length;
    if (len < 2) {
      return 0;
    }
    int[] copy = new int[len];
    for (int i = 0; i < len; i++) {
      copy[i] = nums[i];
    }
    int[] temp = new int[len];
    return reversePairs(copy, 0, len - 1, temp);
  }


  private static int reversePairs(int[] nums, int left, int right, int[] temp) {
    if (left == right) {
      return 0;
    }

    //当left 和 right 特别大时    left+right会溢出int
    int mid = left + (right - left) / 2;
    int leftPairs = reversePairs(nums, left, mid, temp);
    int rightPairs = reversePairs(nums, mid + 1, right, temp);

    if (nums[mid] <= nums[mid + 1]) {
      return leftPairs + rightPairs;
    }

    int crossPairs = mergeAndCount(nums, left, mid, right, temp);
    return leftPairs + rightPairs + crossPairs;
  }


  private static int mergeAndCount(int[] nums, int left, int mid, int right, int[] temp) {
    for (int i = left; i <= right; i++) {
      temp[i] = nums[i];
    }

    int i = left;
    int j = mid + 1;

    int count = 0;
    for (int k = left; k <= right; k++) {

      if (i == mid + 1) {
        nums[k] = temp[j];
        j++;
        continue;
      }
      if (j == right + 1) {
        nums[k] = temp[i];
        i++;
        continue;
      }
      if (temp[i] <= temp[j]) {
        nums[k] = temp[i];
        i++;
        continue;
      } else {
        nums[k] = temp[j];
        j++;
        count += (mid - i + 1);
      }
    }
    return count;
  }



}
