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
    int leftIndex = -1;
    int left = -1;

    int rightIndex = -1;
    int right = -1;

    int cache = num;
    int i = 0;
    while (cache > 0) {
      int current = cache % 10;
      if (current > right) {
        right = current;
        rightIndex = i;
      }
      if (current < right) {
        leftIndex = i;
        left = current;
      }
      cache /= 10;
      i++;
    }

    int m1 = (int) (right * Math.pow(10, rightIndex));
    int m2 = (int) (left * Math.pow(10, (leftIndex - 1)));


    int p1 = (int) (right * Math.pow(10, (rightIndex - 1)));
    int p2 = (int) (left * Math.pow(10, leftIndex));

    return num - m1 - m2 + p1 + p2;
  }

}

