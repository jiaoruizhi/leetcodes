package leetcodes.code202404_2;


import java.util.Scanner;

/*
*
给你一个整数 n ，以二进制字符串的形式返回该整数的 负二进制（base -2）表示。

注意，除非字符串就是 "0"，否则返回的字符串中不能含有前导零。
*
* */
public class code_1017_baseNeg2 {
  public static void main(String[] args) {
    code_1017_baseNeg2 body = new code_1017_baseNeg2();
    Scanner sc = new Scanner(System.in);

    // 10
    int n = sc.nextInt();

    // 10
    int k = sc.nextInt();

    System.out.println(body.exchange(n, k));
  }

  public String baseNeg2(int n) {
    return exchange(n, -2);
  }

  public String exchange(int n, int k) {
    if (n == 0) {
      return "0";
    }

    StringBuilder sb = new StringBuilder();
    while (n != 0) {
      System.out.println(n);
      int rest = n % k;
      if (rest < 0) {
        rest -= k;
      }
      n -= rest;

      if (rest >= 10) {
        char c = (char) ('A' + (rest - 10));
        sb.append(c);
      } else {
        sb.append(rest);
      }
      n /= k;
    }
    sb.reverse();
    return sb.toString();
  }
}

