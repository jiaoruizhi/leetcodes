package code202310;

import static utils.utils.getIntArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
*

给你一个下标从 0 开始的整数数组 nums 和一个整数 k 。你的 起始分数 为 0 。

在一步 操作 中：

    选出一个满足 0 <= i < nums.length 的下标 i ，
    将你的 分数 增加 nums[i] ，并且
    将 nums[i] 替换为 ceil(nums[i] / 3) 。

返回在 恰好 执行 k 次操作后，你可能获得的最大分数。

向上取整函数 ceil(val) 的结果是大于或等于 val 的最小整数。
* */
public class code_2530_maxKelements {
  public static void main(String[] args) {
    code_2530_maxKelements body = new code_2530_maxKelements();
    Scanner sc = new Scanner(System.in);


    // 2 1 2 1 4
    int[] nums = getIntArray(sc, null);

    int k = sc.nextInt();

    System.out.println(body.maxKelements(nums, k));
  }

  public long maxKelements(int[] nums, int k) {
    PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
    for (int num : nums) {
      q.offer(num);
    }
    long ans = 0;
    for (int i = 0; i < k; ++i) {
      int x = q.poll();
      ans += x;
      q.offer((x + 2) / 3);
    }
    return ans;
  }

}

