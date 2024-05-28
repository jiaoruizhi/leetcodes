package leetcodes.code202405;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*
给你一个整数数组 nums 和一个正整数 k ，返回长度为 k 且最具 竞争力 的 nums 子序列。

数组的子序列是从数组中删除一些元素（可能不删除元素）得到的序列。

在子序列 a 和子序列 b 第一个不相同的位置上，如果 a 中的数字小于 b 中对应的数字，
* 那么我们称子序列 a 比子序列 b（相同长度下）更具 竞争力 。
*
* 例如，[1,3,4] 比 [1,3,5] 更具竞争力，在第一个不相同的位置，也就是最后一个位置上， 4 小于 5 。
*
* */


public class code_1673_mostCompetitive {
  public static void main(String[] args) {
    code_1673_mostCompetitive body = new code_1673_mostCompetitive();
    Scanner sc = new Scanner(System.in);

    // 3 5 2 6
    // 2
    int[] nums = getIntArray(sc, " ");
    // 2 4 3 3 5 4 9 6
    // 4
    int k = sc.nextInt();

    System.out.println(Arrays.toString(body.mostCompetitive(nums, k)));
  }


  public int[] mostCompetitive(int[] nums, int k) {
    int n = nums.length;
    int[] st = new int[k];
    int m = 0; // 栈的大小
    for (int i = 0; i < n; i++) {
      int x = nums[i];
      while (m > 0 && x < st[m - 1] && m + n - i > k) {
        m--;
      }
      if (m < k) {
        st[m++] = x;
      }
    }
    return st;
  }
}

