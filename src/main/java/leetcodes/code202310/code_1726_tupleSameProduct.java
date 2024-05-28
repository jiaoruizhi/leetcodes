package leetcodes.code202310;

import static utils.arrayUtils.getIntArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
*

给你一个由 不同 正整数组成的数组 nums ，请你返回满足 a * b = c * d 的元组 (a, b, c, d) 的数量。
其中 a、b、c 和 d 都是 nums 中的元素，且 a != b != c != d 。



*
*
* */
public class code_1726_tupleSameProduct {
  public static void main(String[] args) {
    code_1726_tupleSameProduct body = new code_1726_tupleSameProduct();
    Scanner sc = new Scanner(System.in);

    // s
    int[] nums = getIntArray(sc, null);
    System.out.println(body.tupleSameProduct(nums));
  }

  public int tupleSameProduct(int[] nums) {
    int n = nums.length;
    Map<Integer, Integer> cnt = new HashMap<>();
    for (int i = 0; i < n; i++) {
      for(int j = i + 1; j < n; j++) {
        int key = nums[i] * nums[j];
        cnt.put(key, cnt.getOrDefault(key, 0) + 1);
      }
    }
    int ans = 0;
    for (Integer v : cnt.values()) {
      ans += v * (v - 1) * 4;
    }
    return ans;
  }



}

