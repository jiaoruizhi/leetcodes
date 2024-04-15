package code202404;


/*

https://leetcode.cn/problems/three-steps-problem-lcci/description/

三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，
小孩一次可以上1阶、2阶或3阶。实现一种方法，计算小孩有多少种上楼梯的方式。结果可能很大，你需要对结果模1000000007。
* */
import java.util.Arrays;
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
    long[] cache = new long[n + 1];

    for (int i = 0; i <= n; i++) {
      cache[i] = 1;
    }

    for (int k = 2; k <= 3; k++) {
      for (int i = k; i <= n; i++) {
        long data = 0;
        for (int j = 1; j <= k; j++) {
          data += cache[i - j] % 1000000007;
        }
        cache[i] = data;
      }
      System.out.println(Arrays.toString(cache));
    }
    return (int) (cache[n] % 1000000007);
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
