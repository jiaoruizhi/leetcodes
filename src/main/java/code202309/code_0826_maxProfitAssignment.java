package code202309;


import static utils.utils.getIntArray;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

/*
*
你有 n 个工作和 m 个工人。给定三个数组： difficulty, profit 和 worker ，其中:

    difficulty[i] 表示第 i 个工作的难度，profit[i] 表示第 i 个工作的收益。
    worker[i] 是第 i 个工人的能力，即该工人只能完成难度小于等于 worker[i] 的工作。

每个工人 最多 只能安排 一个 工作，但是一个工作可以 完成多次 。

    举个例子，如果 3 个工人都尝试完成一份报酬为 $1 的同样工作，那么总收益为 $3 。如果一个工人不能完成任何工作，他的收益为 $0 。

返回 在把工人分配到工作岗位后，我们所能获得的最大利润 。

* */
public class code_0826_maxProfitAssignment {
  public static void main(String[] args) {
    code_0826_maxProfitAssignment body = new code_0826_maxProfitAssignment();
    Scanner sc = new Scanner(System.in);

    // 1 2 3 1
    int[] difficulty = getIntArray(sc, null);
    int[] profit = getIntArray(sc, null);
    int[] worker = getIntArray(sc, null);

    // difficulty = [2,4,6,8,10], profit = [10,20,30,40,50], worker = [4,5,6,7]
    // 2 4 6 8 10
    // 10 20 30 40 50
    // 4 5 6 7

    /*

    2 4 6 8 10
10 20 30 40 50
4 5 6 7


68 35 52 47 86
67 17 1 81 3
92 10 85 74 82

     */

    System.out.println(body.maxProfitAssignment(difficulty, profit, worker));
  }

  public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
    int N = difficulty.length;
    Point[] jobs = new Point[N];
    for (int i = 0; i < N; ++i)
      jobs[i] = new Point(difficulty[i], profit[i]);
    Arrays.sort(jobs, (a, b) -> a.x - b.x);
    Arrays.sort(worker);

    int ans = 0, i = 0, best = 0;
    for (int skill: worker) {
      while (i < N && skill >= jobs[i].x)
        best = Math.max(best, jobs[i++].y);
      ans += best;
    }

    return ans;
  }

}

