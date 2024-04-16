package code202404;


/*

https://leetcode.cn/problems/coin-lcci/description/


三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，
小孩一次可以上1阶、2阶或3阶。实现一种方法，计算小孩有多少种上楼梯的方式。结果可能很大，你需要对结果模1000000007。
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
