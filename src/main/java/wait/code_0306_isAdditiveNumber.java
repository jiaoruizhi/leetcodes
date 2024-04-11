package wait;

import java.util.Scanner;

/*
*
累加数 是一个字符串，组成它的数字可以形成累加序列。

一个有效的 累加序列 必须 至少 包含 3 个数。除了最开始的两个数以外，序列中的每个后续数字必须是它之前两个数字之和。

给你一个只包含数字 '0'-'9' 的字符串，编写一个算法来判断给定输入是否是 累加数 。如果是，返回 true ；否则，返回 false 。

说明：累加序列里的数，除数字 0 之外，不会 以 0 开头，所以不会出现 1, 2, 03 或者 1, 02, 3 的情况。

* */
public class code_0306_isAdditiveNumber {
  public static void main(String[] args) {
    code_0306_isAdditiveNumber body = new code_0306_isAdditiveNumber();
    Scanner sc = new Scanner(System.in);

    String n = sc.nextLine();
    System.out.println(body.isAdditiveNumber(n));
  }

  public boolean isAdditiveNumber(String str) {
    System.out.println(str);
    return false;
  }

}

