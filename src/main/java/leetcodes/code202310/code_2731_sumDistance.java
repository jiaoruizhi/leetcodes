package leetcodes.code202310;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*

有一些机器人分布在一条无限长的数轴上，他们初始坐标用一个下标从 0 开始的整数数组 nums 表示。当你给机器人下达命令时，它们以每秒钟一单位的速度开始移动。

给你一个字符串 s ，每个字符按顺序分别表示每个机器人移动的方向。'L' 表示机器人往左或者数轴的负方向移动，'R' 表示机器人往右或者数轴的正方向移动。

当两个机器人相撞时，它们开始沿着原本相反的方向移动。

请你返回指令重复执行 d 秒后，所有机器人之间两两距离之和。由于答案可能很大，请你将答案对 109 + 7 取余后返回。
* */
public class code_2731_sumDistance {
  public static void main(String[] args) {
    code_2731_sumDistance body = new code_2731_sumDistance();
    Scanner sc = new Scanner(System.in);


    // nums = [-2,0,2], s = "RLL", d = 3
    // -2 0 2
    // RLL
    // 3
    int[] nums = getIntArray(sc, null);

    String s = sc.nextLine();

    int d = sc.nextInt();


    System.out.println(body.sumDistance(nums, s, d));
  }

  public int sumDistance(int[] nums, String s, int d) {
    final long MOD = (long) 1e9 + 7;
    int length = nums.length;
    int[] next = new int[length];

    char[] chars = s.toCharArray();

    for (int i = 0; i < length; i++) {
      int now = nums[i];
      int n = chars[i] == 'R' ? now + d : now - d;
      next[i] = n;
    }
    Arrays.sort(next);


    long result = (long) (next[length - 1] - next[0]) * (length - 1);
    return (int) (result % MOD);
  }

}

