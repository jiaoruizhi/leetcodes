package code202401;

import java.util.Scanner;

/*
*

给定一个非负整数，你至多可以交换一次数字中的任意两位。返回你能得到的最大值。
*
* 示例 1 :

输入: 2736
输出: 7236
解释: 交换数字2和数字7。
示例 2 :

输入: 9973
输出: 9973
解释: 不需要交换。

* */
public class code_0670_maximumSwap {
  public static void main(String[] args) {
    code_0670_maximumSwap body = new code_0670_maximumSwap();
    Scanner sc = new Scanner(System.in);

    // 2736
    // 9973
    int num = sc.nextInt();

    System.out.println(body.maximumSwap(num));
  }

  public int maximumSwap(int num) {
    char[] s = Integer.toString(num).toCharArray();
    int maxIdx = s.length - 1;
    int p = -1, q = 0;
    for (int i = s.length - 2; i >= 0; i--) {
      if (s[i] > s[maxIdx]) { // s[i] 是目前最大数字
        maxIdx = i;
      } else if (s[i] < s[maxIdx]) { // s[i] 右边有比它大的
        p = i;
        q = maxIdx; // 更新 p 和 q
      }
    }
    if (p == -1) { // 这意味着 s 是降序的
      return num;
    }
    char temp = s[p];
    s[p] = s[q];
    s[q] = temp; // 交换 s[p] 和 s[q]
    return Integer.parseInt(new String(s));
  }
}

