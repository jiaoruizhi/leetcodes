package code202305;


import static utils.utils.getIntArray;

import java.util.Scanner;

/*
*
给你一个整数数组 cost ，其中 cost[i] 是从楼梯第 i 个台阶向上爬需要支付的费用。一旦你支付此费用，即可选择向上爬一个或者两个台阶。

你可以选择从下标为 0 或下标为 1 的台阶开始爬楼梯。

请你计算并返回达到楼梯顶部的最低花费。



示例 1：

输入：cost = [10,15,20]
输出：15
解释：你将从下标为 1 的台阶开始。
- 支付 15 ，向上爬两个台阶，到达楼梯顶部。
总花费为 15 。

示例 2：

输入：cost = [1,100,1,1,1,100,1,1,100,1]
输出：6
解释：你将从下标为 0 的台阶开始。
- 支付 1 ，向上爬两个台阶，到达下标为 2 的台阶。
- 支付 1 ，向上爬两个台阶，到达下标为 4 的台阶。
- 支付 1 ，向上爬两个台阶，到达下标为 6 的台阶。
- 支付 1 ，向上爬一个台阶，到达下标为 7 的台阶。
- 支付 1 ，向上爬两个台阶，到达下标为 9 的台阶。
- 支付 1 ，向上爬一个台阶，到达楼梯顶部。
总花费为 6 。

*
*
* */
public class code_0746_minCostClimb {
  public static void main(String[] args) {
    // 10 15 20
    // 1 100 1 1 1 100 1 1 100 1
    int[] data = getIntArray(new Scanner(System.in), null);
    System.out.println(minCost(data));
  }


  public static int minCost(int[] data) {
    int top = data.length;
    int[] cache = new int[top + 1];

    cache[0] = cache[1] = 0;

    for (int i = 2; i <= top; i++) {
      cache[i] = Math.min(cache[i - 1] + data[i - 1], cache[i - 2] + data[i - 2]);
    }
    return cache[top];

  }
}
