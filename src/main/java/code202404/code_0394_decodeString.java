package code202404;



import java.util.Scanner;

/*
*
* 给定一个经过编码的字符串，返回它解码后的字符串。

编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。

你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。

此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像 3a 或 2[4] 的输入。

示例:

s = "3[a]2[bc]", 返回 "aaabcbc".
s = "3[a2[c]]", 返回 "accaccacc".
s = "2[abc]3[cd]ef", 返回 "abcabccdcdcdef".


*
*
*
* */
public class code_0394_decodeString {
  public static void main(String[] args) {
    code_0394_decodeString body = new code_0394_decodeString();
    Scanner sc = new Scanner(System.in);

    // 3[a]2[bc]
    // 3[a2[c]]
    // 2[abc]30[c10[d]]ef
    // 100[leetcode]
    // 3[z]2[2[y]pq4[2[jk]e1[f]]]ef
    // 2[2[y]pq4[2[jk]e1[f]]]
    String s = sc.nextLine();
    System.out.println(body.decodeString(s));
  }

  int index = 0;

  public String decodeString(String s) {
    char[] chars = s.toCharArray();
    StringBuilder sb = new StringBuilder();

    while (index < chars.length) {
      if (Character.isDigit(chars[index])) {
        int count = getCount(chars);
        sb.append(getSubStr(chars, count));
      } else {
        sb.append(chars[index]);
        index++;
      }
    }

    return sb.toString();
  }

  public String getSubStr(char[] chars, int count) {
    StringBuilder cache = new StringBuilder();
    StringBuilder sb = new StringBuilder();

    while (index < chars.length && chars[index] != ']') {
      if (chars[index] == '[') {
        index++;
      }
      while (index < chars.length && Character.isLetter(chars[index])) {
        cache.append(chars[index]);
        index++;
      }
      if (index < chars.length && Character.isDigit(chars[index])) {
        int subCount = getCount(chars);
        cache.append(getSubStr(chars, subCount));
      }
    }
    index++;

    System.out.println("count: " + count);
    System.out.println("cache: " + cache);
    for (int i = 0; i < count; i++) {
      sb.append(cache);
    }
    return sb.toString();
  }

  public int getCount(char[] chars) {
    int count = 0;
    while (Character.isDigit(chars[index])) {
      count = count * 10 + (chars[index] - '0');
      index++;
    }
    return count;
  }

  // flag
  // 0 初始
  // 1 开始计数
  // 2 开始加char
  String src;
  int ptr;

  public String decodeString2(String s) {
    src = s;
    ptr = 0;
    return getString2();
  }

  public String getString2() {
    if (ptr == src.length() || src.charAt(ptr) == ']') {
      // String -> EPS
      return "";
    }

    char cur = src.charAt(ptr);
    int repTime = 1;
    String ret = "";

    if (Character.isDigit(cur)) {
      // String -> Digits [ String ] String
      // 解析 Digits
      repTime = getDigits();
      // 过滤左括号
      ++ptr;
      // 解析 String
      String str = getString2();
      // 过滤右括号
      ++ptr;
      // 构造字符串
      while (repTime-- > 0) {
        ret += str;
      }
    } else if (Character.isLetter(cur)) {
      // String -> Char String
      // 解析 Char
      ret = String.valueOf(src.charAt(ptr++));
    }

    return ret + getString2();
  }

  public int getDigits() {
    int ret = 0;
    while (ptr < src.length() && Character.isDigit(src.charAt(ptr))) {
      ret = ret * 10 + src.charAt(ptr++) - '0';
    }
    return ret;
  }
}
