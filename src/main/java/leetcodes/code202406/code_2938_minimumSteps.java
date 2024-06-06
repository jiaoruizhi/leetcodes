package leetcodes.code202406;

import java.util.Scanner;

/*
*
桌子上有 n 个球，每个球的颜色不是黑色，就是白色。

给你一个长度为 n 、下标从 0 开始的二进制字符串 s，其中 1 和 0 分别代表黑色和白色的球。

在每一步中，你可以选择两个相邻的球并交换它们。

返回「将所有黑色球都移到右侧，所有白色球都移到左侧所需的 最小步数」。
*
*
* */


public class code_2938_minimumSteps {
  public static void main(String[] args) {
    code_2938_minimumSteps body = new code_2938_minimumSteps();
    Scanner sc = new Scanner(System.in);

    // 101
    String s = sc.nextLine();

    System.out.println(body.minimumSteps(s));
  }

  public long minimumSteps(String s) {
    int n = s.length(), size = 0;
    long count = 0;
    for (int i = 0; i < n; i++) {
      int now = s.charAt(i) - '0';
      if (now == 0) {
        count += size;
      } else {
        size++;
      }
    }
    return count;
  }
}

