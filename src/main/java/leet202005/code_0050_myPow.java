package leet202005;

import java.util.Date;
import java.util.Scanner;

/*
 * 实现 Math.sqrt求根号
 *
 *
 * */


public class code_0050_myPow {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double x = sc.nextDouble();
    int n = sc.nextInt();
    System.out.println("输出结束");

    long startTime = new Date().getTime();

    double ret = myPow(x, n);
    System.out.println(ret);

    long endTime = new Date().getTime();
    System.out.println("本程序运行 " + (endTime - startTime) + " 毫秒完成。");
  }

  private static double myPow(double x, int n) {
    long N = n;
    return N >= 0 ? quick(x, N) : 1.0 / quick(x, -N);

  }

  private static double quick(double x, long n) {
    if (n == 0) {
      return 1.0;
    }
    double t = quick(x, n / 2);
    return n % 2 == 0 ? t * t : t * t * x;
  }


}
