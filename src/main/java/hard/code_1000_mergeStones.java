package hard;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*
有 n 堆石头排成一排，第 i 堆中有 stones[i] 块石头。

每次 移动 需要将 连续的 k 堆石头合并为一堆，而这次移动的成本为这 k 堆中石头的总数。

返回把所有石头合并成一堆的最低成本。如果无法合并成一堆，返回 -1 。

* */
public class code_1000_mergeStones {
  public static void main(String[] args) {
    code_1000_mergeStones body = new code_1000_mergeStones();
    Scanner sc = new Scanner(System.in);

    // 6 4 4 6
    int[] nums = getIntArray(sc, null);

    // 2
    int k = sc.nextInt();

    System.out.println(body.mergeStones(nums, k));
  }

  private int[][][] memo;

  private int[] s;

  private int k;

  public int mergeStones(int[] stones, int k) {
    int n = stones.length;

    // 无法合并成一堆
    if ((n - 1) % (k - 1) > 0) {
      return -1;
    }


    s = new int[n + 1];
    for (int i = 0; i < n; i++) {
      s[i + 1] = s[i] + stones[i]; // 前缀和
    }

    this.k = k;

    memo = new int[n][n][k + 1];

    for (int i = 0; i < n; ++i) {
      for (int j = 0; j < n; ++j) {
        Arrays.fill(memo[i][j], -1); // -1 表示还没有计算过
      }
    }

    return dfs(0, n - 1, 1);
  }


  private int dfs(int i, int j, int p) {
    if (memo[i][j][p] != -1) {
      return memo[i][j][p];
    }

    // 合并成一堆
    if (p == 1) {
      return memo[i][j][p] = i == j ? 0 : dfs(i, j, k) + s[j + 1] - s[i];
    }

    int res = Integer.MAX_VALUE;

    // 枚举哪些石头堆合并成第一堆
    for (int m = i; m < j; m += k - 1) {
      res = Math.min(res, dfs(i, m, 1) + dfs(m + 1, j, p - 1));
    }

    return memo[i][j][p] = res;
  }

}

