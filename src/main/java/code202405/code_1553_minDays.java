package code202405;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
*
厨房里总共有 n 个橘子，你决定每一天选择如下方式之一吃这些橘子：

    吃掉一个橘子。
    如果剩余橘子数 n 能被 2 整除，那么你可以吃掉 n/2 个橘子。
    如果剩余橘子数 n 能被 3 整除，那么你可以吃掉 2*(n/3) 个橘子。

每天你只能从以上 3 种方案中选择一种方案。

请你返回吃掉所有 n 个橘子的最少天数。
*
*
* */
public class code_1553_minDays {
  public static void main(String[] args) {
    code_1553_minDays body = new code_1553_minDays();
    Scanner sc = new Scanner(System.in);

    // 0
    int n = sc.nextInt();

    // 2 2 2 2 2
    // 8

    System.out.println(body.minDays(n));
  }

    private final Map<Integer, Integer> memo = new HashMap<>();

    public int minDays(int n) {
      if (n <= 1) {
        return n;
      }
      Integer res = memo.get(n);
      if (res != null) { // 之前计算过
        return res;
      }
      res = Math.min(minDays(n / 2) + n % 2, minDays(n / 3) + n % 3) + 1;
      memo.put(n, res); // 记忆化
      return res;
    }

}

