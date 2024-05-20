package code202405;

import static utils.arrayUtils.getIntArray;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
*
给你一个由 不同 整数组成的整数数组 arr 和一个整数 k 。

每回合游戏都在数组的前两个元素（即 arr[0] 和 arr[1] ）之间进行。
* 比较 arr[0] 与 arr[1] 的大小，较大的整数将会取得这一回合的胜利并保留在位置 0 ，
* 较小的整数移至数组的末尾。当一个整数赢得 k 个连续回合时，游戏结束，该整数就是比赛的 赢家 。

返回赢得比赛的整数。

题目数据 保证 游戏存在赢家。
*
* */
public class code_1535_getWinner {
  public static void main(String[] args) {
    code_1535_getWinner body = new code_1535_getWinner();
    Scanner sc = new Scanner(System.in);

    // 2 1 3 5 4 6 7
    // 2
    // 2 3 3
    // 7 7 7 7 7 7
    int[] arr = getIntArray(sc, " ");

    int k = sc.nextInt();

    System.out.println(body.getWinner(arr, k));
  }

  public int getWinner(int[] arr, int k) {
    Queue<Integer> que = new LinkedList<Integer>();
    for (int i: arr) {
      que.add(i);
    }
    int top = que.poll(), count = 0, step = Math.min(k, arr.length);

    while (count < step) {
      int next = que.peek();
      if (top >= next) {
        que.poll();
        que.add(next);
        count++;
      } else {
        que.poll();
        que.add(top);
        top = next;
        count = 1;
      }
    }
    return top;
  }
}

