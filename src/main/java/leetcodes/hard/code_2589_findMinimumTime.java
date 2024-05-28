package leetcodes.hard;

import static utils.arrayUtils.getIntDoubleArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*
你有一台电脑，它可以 同时 运行无数个任务。给你一个二维整数数组 tasks ，
其中 tasks[i] = [start[i], end[i], duration[i]] 表示第 i 个任务需要在 闭区间 时间段 [start[i],
end[i]] 内运行 duration[i] 个整数时间点（但不需要连续）。

当电脑需要运行任务时，你可以打开电脑，如果空闲时，你可以将电脑关闭。

请你返回完成所有任务的情况下，电脑最少需要运行多少秒。
*
* */
public class code_2589_findMinimumTime {
  public static void main(String[] args) {
    code_2589_findMinimumTime body = new code_2589_findMinimumTime();
    Scanner sc = new Scanner(System.in);

    // 1 1 2 1 3
    // 2 3 3
    // 7 7 7 7 7 7
    int[][] tasks = getIntDoubleArray();

    System.out.println(body.findMinimumTime(tasks));
  }


  public int findMinimumTime(int[][] tasks) {
    Arrays.sort(tasks, (a, b) -> a[1] - b[1]);

    int ans = 0;
    int mx = tasks[tasks.length - 1][1];
    boolean[] run = new boolean[mx + 1];

    for (int[] t : tasks) {
      int start = t[0];
      int end = t[1];
      int d = t[2];
      for (int i = start; i <= end; i++) {
        if (run[i]) {
          d--; // 去掉运行中的时间点
        }
      }

      for (int i = end; d > 0; i--) { // 剩余的 d 填充区间后缀
        if (!run[i]) {
          run[i] = true; // 运行
          d--;
          ans++;
        }
      }
    }

    return ans;
  }
}

