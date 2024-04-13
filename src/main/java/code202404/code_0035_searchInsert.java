package code202404;

import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*
给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

请必须使用时间复杂度为 O(log n) 的算法。

*
* */
public class code_0035_searchInsert {
  public static void main(String[] args) {
    code_0035_searchInsert body = new code_0035_searchInsert();
    Scanner sc = new Scanner(System.in);

    // 2 2 0 1 0 0

    // 1 3 5 6
    int[] nums = getIntArray(sc, " ");

    // 2
    int n = sc.nextInt();

    System.out.println(body.searchInsert(nums, n));
  }

  public int searchInsert(int[] nums, int target) {
    int n = nums.length;
    int left = 0, right = n - 1, ans = n;
    while (left <= right) {
      int mid = ((right - left) >> 1) + left;
      if (target <= nums[mid]) {
        ans = mid;
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return ans;
  }
}

