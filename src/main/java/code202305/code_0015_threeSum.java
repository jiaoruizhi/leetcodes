package code202305;


import static utils.utils.getIntArray;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
*
给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]]
* 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请

你返回所有和为 0 且不重复的三元组。

注意：答案中不可以包含重复的三元组。
*
*
* */
public class code_0015_threeSum {
  public static void main(String[] args) {
    // 10 15 20
    // -1 0 1 2 -1 -4
    int[] data = getIntArray(new Scanner(System.in), null);
    System.out.println(threeSum(data));
  }


  public static List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);

    List<List<Integer>> result = new ArrayList<>();


    return result;
  }
}
