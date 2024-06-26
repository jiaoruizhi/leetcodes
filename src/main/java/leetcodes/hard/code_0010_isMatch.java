package leetcodes.hard;

import java.util.*;

/*
*
* 给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。

'.' 匹配任意单个字符
'*' 匹配零个或多个前面的那一个元素

所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。

说明:

    s 可能为空，且只包含从 a-z 的小写字母。
    p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。

示例 1:

输入:
s = "aa"
p = "a"
输出: false
解释: "a" 无法匹配 "aa" 整个字符串。

示例 2:

输入:
s = "aa"
p = "a*"
输出: true
解释: 因为 '*' 代表可以匹配零个或多个前面的那一个元素, 在这里前面的元素就是 'a'。因此，字符串 "aa" 可被视为 'a' 重复了一次。

示例 3:

输入:
s = "ab"
p = ".*"
输出: true
解释: ".*" 表示可匹配零个或多个（'*'）任意字符（'.'）。

示例 4:

输入:
s = "aab"
p = "c*a*b"
输出: true
解释: 因为 '*' 表示零个或多个，这里 'c' 为 0 个, 'a' 被重复一次。因此可以匹配字符串 "aab"。

示例 5:

输入:
s = "mississippi"
p = "mis*is*p*."
输出: false

* */
public class code_0010_isMatch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String p = sc.nextLine();
    //boolean ret = isMatch1(s,p);
    boolean ret1 = isMatch2(s, p);
    System.out.println(ret1);

  }

  public static boolean isMatch1(String s, String p) {
    if (p.isEmpty()) {
      return s.isEmpty();
    }
    boolean first_match = (!s.isEmpty() && (p.charAt(0) == s.charAt(0) || p.charAt(0) == '.'));

    if (p.length() >= 2 && p.charAt(1) == '*') {
      return (isMatch1(s, p.substring(2)) || (first_match && isMatch1(s.substring(1), p)));
    } else {
      return first_match && isMatch1(s.substring(1), p.substring(1));
    }
  }


  enum Result {
    TRUE, FALSE
  }


  static Result[][] memo;

  public static boolean isMatch(String text, String pattern) {
    memo = new Result[text.length() + 1][pattern.length() + 1];
    return dp(0, 0, text, pattern);
  }

  public static boolean dp(int i, int j, String text, String pattern) {
    if (memo[i][j] != null) {
      return memo[i][j] == Result.TRUE;
    }
    boolean ans;
    if (j == pattern.length()) {
      ans = i == text.length();
    } else {
      boolean first_match = (i < text.length() && (pattern.charAt(j) == text.charAt(i) || pattern.charAt(j) == '.'));

      if (j + 1 < pattern.length() && pattern.charAt(j + 1) == '*') {
        ans = (dp(i, j + 2, text, pattern) || first_match && dp(i + 1, j, text, pattern));
      } else {
        ans = first_match && dp(i + 1, j + 1, text, pattern);
      }
    }
    memo[i][j] = ans ? Result.TRUE : Result.FALSE;
    System.out.println("i  " + i + "   j    " + j + "   memo[i][j]=  " + memo[i][j]);

    return ans;
  }



  public static boolean isMatch2(String s, String p) {
    int sLen = s.length(), pLen = p.length();
    boolean[][] memory = new boolean[sLen + 1][pLen + 1];
    memory[0][0] = true;
    for (int i = 0; i <= sLen; i++) {
      for (int j = 1; j <= pLen; j++) {
        if (p.charAt(j - 1) == '*') {
          memory[i][j] =
            memory[i][j - 2] || (i > 0 && (s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.') && memory[i
              - 1][j]);
        } else {
          memory[i][j] =
            i > 0 && (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '.') && memory[i - 1][j - 1];
        }
      }
    }

    return memory[sLen][pLen];
  }
}





/*
mississippi
m*is*is*ip*.


 */
