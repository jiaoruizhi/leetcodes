package leetcodes.code202404;


/*

https://leetcode.cn/problems/three-steps-problem-lcci/description/

三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，
小孩一次可以上1阶、2阶或3阶。实现一种方法，计算小孩有多少种上楼梯的方式。结果可能很大，你需要对结果模1000000007。
* */
import java.util.Scanner;

public class code_face0801_waysToStep {
  public static void main(String[] args) {
    code_face0801_waysToStep body = new code_face0801_waysToStep();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int result = body.waysToStep(n);

    System.out.println(result);
  }

  public int waysToStep(int n) {
    if (n <= 2) {
      return n;
    }
    long[] cache = new long[n + 1];

    cache[0] = 1;
    cache[1] = 1;
    cache[2] = 2;

    for (int i = 3; i <= n; i++) {
      cache[i] = (cache[i - 1] + cache[i -2] + cache[i-3]) % 1000000007;
    }
    return (int) cache[n];
  }

  public int waysToStep2(int n) {
    if (n <= 2) {
      return n;
    }
    int one = 1, two = 1, three = 2;
    int now = 0;
    for (int i = 3; i <= n; i++) {
      now = (one + two) % 1000000007;
      now = (now + three) % 1000000007;
      one = two;
      two = three;
      three = now;
    }
    return now;
  }

}
