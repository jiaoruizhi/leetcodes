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

    // 3 2 0 0 1 0 2 0
    // 5 2 0 0 1 0 -1 0 0 1 0 -1
    // [[0,0],[1,0],[-1,0],[0,1],[0,-1]]
    int num = sc.nextInt();

    System.out.println(body.maximumSwap(num));
  }

  // O(n) = log(k)
  public int maximumSwap(int num) {
    int head = -1;
    int index = 0;
    int max = -1;
    int cache = num;
    int i = 0;
    while (cache > 0) {
      int a = cache % 10;
      if (a > max) {
        max = a;
        index = i;
      }
      cache /= 10;
      if (cache == 0) {
        head = a;
      }
      i++;
    }

    int m1 = (int) (max * Math.pow(10, index));
    int m2 = (int) (head * Math.pow(10, (i - 1)));


    int p1 = (int) (max * Math.pow(10, (i - 1)));
    int p2 = (int) (head * Math.pow(10, index));

    return num - m1 - m2 + p1 + p2;
  }

}

