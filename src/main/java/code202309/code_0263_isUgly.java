package code202309;


import java.util.Scanner;

/*
*
丑数 就是只包含质因数 2、3 和 5 的正整数。

给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。

* */
public class code_0263_isUgly {
  public static void main(String[] args) {
    code_0263_isUgly body = new code_0263_isUgly();


    Scanner sc = new Scanner(System.in);
    // 4
    int n = sc.nextInt();

    System.out.println(body.isUgly(n));
  }

  public boolean isUgly(int n) {
    int cache = n;
    if (cache == 0)
      return false;
    while (cache % 2 == 0) {
      cache /= 2;
    }
    while (cache % 3 == 0) {
      cache /= 3;
    }
    while (cache % 5 == 0) {
      cache /= 5;
    }
    return cache == 1;
  }
}

