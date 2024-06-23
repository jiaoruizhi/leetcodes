package leetcodes.code202406;

import java.util.Scanner;

/*
*
我们定义，在以下情况时，单词的大写用法是正确的：

    全部字母都是大写，比如 "USA" 。
    单词中所有字母都不是大写，比如 "leetcode" 。
    如果单词不只含有一个字母，只有首字母大写， 比如 "Google" 。

给你一个字符串 word 。如果大写用法正确，返回 true ；否则，返回 false 。
*
*
* */


public class code_0520_detectCapitalUse {
  public static void main(String[] args) {
    code_0520_detectCapitalUse body = new code_0520_detectCapitalUse();
    Scanner sc = new Scanner(System.in);

    // there are $1 $2 and 5$ candies in the shop
    // 50

    // 1 2 $3 4 $5 $6 7 8$ $9 $10$
    // 100
    String word = sc.nextLine();

    System.out.println(body.detectCapitalUse(word));
  }

  public boolean detectCapitalUse(String word) {
    if (word.length() < 2) {
      return true;
    }
    char[] chars = word.toCharArray();
    int c0 = Character.isLowerCase(chars[0]) ? 0 : 1;
    int flag = Character.isLowerCase(chars[1]) ? 0 : 1;
    if (c0 == 0 && flag == 1) {
      return false;
    }

    for (int i = 1; i < chars.length; i++) {
      int ci = Character.isLowerCase(chars[i]) ? 0 : 1;
      if (ci != flag) {
        return false;
      }
    }

    return true;
  }
}

