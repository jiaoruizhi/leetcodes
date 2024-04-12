package code202310;

import java.util.Arrays;
import java.util.Scanner;

/*
*

给你一个由 不同 正整数组成的数组 nums ，请你返回满足 a * b = c * d 的元组 (a, b, c, d) 的数量。
其中 a、b、c 和 d 都是 nums 中的元素，且 a != b != c != d 。



*
*
* */
public class code_2520_countDigits {
  public static void main(String[] args) {
    code_2520_countDigits body = new code_2520_countDigits();
    Scanner sc = new Scanner(System.in);

    // s
    int num = sc.nextInt();
    System.out.println(body.countDigits(num));
  }

  public int countDigits(int num) {
    char[] chars = String.valueOf(num).toCharArray();
    Arrays.sort(chars);

    int result = 0;

    for (char ch : chars) {
      int now = ch - '0';
      if (num % now == 0) {
        result++;
      }
    }
    return result;
  }



}

