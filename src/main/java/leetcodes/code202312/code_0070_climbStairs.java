package leetcodes.code202312;

import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

import utils.dto.Node;

/*
*

给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

子数组 是数组中的一个连续部分。
*
*
* */
public class code_0070_climbStairs {
  public static void main(String[] args) {
    code_0070_climbStairs body = new code_0070_climbStairs();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    System.out.println(body.climbStairs(n));
  }

  public int climbStairs(int n) {
    int[] cache = new int[n + 1];
    cache[0] = 1;
    cache[1] = 1;

    for (int i = 2; i <= n; i++) {
      cache[i] = cache[i - 1] + cache[i - 2];
    }
    return cache[n];
  }


}

