package meeting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
*

3 输入一个没有重复字符的字符串，
* 打印出该字符串中所有字符的排列。如输入abc，则打印出a、b、c所能排列
*
* 出来的所有字符串abc, acb, bac, bca, cab, cba。用Java/JS/TS/C++语言写一个函数实现。
要求：
(1)命名一个合适的函数名称，实现完整的函数
(2)仅用一个函数实现，不要出现调用子函数
(3) 按照你平时的编程习惯，在你认为需要注释处写上相应的注释

*
*
* */
public class meeting_20231018_3 {
  public static void main(String[] args) {
    meeting_20231018_3 body = new meeting_20231018_3();
    Scanner sc = new Scanner(System.in);

    // s
    String s = sc.nextLine();
    System.out.println(body.permute(s));
  }

  public List<String> permute(String s) {
    char[] chars = s.toCharArray();

    List<String> res = new ArrayList<>();
    List<Character> output = new ArrayList<>();
    for (char ch : chars) {
      output.add(ch);
    }

    int n = chars.length;
    backtrack(n, output, res, 0);
    return res;
  }

  public void backtrack( //
    int n, //
    List<Character> output, //
    List<String> res, //
    int first //
  ) {
    // 所有数都填完了
    if (first == n) {
      StringBuilder sb = new StringBuilder();
      for (Character ch : output) {
        sb.append(ch);
      }
      res.add(sb.toString());
    }
    for (int i = first; i < n; i++) {
      // 动态维护数组
      Collections.swap(output, first, i);
      // 继续递归填下一个数
      backtrack(n, output, res, first + 1);
      // 撤销操作
      Collections.swap(output, first, i);
    }
  }

}

