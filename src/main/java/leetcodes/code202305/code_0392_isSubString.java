package leetcodes.code202305;


import java.util.Scanner;

/*
*
给定字符串 s 和 t ，判断 s 是否为 t 的子序列。

字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/is-subsequence
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
* */

public class code_0392_isSubString {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String t = sc.nextLine();

    boolean result = isSubString(s, t);
    System.out.println(result);
  }


  public static boolean isSubString(String s, String t) {

    char[] sList = s.toCharArray();
    char[] tList = t.toCharArray();

    if (sList.length == 0) return true;
    if (tList.length == 0) return false;

    int indexS = 0;
    int indexT = 0;

    boolean result = false;

    while(true) {
      if (sList[indexS] == tList[indexT]) {
        indexS++;
        indexT++;
      } else {
        indexT++;
      }
      if (indexS == sList.length) {
        result = true;
        break;
      }
      if (indexT == tList.length) {
        break;
      }
    }

    return result;
  }
}
