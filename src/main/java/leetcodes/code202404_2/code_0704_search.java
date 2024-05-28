package leetcodes.code202404_2;

import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*
如果一个正方形矩阵满足下述 全部 条件，则称之为一个 X 矩阵 ：

    矩阵对角线上的所有元素都 不是 0
    矩阵中所有其他元素都是 0

给你一个大小为 n x n 的二维整数数组 grid ，表示一个正方形矩阵。如果 grid 是一个 X 矩阵 ，返回 true ；否则，返回 false 。
*
* */
public class code_0704_search {
  public static void main(String[] args) {
    code_0704_search body = new code_0704_search();
    Scanner sc = new Scanner(System.in);

    // -1,0,3,5,9,12
    int[] nums = getIntArray(sc, ",");

    // 9
    int target = sc.nextInt();

    System.out.println(body.search(nums, target));
  }

  public int search(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left <= right) {
      int mid = (right + left) >> 1;
      int current = nums[mid];
      if (current == target) {
        return mid;
      }
      if (current > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }
    return -1;
  }
}

