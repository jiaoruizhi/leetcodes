package leetcodes.code202404;

import static utils.utils.getIntList;

import java.util.List;
import java.util.Scanner;

/*
*

给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
*
*

* */
public class code_2859_sumIndicesWithKSetBits {
  public static void main(String[] args) {
    code_2859_sumIndicesWithKSetBits body = new code_2859_sumIndicesWithKSetBits();
    Scanner sc = new Scanner(System.in);

    // 5,10,1,5,2
    List<Integer> nums = getIntList(sc, ",");

    // 1
    int k = sc.nextInt();

    System.out.println(body.sumIndicesWithKSetBits(nums, k));
  }

  public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
    int result = 0;

    for (int i = 0 ; i < nums.size(); i++) {
      int value = Integer.bitCount(i);
      if (value == k) {
        result += nums.get(i);
      }
    }
    return result;
  }
}

