package code202310;

import static utils.utils.getIntArray;

import java.util.PriorityQueue;
import java.util.Scanner;

/*
*

给你一个整数数组 gifts ，表示各堆礼物的数量。每一秒，你需要执行以下操作：

    选择礼物数量最多的那一堆。
    如果不止一堆都符合礼物数量最多，从中选择任一堆即可。
    选中的那一堆留下平方根数量的礼物（向下取整），取走其他的礼物。

返回在 k 秒后剩下的礼物数量。
*
* */
public class code_2558_pickGifts {
  public static void main(String[] args) {
    code_2558_pickGifts body = new code_2558_pickGifts();
    Scanner sc = new Scanner(System.in);



    // 25,64,9,4,100
    int[] gifts = getIntArray(sc, ",");

    int k = sc.nextInt();

    System.out.println(body.pickGifts(gifts, k));
  }

  public long pickGifts(int[] gifts, int k) {
    long result = 0;
    PriorityQueue<Integer> q = new PriorityQueue<Integer>((a, b) -> b - a);
    for (int g : gifts) {
      result += g;
      q.offer(g);
    }

    for (int i = 0; i < k; i++) {
      double now = q.poll();
      double rest = Math.floor(Math.sqrt(now));
      result -= now - rest;
      q.offer((int)rest);
    }

    return result;
  }

}

