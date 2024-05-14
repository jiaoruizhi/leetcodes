package code202405;

import static utils.arrayUtils.getIntArray;

import java.util.HashMap;
import java.util.Scanner;

/*
*
给你一个下标从 0 开始的整数数组 tasks ，其中 tasks[i] 表示任务的难度级别。在每一轮中，你可以完成 2 个或者 3 个 相同难度级别 的任务。

返回完成所有任务需要的 最少 轮数，如果无法完成所有任务，返回 -1 。
*
*
* */
public class code_2244_minimumRounds {
  public static void main(String[] args) {
    code_2244_minimumRounds body = new code_2244_minimumRounds();
    Scanner sc = new Scanner(System.in);

    // 2 2 3 3 2 4 4 4 4 4
    // 2 3 3
    // 7 7 7 7 7 7
    int[] tasks = getIntArray(sc, " ");

    System.out.println(body.minimumRounds(tasks));
  }

  HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
  HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

  public int minimumRounds(int[] tasks) {
    for (int i : tasks) {
      map.put(i, map.getOrDefault(i, 0) + 1);
    }
    int result = 0;
    for (int i : map.values()) {
      int value = finishTasks(i);
      if (value == -1) {
        return -1;
      }
      result += value;
    }
    return result;
  }

  public int finishTasks(int num) {
    if (num < 0) {
      return -1;
    }
    if (num == 1) {
      return -1;
    }
    if (num == 0) {
      return 0;
    }

    if (cache.containsKey(num)) {
      return cache.get(num);
    }

    int x = finishTasks(num - 2);
    int y = finishTasks(num - 3);
    int res = -1;
    if (x != -1 && y != -1) {
      res = Math.min(x, y) + 1;
    }
    if (x == -1 || y == -1) {
      res = x == -1 ? y + 1 : x + 1;
    }
    cache.put(num, res);
    return res;
  }
}

