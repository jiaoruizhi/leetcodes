package code202310;

import static utils.utils.getIntArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
*

给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现三次。找出那个只出现了一次的元素。

你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
* */
public class code_0137_singleNumber {
  public static void main(String[] args) {
    code_0137_singleNumber body = new code_0137_singleNumber();
    Scanner sc = new Scanner(System.in);


    // 2 1 2 1 4
    int[] nums = getIntArray(sc, null);


    System.out.println(body.singleNumber(nums));
  }

  public int singleNumber(int[] nums) {
    Map<Integer, Integer> freq = new HashMap<Integer, Integer>();
    for (int num : nums) {
      freq.put(num, freq.getOrDefault(num, 0) + 1);
    }
    int ans = 0;
    for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
      int num = entry.getKey(), occ = entry.getValue();
      if (occ == 1) {
        ans = num;
        break;
      }
    }
    return ans;
  }

}

