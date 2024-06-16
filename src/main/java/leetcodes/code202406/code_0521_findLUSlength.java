package leetcodes.code202406;

import java.util.Scanner;

/*
*
有 n 个气球，编号为0 到 n - 1，每个气球上都标有一个数字，这些数字存在数组 nums 中。

现在要求你戳破所有的气球。戳破第 i 个气球，你可以获得 nums[i - 1] * nums[i] * nums[i + 1] 枚硬币。
*
* 这里的 i - 1 和 i + 1 代表和 i 相邻的两个气球的序号。如果 i - 1或 i + 1 超出了数组的边界，那么就当它是一个数字为 1 的气球。

求所能获得硬币的最大数量。
*
*
*
* */


public class code_0521_findLUSlength {
  public static void main(String[] args) {
    code_0521_findLUSlength body = new code_0521_findLUSlength();
    Scanner sc = new Scanner(System.in);

    String a = sc.nextLine();
    String b = sc.nextLine();

    System.out.println(body.findLUSlength(a, b));
  }

  public int findLUSlength(String a, String b) {
    return a.equals(b) ? -1 : Math.max(a.length(), b.length());
  }
}

