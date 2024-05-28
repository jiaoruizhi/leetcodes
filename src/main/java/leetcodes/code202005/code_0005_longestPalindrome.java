package leetcodes.code202005;

import java.util.*;

/*
 *
 * 给定一个字符串，  输出 最长 回文子串
 *
 * */
public class code_0005_longestPalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String get = sc.nextLine();



    long starttime = new Date().getTime();
    String max = longestPalindrome(get);
    System.out.println(max);
    long endtime = new Date().getTime();
    System.out.println("本程序运行 " + (endtime - starttime) + " 毫秒完成。");
  }


  public static String longestPalindrome(String s) {
    char[] get = s.toCharArray();
    if (get.length <= 1) {
      return s;
    }

    int start = 0;
    int maxlength = 0;
    for (int i = 0; i < get.length; i++) {
      char ch = get[i];
      int now = Math.max(calc(get, i, i), calc(get, i, i + 1));

      if (now > maxlength) {
        start = i - (now - 1) / 2;
        maxlength = now;
      }
    }
    System.out.println("start    " + start + "      " + (maxlength + start));
    return s.substring(start, start + maxlength);
  }


  private static int calc(char[] get, int i, int j) {
    while (i >= 0 && j < get.length && get[i] == get[j]) {
      i--;
      j++;
    }
    return j - i - 1;
  }
}

/*
"babadada"

 */
