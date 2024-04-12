package code202310;

import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*

给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
* */
public class code_0136_singleNumber {
  public static void main(String[] args) {
    code_0136_singleNumber body = new code_0136_singleNumber();
    Scanner sc = new Scanner(System.in);


    // 2 1 2 1 4
    int[] nums = getIntArray(sc, null);


    System.out.println(body.singleNumber(nums));
  }

  public int singleNumber(int[] nums) {
    int single = 0;
    for (int num : nums) {
      single ^= num;
    }
    return single;
  }

}

