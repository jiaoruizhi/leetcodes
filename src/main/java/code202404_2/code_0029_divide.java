package code202404_2;


/*
给你两个整数，被除数 dividend 和除数 divisor。将两数相除，要求 不使用 乘法、除法和取余运算。

整数除法应该向零截断，也就是截去（truncate）其小数部分。例如，8.345 将被截断为 8 ，-2.7335 将被截断至 -2 。

返回被除数 dividend 除以除数 divisor 得到的 商 。

注意：假设我们的环境只能存储 32 位 有符号整数，其数值范围是 [−231,  231 − 1] 。
本题中，如果商 严格大于 231 − 1 ，则返回 231 − 1 ；如果商 严格小于 -231 ，则返回 -231 。
*
*
* */
import java.util.Scanner;

public class code_0029_divide {
  public static void main(String[] args) {
    code_0029_divide body = new code_0029_divide();
    Scanner sc = new Scanner(System.in);

    // 16 2
    // -2147483648 -1
    int dividend = sc.nextInt();
    int divisor = sc.nextInt();

    int result = body.divide(dividend, divisor);
    System.out.println(result);
  }

  public int divide(int a, int b) {
    long x = a, y = b;
    boolean isNeg = false;
    if ((x > 0 && y < 0) || (x < 0 && y > 0)) isNeg = true;
    if (x < 0) x = -x;
    if (y < 0) y = -y;
    long l = 0, r = x;
    while (l < r) {
      long mid = l + r + 1 >> 1;
      if (mul(mid, y) <= x) {
        l = mid;
      } else {
        r = mid - 1;
      }
    }
    long ans = isNeg ? -l : l;
    if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) return Integer.MAX_VALUE;
    return (int)ans;
  }

  long mul(long a, long k) {
    long ans = 0;
    while (k > 0) {
      if ((k & 1) == 1) ans += a;
      k >>= 1;
      a += a;
    }
    return ans;
  }
}
