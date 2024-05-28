package leetcodes.code202404;

import java.util.Scanner;

/*
*

给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
*
*

* */
public class code_0028_strStr {
  public static void main(String[] args) {
    code_0028_strStr body = new code_0028_strStr();
    Scanner sc = new Scanner(System.in);


//    mississippi
//      issipi
    String haystack = sc.nextLine();
    String needle = sc.nextLine();


    System.out.println(body.strStr(haystack, needle));
  }

  public int strStr(String haystack, String needle) {
    int result = -1;
    if (haystack.length() < needle.length()) return -1;

    char[] sList = haystack.toCharArray();
    char[] tList = needle.toCharArray();


    for (int i = 0; i < sList.length; i++) {
      int current = i;
      for (int k = 0; k < tList.length; k++) {
        if (i + k >= sList.length || sList[i + k] != tList[k]) {
          current = -1;
          break;
        }
      }
      if (current != -1) {
        result = current;
        break;
      }
    }
    return result;
  }
}

