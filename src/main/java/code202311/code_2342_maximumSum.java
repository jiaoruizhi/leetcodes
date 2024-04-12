package code202311;

import static utils.arrayUtils.getIntArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
*

给你一个下标从 0 开始的数组 nums ，数组中的元素都是 正 整数。请你选出两个下标 i 和 j（i != j），且 nums[i] 的数位和 与  nums[j] 的数位和相等。

请你找出所有满足条件的下标 i 和 j ，找出并返回 nums[i] + nums[j] 可以得到的 最大值 。
* */
public class code_2342_maximumSum {
  public static void main(String[] args) {
    code_2342_maximumSum body = new code_2342_maximumSum();
    Scanner sc = new Scanner(System.in);

    // 18,43,36,13,7
    int[] nums = getIntArray(sc, ",");

    System.out.println(body.maximumSum(nums));
  }


  public int maximumSum(int[] nums) {
    Arrays.sort(nums);

    HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

    for (int num : nums) {
      int sum = getSum(num);
      ArrayList<Integer> now = map.getOrDefault(sum, new ArrayList<>());
      now.add(num);
      map.put(sum,now);
    }

    int max = -1;

    for (ArrayList<Integer> list : map.values()) {
      int size = list.size();
      if (size >= 2) {
        int cache = list.get(size-1) + list.get(size-2);
        max = Math.max(max, cache);
      }
    }

    return max;
  }

  public int getSum(int num) {
    int result = 0;
    int count = num;
    while (count > 0) {
      result += count % 10;
      count /= 10;
    }

    return result;
  }

}

