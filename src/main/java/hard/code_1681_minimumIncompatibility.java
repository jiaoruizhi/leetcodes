package hard;

import static utils.arrayUtils.getIntArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/*
*
给你一个整数数组 nums 和一个整数 k 。你需要将这个数组划分到 k 个相同大小的子集中，使得同一个子集里面没有两个相同的元素。

一个子集的 不兼容性 是该子集里面最大值和最小值的差。

请你返回将数组分成 k 个子集后，各子集 不兼容性 的 和 的 最小值 ，如果无法分成分成 k 个子集，返回 -1 。

子集的定义是数组中一些数字的集合，对数字顺序没有要求。

 两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。
 *
* */
public class code_1681_minimumIncompatibility {
  public static void main(String[] args) {
    code_1681_minimumIncompatibility body = new code_1681_minimumIncompatibility();
    Scanner sc = new Scanner(System.in);

    // 1 2 1 4
    // 2
    int[] nums = getIntArray(sc, " ");

    // 6 3 8 1 3 1 2 2
    // 4
    int k = sc.nextInt();
    System.out.println(body.minimumIncompatibility(nums, k));
  }

  HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();

  public int minimumIncompatibility(int[] nums, int k) {
    Arrays.sort(nums);
    int length = nums.length, subSize = nums.length / k;
    if (length % k != 0) {
      return -1;
    }
    int result = 0;
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < k; j++) {
        ArrayList<Integer> list = map.getOrDefault(j, new ArrayList<>());
        if (list.size() < subSize && !list.contains(nums[i])) {
          list.add(nums[i]);
          map.put(j, list);
          break;
        }
      }
    }
    for (ArrayList<Integer> list : map.values()) {
      result += calcIncompat(list);
    }
    return result;
  }

  public int calcIncompat(ArrayList<Integer> array) {
    int max = array.get(0), min = array.get(0);
    for (int i: array) {
      max = Math.max(max, i);
      min = Math.min(min, i);
    }
    return max - min;
  }
}

