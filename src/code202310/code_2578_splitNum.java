package code202310;


import java.util.Arrays;
import java.util.Scanner;

/*
*
给你一个正整数 num ，请你将它分割成两个非负整数 num1 和 num2 ，满足：

    num1 和 num2 直接连起来，得到 num 各数位的一个排列。
        换句话说，num1 和 num2 中所有数字出现的次数之和等于 num 中所有数字出现的次数。
    num1 和 num2 可以包含前导 0 。

请你返回 num1 和 num2 可以得到的和的 最小 值。

注意：

    num 保证没有前导 0 。
    num1 和 num2 中数位顺序可以与 num 中数位顺序不同。

* */
public class code_2578_splitNum {
  public static void main(String[] args) {
    code_2578_splitNum body = new code_2578_splitNum();


    Scanner sc = new Scanner(System.in);
    // ()[]{}
    int num = sc.nextInt();

    System.out.println(body.splitNum(num));
  }


  public int splitNum(int num) {
    String s = String.valueOf(num);
    char[] chars = s.toCharArray();
    Arrays.sort(chars);

    boolean flag = true;
    StringBuilder sb1 = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();

    for (char ch : chars) {
      if (flag) {
        sb1.append(ch);
      } else {
        sb2.append(ch);
      }
      flag = !flag;
    }
    String a = sb1.toString();
    String b = sb2.toString();

    int aa = Integer.valueOf(a);
    int bb = Integer.valueOf(b);

    return aa + bb;
  }
}

