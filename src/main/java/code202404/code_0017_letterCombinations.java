package code202404;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
*

给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
*
*

* */
public class code_0017_letterCombinations {
  public static void main(String[] args) {
    code_0017_letterCombinations body = new code_0017_letterCombinations();
    Scanner sc = new Scanner(System.in);


    //      23
    String digits = sc.nextLine();


    System.out.println(body.letterCombinations(digits));
  }

  List<String> result = new ArrayList<>();
  String[] phone = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
  public List<String> letterCombinations(String digits) {
    char[] chars = digits.toCharArray();
    int length = digits.length();
    if (length == 0 ) {
      return result;
    }
    dfs("", chars, 0);
    return result;
  }

  public void dfs(String s, char[] chars, int level) {
    if (level == chars.length) {
      result.add(s);
      return;
    }
    char charactor = chars[level];
    char[] charList = phone[charactor - '2'].toCharArray();
    for (char item : charList) {
      String s1 = new StringBuilder(s).append(item).toString();
      dfs(s1, chars, level + 1);
    }
  }
}

