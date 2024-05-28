package leetcodes.code202404;

import java.util.Arrays;
import java.util.Scanner;

/*
*

给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
*
*

* */
public class code_2549_distinctIntegers {
  public static void main(String[] args) {
    code_2549_distinctIntegers body = new code_2549_distinctIntegers();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    System.out.println(body.distinctIntegers(n));
  }

  public int distinctIntegers(int n) {
    int[] array = new int[n + 1];
    array[n] = 1;

    while (true) {
      boolean shouldExist = true;

      for (int i = 1; i < n; i++) {
        if (array[i] == 1)
          continue;
        for (int j = 1; j <= n; j++) {
          if (array[j] == 1 && j % i == 1) {
            array[i] = 1;
            shouldExist = false;
          }
        }
      }
      if (shouldExist)
        break;
    }
    return Arrays.stream(array).sum();
  }

  public int distinctIntegers2(int n) {
    if (n < 3) {
      return 1;
    }
    return n - 1;
  }
}

