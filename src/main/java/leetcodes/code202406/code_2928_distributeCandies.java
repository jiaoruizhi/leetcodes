package leetcodes.code202406;

import java.util.Scanner;

/*
*
给你两个正整数 n 和 limit 。

请你将 n 颗糖果分给 3 位小朋友，确保没有任何小朋友得到超过 limit 颗糖果，请你返回满足此条件下的 总方案数 。
* */


public class code_2928_distributeCandies {
  public static void main(String[] args) {
    code_2928_distributeCandies body = new code_2928_distributeCandies();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int limit = sc.nextInt();

    System.out.println(body.distributeCandies(n, limit));
  }

  public int distributeCandies(int n, int limit) {
    int result = 0;

    for (int i = 0; i <= limit; i++) {
      int rest = n - i;
      for (int j = 0; j <= limit; j++) {
        int now = rest - j;
        if (now <= limit && now >= 0) {
          result++;
        }
      }
    }
    return result;
  }
}

