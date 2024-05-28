package leetcodes.code202305;


import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/*
*


只要 nums 不是 空数组，你就重复执行以下步骤：

    找到 nums 中的最小值，并删除它。
    找到 nums 中的最大值，并删除它。
    计算删除两数的平均值。

两数 a 和 b 的 平均值 为 (a + b) / 2 。

    比方说，2 和 3 的平均值是 (2 + 3) / 2 = 2.5 。

返回上述过程能得到的 不同 平均值的数目。

注意 ，如果最小值或者最大值有重复元素，可以删除任意一个。

*
*
* */
public class code_2465_avgNum {
  public static void main(String[] args) {
    //
    // 1,2,3
    // 9,5,7,8,7,9,8,2,0,7
    Scanner sc = new Scanner(System.in);
    int[] data = getIntArray(sc, ",");
    System.out.println(distinctAverages(data));
  }


  // int[] time, int totalTrips
  public static long distinctAverages(int[] nums) {
    Arrays.sort(nums);

    HashSet<Integer> set = new HashSet<>();
    int left = 0;
    int right = nums.length - 1;
    while (left < right) {
      set.add(nums[left] + nums[right]);
      left++;
      right--;
    }
    return set.size();
  }
}
