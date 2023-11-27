package code202311;

import static utils.utils.getIntArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import utils.dto.Node;

/*
*

给你一个整数数组 nums ，返回 nums[i] XOR nums[j] 的最大运算结果，其中 0 ≤ i ≤ j < n 。
*
* */
public class code_0421_findMaximumXOR {
  public static void main(String[] args) {
    code_0421_findMaximumXOR body = new code_0421_findMaximumXOR();
    Scanner sc = new Scanner(System.in);

    // 14,70,53,83,49,91,36,80,92,51,66,70
    int[] nums = getIntArray(sc, ",");

    System.out.println(body.findMaximumXOR(nums));
  }

  static final int HIGH_BIT = 30;

  public int findMaximumXOR(int[] nums) {
    int x = 0;
    for (int k = HIGH_BIT; k >= 0; --k) {
      Set<Integer> seen = new HashSet<Integer>();
      // 将所有的 pre^k(a_j) 放入哈希表中
      for (int num : nums) {
        // 如果只想保留从最高位开始到第 k 个二进制位为止的部分
        // 只需将其右移 k 位
        seen.add(num >> k);
      }

      // 目前 x 包含从最高位开始到第 k+1 个二进制位为止的部分
      // 我们将 x 的第 k 个二进制位置为 1，即为 x = x*2+1
      int xNext = x * 2 + 1;
      boolean found = false;

      // 枚举 i
      for (int num : nums) {
        if (seen.contains(xNext ^ (num >> k))) {
          found = true;
          break;
        }
      }

      if (found) {
        x = xNext;
      } else {
        // 如果没有找到满足等式的 a_i 和 a_j，那么 x 的第 k 个二进制位只能为 0
        // 即为 x = x*2
        x = xNext - 1;
      }
    }
    return x;
  }

}

