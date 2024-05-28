package leetcodes.code202404;

import java.util.Scanner;

/*
*

给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
*
*

* */
public class code_0258_addDigits {
  public static void main(String[] args) {
    code_0258_addDigits body = new code_0258_addDigits();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();


    System.out.println(body.addDigits(n));
  }

  public int addDigits(int num) {
    if (num == 0) {
      return 0;
    }
    if (num % 9 == 0) {
      return 9;
    }
    return num % 9;
  }

}

