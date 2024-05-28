package leetcodes.code202309;


import static utils.arrayUtils.getIntArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
*
打家劫舍 四
*
沿街有一排连续的房屋。每间房屋内都藏有一定的现金。现在有一位小偷计划从这些房屋中窃取现金。

由于相邻的房屋装有相互连通的防盗系统，所以小偷 不会窃取相邻的房屋 。

小偷的 窃取能力 定义为他在窃取过程中能从单间房屋中窃取的 最大金额 。

给你一个整数数组 nums 表示每间房屋存放的现金金额。形式上，从左起第 i 间房屋中放有 nums[i] 美元。

另给你一个整数 k ，表示窃贼将会窃取的 最少 房屋数。小偷总能窃取至少 k 间房屋。

返回小偷的 最小 窃取能力。

* */
public class code_2560_rob {
  public static void main(String[] args) {
    code_2560_rob body = new code_2560_rob();
    Scanner sc = new Scanner(System.in);

    // 99 1 2 3 1 500
    int[] nums = getIntArray(sc, null);

    int k = sc.nextInt();

    System.out.println(body.minCapability(nums, k));
  }

  public int minCapability(int[] nums, int k) {
    int lower = Arrays.stream(nums).min().getAsInt();
    int upper = Arrays.stream(nums).max().getAsInt();
    while (lower <= upper) {
      int middle = (lower + upper) / 2;
      int count = 0;
      boolean visited = false;
      for (int x : nums) {
        if (x <= middle && !visited) {
          count++;
          visited = true;
        } else {
          visited = false;
        }
      }
      if (count >= k) {
        upper = middle - 1;
      } else {
        lower = middle + 1;
      }
    }
    return lower;
  }

}

