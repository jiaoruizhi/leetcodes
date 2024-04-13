package code202404;

import java.util.Scanner;

/*
*
*
给定一种规律 pattern 和一个字符串 s ，判断 s 是否遵循相同的规律。

这里的 遵循 指完全匹配，例如， pattern 里的每个字母和字符串 s 中的每个非空单词之间存在着双向连接的对应规律。
*
*
*
* */
public class code_0290_wordPattern {
  public static void main(String[] args) {
    code_0290_wordPattern body = new code_0290_wordPattern();
    Scanner sc = new Scanner(System.in);

    // abba
    String pattern = sc.nextLine();
    // dog cat cat dog
    String s = sc.nextLine();

    System.out.println(body.wordPattern(pattern, s));
  }

  public boolean wordPattern(String pattern, String s) {
    int n = pattern.length();
    char[] chars = pattern.toCharArray();
    int[] flags = new int[n];
    String[] words = s.split(" ");

    if (chars.length != words.length) {
      return false;
    }

    for (int i = 0; i < n; i++) {
      if (flags[i] == 1) {
        continue;
      }
      flags[i] = 1;

      for (int j = i + 1; j < n; j++) {
        if (chars[i] == chars[j] && !words[i].equals(words[j])) {
          System.out.println(i + " 1");
          return false;
        }
        if (chars[i] != chars[j] && words[i].equals(words[j])) {
          System.out.println(i + " 2");
          return false;
        }
        flags[i] = 1;
      }
    }

    return true;
  }
}
