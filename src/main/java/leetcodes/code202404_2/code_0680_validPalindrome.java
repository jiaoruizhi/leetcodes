package leetcodes.code202404_2;


import java.util.Scanner;

/*
*
*
* 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。

示例 1:

输入: "aba"
输出: True

示例 2:

输入: "abca"
输出: True
解释: 你可以删除c字符。


*
* */
public class code_0680_validPalindrome {
  public static void main(String[] args) {
    code_0680_validPalindrome body = new code_0680_validPalindrome();
    Scanner sc = new Scanner(System.in);

    // aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga
    String s = sc.nextLine();
    System.out.println(body.validPalindrome(s));
  }

  public boolean validPalindrome(String s) {
    return valid(s.toCharArray(), 0, s.length() - 1, true);
  }

  public boolean valid(char[] array, int left, int right, boolean flag) {
    while (left <= right) {
      if (array[left] == array[right]) {
        left++;
        right--;
        continue;
      }
      if (!flag) {
        return false;
      }
      return valid(array, left + 1, right, false) || valid(array, left, right - 1, false);
    }
    return true;
  }
}
