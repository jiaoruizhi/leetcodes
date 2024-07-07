package leetcodes.code202406;

import static utils.arrayUtils.getIntArray;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

/*
*
给定一个循环数组 nums （ nums[nums.length - 1] 的下一个元素是 nums[0] ），返回 nums 中每个元素的 下一个更大元素 。

数字 x 的 下一个更大的元素 是按数组遍历顺序，这个数字之后的第一个比它更大的数，
* 这意味着你应该循环地搜索它的下一个更大的数。如果不存在，则输出 -1 。
*
*
* */


public class code_0503_nextGreaterElements {
  public static void main(String[] args) {
    code_0503_nextGreaterElements body = new code_0503_nextGreaterElements();
    Scanner sc = new Scanner(System.in);

    // 1 2 1
    // 1 2 3 4 3
    int[] s = getIntArray(sc, " ");

    System.out.println(Arrays.toString(body.nextGreaterElements(s)));
  }

  public int[] nextGreaterElements(int[] nums) {
    int n = nums.length;
    int[] ans = new int[n];
    Arrays.fill(ans, -1);
    Deque<Integer> d = new ArrayDeque<>();
    for (int i = 0; i < n * 2; i++) {
      while (!d.isEmpty() && nums[i % n] > nums[d.peekLast()]) {
        int u = d.pollLast();
        ans[u] = nums[i % n];
      }
      d.addLast(i % n);
    }
    return ans;
  }
}

