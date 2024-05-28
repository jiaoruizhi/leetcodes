package leetcodes.hard;


import java.util.Scanner;

/*
*
* 给你一个字符串 S、一个字符串 T，请在字符串 S 里面找出：包含 T 所有字符的最小子串。

示例：

输入: S = "ADOBECODEBANC", T = "ABC"
输出: "BANC"

*
*
* */
public class code_0076_minWindow {
  public static void main(String[] args) {
    code_0076_minWindow body = new code_0076_minWindow();

    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();

    String min = body.minWindow(s, t);
    System.out.println(min);
  }


  public String minWindow(String s, String t) {

    char[] sChars = s.toCharArray();


    return "";
  }
}
