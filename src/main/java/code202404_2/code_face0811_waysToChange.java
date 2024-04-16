package code202404_2;


/*

https://leetcode.cn/problems/coin-lcci/description/

硬币。给定数量不限的硬币，币值为25分、10分、5分和1分，编写代码计算n分有几种表示法。(结果可能会很大，你需要将结果模上1000000007)


* */
import java.util.Scanner;

public class code_face0811_waysToChange {
  public static void main(String[] args) {
    code_face0811_waysToChange body = new code_face0811_waysToChange();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int result = body.waysToChange(n);

    System.out.println(result);
  }

  public int waysToChange(int n) {
    long[] cache = new long[n + 1];
    cache[0] = 1;
    int[] coins = new int[]{ 1, 5, 10, 25 };
    for (int coin : coins) {
      for (int i = coin; i <= n; i++) {
        cache[i] = (cache[i] + cache[i - coin]) % 1000000007;
      }
    }
    return (int) cache[n];
  }

}
