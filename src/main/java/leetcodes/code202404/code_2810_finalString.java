package leetcodes.code202404;

import java.util.Scanner;
import java.util.Stack;

/*
*

你的笔记本键盘存在故障，每当你在上面输入字符 'i' 时，它会反转你所写的字符串。而输入其他字符则可以正常工作。

给你一个下标从 0 开始的字符串 s ，请你用故障键盘依次输入每个字符。

返回最终笔记本屏幕上输出的字符串。

* */
public class code_2810_finalString {
  public static void main(String[] args) {
    code_2810_finalString body = new code_2810_finalString();
    Scanner sc = new Scanner(System.in);

    String n = sc.nextLine();

    System.out.println(body.finalString(n));
  }

  public String finalString(String s) {
    StringBuilder sb = new StringBuilder();
    int len = s.length();
    for (int i = 0; i < len; i++) {
      char ch = s.charAt(i);
      if (ch == 'i') {
        sb.reverse();
      } else {
        sb.append(ch);
      }
    }
    return sb.toString();
  }
}

