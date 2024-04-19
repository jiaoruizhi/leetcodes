package hard;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/*
*
计算24点

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
