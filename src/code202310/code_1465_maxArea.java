package code202310;

import static utils.utils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*
矩形蛋糕的高度为 h 且宽度为 w，给你两个整数数组 horizontalCuts 和 verticalCuts，其中：

     horizontalCuts[i] 是从矩形蛋糕顶部到第  i 个水平切口的距离
    verticalCuts[j] 是从矩形蛋糕的左侧到第 j 个竖直切口的距离

请你按数组 horizontalCuts 和 verticalCuts 中提供的水平和竖直位置切割后，请你找出 面积最大 的那份蛋糕，并返回其 面积 。
*
* 由于答案可能是一个很大的数字，因此需要将结果 对 109 + 7 取余 后返回。
*
*
*
* */
public class code_1465_maxArea {
  public static void main(String[] args) {
    code_1465_maxArea body = new code_1465_maxArea();
    Scanner sc = new Scanner(System.in);


    int h = sc.nextInt();
    int w = sc.nextInt();

    int[] horizontalCuts = getIntArray(sc, null);
    int[] verticalCuts = getIntArray(sc, null);

    System.out.println(body.maxArea(h, w, horizontalCuts, verticalCuts));
  }

  public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
    final long MOD = (long) 1e9 + 7;

    Arrays.sort(horizontalCuts);
    Arrays.sort(verticalCuts);
    //排序后寻找差值最大的
    int pre = 0, hMax = Integer.MIN_VALUE, wMax = Integer.MIN_VALUE;
    for (int i = 0; i <= horizontalCuts.length; i++) {
      int val = i < horizontalCuts.length ? horizontalCuts[i] : h;
      hMax = Math.max(val - pre, hMax);
      pre = val;
    }
    pre = 0;
    for (int i = 0; i <= verticalCuts.length; i++) {
      int val = i < verticalCuts.length ? verticalCuts[i] : w;
      wMax = Math.max(val - pre, wMax);
      pre = val;
    }
    return (int) (((long) hMax * wMax) % MOD);
  }
}

