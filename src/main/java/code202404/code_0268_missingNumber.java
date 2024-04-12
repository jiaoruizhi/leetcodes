package code202404;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*
给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
*
* */
public class code_0268_missingNumber {
  public static void main(String[] args) {
    code_0268_missingNumber body = new code_0268_missingNumber();
    Scanner sc = new Scanner(System.in);

    // 9,6,4,2,3,5,7,0,1
    int[] nums = getIntArray(sc, ",");

    System.out.println(body.missingNumber(nums));
  }

  public int missingNumber(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    for (int i = 0; i < n; i++) {
      if (i < nums[i])
        return i;
    }
    return n;
  }

  public int missingNumber2(int[] nums) {
    int n = 0;
    for(int i = 0;i < nums.length;i++){
      n^=nums[i];
    }
    for(int i = 0; i<= nums.length;i++){
      n^=i;
    }
    return n;
  }

}

