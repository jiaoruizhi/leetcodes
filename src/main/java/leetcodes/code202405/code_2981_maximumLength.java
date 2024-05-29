package leetcodes.code202405;

import java.util.HashMap;
import java.util.Scanner;

/*
*
给你一个仅由小写英文字母组成的字符串 s 。

如果一个字符串仅由单一字符组成，那么它被称为 特殊 字符串。例如，字符串 "abc" 不是特殊字符串，而字符串 "ddd"、"zz" 和 "f" 是特殊字符串。

返回在 s 中出现 至少三次 的 最长特殊子字符串 的长度，如果不存在出现至少三次的特殊子字符串，则返回 -1 。

子字符串 是字符串中的一个连续 非空 字符序列。
*
* */


public class code_2981_maximumLength {
  public static void main(String[] args) {
    code_2981_maximumLength body = new code_2981_maximumLength();
    Scanner sc = new Scanner(System.in);

    // aaaa
    // aaaaa
    // abcdef
    // abcaba
    String s = sc.nextLine();

    System.out.println(body.maximumLength(s));
  }


  HashMap<Character, HashMap<Integer, Integer>> map = new HashMap<>();
  public int maximumLength(String s) {
    char[] chars = s.toCharArray();
    char last = '0';
    int count = 0;

    for (char current : chars) {
      if (current == last) {
        count++;
      }
      if (current != last) {
        last = current;
        count = 0;
      }
      HashMap<Integer, Integer> mapItem = map.getOrDefault(current, new HashMap<Integer, Integer>());
      for (int i = 1; i <= count + 1; i++) {
        mapItem.put(i, mapItem.getOrDefault(i, 0) + 1);
        map.put(current, mapItem);
      }
    }

    int result = -1;
    for (HashMap<Integer, Integer> mapItem : map.values()) {
      for (int key : mapItem.keySet()) {
        int value = mapItem.getOrDefault(key, -1);
        if (value >= 3) {
          result = Math.max(key, result);
        }
      }
    }

    return result;
  }
}

