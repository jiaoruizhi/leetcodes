package leetcodes.code202404;


import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*
* 给你一个长度为 n 的整数数组 nums，其中 n > 1，返回输出数组 output ，其中 output[i] 等于 nums 中除 nums[i] 之外其余各元素的乘积。



示例:

输入: [1,2,3,4]
输出: [24,12,8,6]



提示：题目数据保证数组之中任意元素的全部前缀元素和后缀（甚至是整个数组）的乘积都在 32 位整数范围内。

说明: 请不要使用除法，且在 O(n) 时间复杂度内完成此题。

进阶：
你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组不被视为额外空间。）

*
*
* */
public class code_0238_productExceptSelf {
  public static void main(String[] args) {
    code_0238_productExceptSelf body = new code_0238_productExceptSelf();
    Scanner sc = new Scanner(System.in);

    // 1 2 0 3 4
    int[] nums = getIntArray(sc, null);
    System.out.println(Arrays.toString(body.productExceptSelf2(nums)));
  }


  public int[] productExceptSelf(int[] nums) {
    int n = nums.length;

    int[] head = new int[n];
    int[] tail = new int[n];

    int left = 1, right = 1;
    for (int i = 0; i < n; i++) {
      int j = n - i - 1;
      head[i] = left * nums[i];
      left = head[i];

      tail[j] = right * nums[j];
      right = tail[j];
    }

    int[] result = new int[n];

    for (int i = 0; i < n; i++) {
      if (i == 0) {
        result[i] = tail[1];
        continue;
      }
      if (i == n - 1) {
        result[i] = head[n - 2];
        continue;
      }
      result[i] = head[i-1] * tail[i+1];
    }
    return result;
  }

  public int[] productExceptSelf2(int[] nums) {
    int length = nums.length;

    int[] answer = new int[length];
    answer[0] = 1;
    for(int i = 1; i < length; i++){
      answer[i] = answer[i - 1] * nums[i - 1];
    }

    int R = 1;
    for(int i = length - 2; i >=0; i--){
      R = nums[i + 1] * R;
      answer[i] = R * answer[i];
    }

    return answer;
  }
}
