package hard;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/*
给你一个整数 hoursBefore ，表示你要前往会议所剩下的可用小时数。要想成功抵达会议现场，
你必须途经 n 条道路。道路的长度用一个长度为 n 的整数数组 dist 表示，其中 dist[i] 表示第 i 条道路的长度（单位：千米）。
另给你一个整数 speed ，表示你在道路上前进的速度（单位：千米每小时）。

当你通过第 i 条路之后，就必须休息并等待，直到 下一个整数小时 才能开始继续通过下一条道路。
注意：你不需要在通过最后一条道路后休息，因为那时你已经抵达会议现场。

    例如，如果你通过一条道路用去 1.4 小时，那你必须停下来等待，到 2 小时才可以继续通过下一条道路。
    如果通过一条道路恰好用去 2 小时，就无需等待，可以直接继续。

然而，为了能准时到达，你可以选择 跳过 一些路的休息时间，这意味着你不必等待下一个整数小时。
注意，这意味着与不跳过任何休息时间相比，你可能在不同时刻到达接下来的道路。

    例如，假设通过第 1 条道路用去 1.4 小时，且通过第 2 条道路用去 0.6 小时。
    跳过第 1 条道路的休息时间意味着你将会在恰好 2 小时完成通过第 2 条道路，且你能够立即开始通过第 3 条道路。

返回准时抵达会议现场所需要的 最小跳过次数 ，如果 无法准时参会 ，返回 -1 。
* */


public class code_minSkips_minSkips {
  public static void main(String[] args) {
    code_minSkips_minSkips body = new code_minSkips_minSkips();
    Scanner sc = new Scanner(System.in);

    int[] dist = getIntArray(sc, " ");
    int speed = sc.nextInt();
    int hoursBefore = sc.nextInt();

    long startTime = new Date().getTime();

    int ret1 = body.minSkips(dist, speed, hoursBefore);

    long endTime = new Date().getTime();
    System.out.println("本程序运行 " + (endTime - startTime) + " 毫秒完成。");
    System.out.println(ret1);

  }

  public int minSkips(int[] dist, int speed, int hoursBefore) {
    int n = dist.length;
    // 由于我们需要处理到达第i个点的时间，所以我们需要n+1的空间
    long[] dp = new long[n + 1];
    Arrays.fill(dp, Long.MAX_VALUE);
    dp[0] = 0; // 初始状态，没有跳过任何休息时间

    for (int i = 0; i < n; i++) {
      long[] nextDp = new long[n + 1];
      Arrays.fill(nextDp, Long.MAX_VALUE);
      for (int j = 0; j <= i + 1; j++) {
        // 不跳过休息
        if (dp[j] != Long.MAX_VALUE) {
          nextDp[j] = Math.min(nextDp[j], ((dp[j] + dist[i] - 1) / speed + 1) * speed);
        }
        // 跳过休息，注意j>0因为至少跳过一次
        if (j > 0 && dp[j - 1] != Long.MAX_VALUE) {
          nextDp[j] = Math.min(nextDp[j], dp[j - 1] + dist[i]);
        }
      }
      dp = nextDp; // 更新dp数组为下一轮迭代准备
    }

    // 寻找满足条件的最小跳过次数
    for (int j = 0; j <= n; j++) {
      if (dp[j] <= (long) hoursBefore * speed) {
        return j;
      }
    }
    return -1; // 如果没有找到，返回-1
  }
}
