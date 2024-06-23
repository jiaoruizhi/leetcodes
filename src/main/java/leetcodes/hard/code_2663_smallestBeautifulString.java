package leetcodes.hard;

import java.util.Scanner;

/*
*
如果一个字符串满足以下条件，则称其为 美丽字符串 ：

    它由英语小写字母表的前 k 个字母组成。
    它不包含任何长度为 2 或更长的回文子字符串。

给你一个长度为 n 的美丽字符串 s 和一个正整数 k 。

请你找出并返回一个长度为 n 的美丽字符串，该字符串还满足：在字典序大于 s 的所有美丽字符串中字典序最小。
* 如果不存在这样的字符串，则返回一个空字符串。

对于长度相同的两个字符串 a 和 b ，如果字符串 a 在与字符串 b 不同的第一个位置上的字符字典序更大，则字符串 a 的字典序大于字符串 b 。

    例如，"abcd" 的字典序比 "abcc" 更大，因为在不同的第一个位置（第四个字符）上 d 的字典序大于 c 。

*
*
*
* */


public class code_2663_smallestBeautifulString {
  public static void main(String[] args) {
    code_2663_smallestBeautifulString body = new code_2663_smallestBeautifulString();
    Scanner sc = new Scanner(System.in);

    // there are $1 $2 and 5$ candies in the shop
    // 50

    // 1 2 $3 4 $5 $6 7 8$ $9 $10$
    // 100
    String sentence = sc.nextLine();
    int discount = sc.nextInt();

    System.out.println(body.smallestBeautifulString(sentence, discount));
  }

  public String smallestBeautifulString(String S, int k) {
    k += 'a';
    char[] s = S.toCharArray();
    int n = s.length;
    int i = n - 1; // 从最后一个字母开始
    s[i]++; // 先加一

    while (i < n) {
      if (s[i] == k) { // 需要进位
        if (i == 0) { // 无法进位
          return "";
        }
        // 进位
        s[i] = 'a';
        s[--i]++;
      } else if (i > 0 && s[i] == s[i - 1] || i > 1 && s[i] == s[i - 2]) {
        s[i]++; // 如果 s[i] 和左侧的字符形成回文串，就继续增加 s[i]
      } else {
        i++; // 反过来检查后面是否有回文串
      }
    }
    return new String(s);
  }
}

