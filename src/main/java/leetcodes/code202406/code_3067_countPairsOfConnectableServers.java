package leetcodes.code202406;

import static utils.arrayUtils.getIntDoubleArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
*
给你一棵无根带权树，树中总共有 n 个节点，分别表示 n 个服务器，服务器从 0 到 n - 1 编号。
同时给你一个数组 edges ，其中 edges[i] = [ai, bi, weight[i]] 表示节点 ai 和 bi 之间有一条双向边，
边的权值为 weight[i] 。再给你一个整数 signalSpeed 。

如果两个服务器 a ，b 和 c 满足以下条件，那么我们称服务器 a 和 b 是通过服务器 c 可连接的 ：

    a < b ，a != c 且 b != c 。
    从 c 到 a 的距离是可以被 signalSpeed 整除的。
    从 c 到 b 的距离是可以被 signalSpeed 整除的。
    从 c 到 b 的路径与从 c 到 a 的路径没有任何公共边。

请你返回一个长度为 n 的整数数组 count ，其中 count[i] 表示通过服务器 i 可连接 的服务器对的 数目 。
* */


public class code_3067_countPairsOfConnectableServers {
  public static void main(String[] args) {
    code_3067_countPairsOfConnectableServers body = new code_3067_countPairsOfConnectableServers();
    Scanner sc = new Scanner(System.in);

    // 5 3 0 1 1 1 2 5 2 3 13 3 4 9 4 5 2
    // 1
    int[][] edges = getIntDoubleArray();
    int signalSpeed = sc.nextInt();

    System.out.println(Arrays.toString(body.countPairsOfConnectableServers(edges, signalSpeed)));
  }

  public int[] countPairsOfConnectableServers(int[][] edges, int signalSpeed) {
    int n = edges.length + 1;
    List<int[]>[] g = new ArrayList[n];
    Arrays.setAll(g, i -> new ArrayList<>());
    for (int[] e : edges) {
      int x = e[0];
      int y = e[1];
      int wt = e[2];
      g[x].add(new int[] {y, wt});
      g[y].add(new int[] {x, wt});
    }

    int[] ans = new int[n];
    for (int i = 0; i < n; i++) {
      int sum = 0;
      for (int[] e : g[i]) {
        int cnt = dfs(e[0], i, e[1], g, signalSpeed);
        ans[i] += cnt * sum;
        sum += cnt;
      }
    }
    return ans;
  }

  private int dfs(int x, int fa, int sum, List<int[]>[] g, int signalSpeed) {
    int cnt = sum % signalSpeed == 0 ? 1 : 0;
    for (int[] e : g[x]) {
      int y = e[0];
      if (y != fa) {
        cnt += dfs(y, x, sum + e[1], g, signalSpeed);
      }
    }
    return cnt;
  }
}

