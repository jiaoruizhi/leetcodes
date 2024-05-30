package leetcodes.code202405;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
*
给你一个仅由小写英文字母组成的字符串 s 。

如果一个字符串仅由单一字符组成，那么它被称为 特殊 字符串。例如，字符串 "abc" 不是特殊字符串，而字符串 "ddd"、"zz" 和 "f" 是特殊字符串。

返回在 s 中出现 至少三次 的 最长特殊子字符串 的长度，如果不存在出现至少三次的特殊子字符串，则返回 -1 。

子字符串 是字符串中的一个连续 非空 字符序列。
*
* */


public class code_2982_maximumLength {
  public static void main(String[] args) {
    code_2982_maximumLength body = new code_2982_maximumLength();
    Scanner sc = new Scanner(System.in);

    // aaaa
    // aaaaa
    // abcdef
    // abcaba
    String s = sc.nextLine();

    System.out.println(body.maximumLength(s));
  }

  public int maximumLength(String S) {
    char[] s = S.toCharArray();
    List<Integer>[] groups = new ArrayList[26];
    Arrays.setAll(groups, i -> new ArrayList<>());
    int cnt = 0;
    for (int i = 0; i < s.length; i++) {
      cnt++;
      if (i + 1 == s.length || s[i] != s[i + 1]) {
        groups[s[i] - 'a'].add(cnt); // 统计连续字符长度
        cnt = 0;
      }
    }

    int ans = 0;
    for (List<Integer> a : groups) {
      if (a.isEmpty()) {
        continue;
      }
      a.sort(Collections.reverseOrder());
      a.add(0);
      a.add(0); // 假设还有两个空串
      ans = Math.max(ans, Math.max(a.get(0) - 2, Math.max(Math.min(a.get(0) - 1, a.get(1)), a.get(2))));
    }

    return ans > 0 ? ans : -1;
  }
}

