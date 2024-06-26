package leetcodes.hard;


import static utils.arrayUtils.getIntArray;
import static utils.arrayUtils.getIntDoubleArray;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*
*

给你一个 n 个节点的无向无根树，节点编号从 0 到 n - 1 。给你整数 n 和一个长度为 n - 1 的二维整数数组 edges ，
其中 edges[i] = [ai, bi] 表示树中节点 ai 和 bi 之间有一条边。再给你一个长度为 n 的数组 coins ，
其中 coins[i] 可能为 0 也可能为 1 ，1 表示节点 i 处有一个金币。

一开始，你需要选择树中任意一个节点出发。你可以执行下述操作任意次：

    收集距离当前节点距离为 2 以内的所有金币，或者
    移动到树中一个相邻节点。

你需要收集树中所有的金币，并且回到出发节点，请你返回最少经过的边数。

如果你多次经过一条边，每一次经过都会给答案加一。


* */
public class code_2603_collectTheCoins {
  public static void main(String[] args) {
    code_2603_collectTheCoins body = new code_2603_collectTheCoins();
    Scanner sc = new Scanner(System.in);

    //
    //[1,0,0,0,0,1], edges = [[0,1],[1,2],[2,3],[3,4],[4,5]]
    //
    // 5 2 0 1 1 2 2 3 3 4 4 5
    int[][] edges = getIntDoubleArray();

    // 1 0 0 0 0 1
    int[] coins = getIntArray(sc, null);

    System.out.println(body.collectTheCoins(coins, edges));
  }


  public int collectTheCoins(int[] coins, int[][] edges) {
    int n = coins.length;
    List<Integer>[] g = new List[n];
    for (int i = 0; i < n; ++i) {
      g[i] = new ArrayList<Integer>();
    }
    int[] degree = new int[n];
    for (int[] edge : edges) {
      int x = edge[0], y = edge[1];
      g[x].add(y);
      g[y].add(x);
      ++degree[x];
      ++degree[y];
    }

    int rest = n;
    /* 删除树中所有无金币的叶子节点，直到树中所有的叶子节点都是含有金币的 */
    Queue<Integer> queue = new ArrayDeque<Integer>();
    for (int i = 0; i < n; ++i) {
      if (degree[i] == 1 && coins[i] == 0) {
        queue.offer(i);
      }
    }
    while (!queue.isEmpty()) {
      int u = queue.poll();
      --degree[u];
      --rest;
      for (int v : g[u]) {
        --degree[v];
        if (degree[v] == 1 && coins[v] == 0) {
          queue.offer(v);
        }
      }
    }
    /* 删除树中所有的叶子节点, 连续删除2次 */
    for (int x = 0; x < 2; ++x) {
      queue = new ArrayDeque<Integer>();
      for (int i = 0; i < n; ++i) {
        if (degree[i] == 1) {
          queue.offer(i);
        }
      }
      while (!queue.isEmpty()) {
        int u = queue.poll();
        --degree[u];
        --rest;
        for (int v : g[u]) {
          --degree[v];
        }
      }
    }

    return rest == 0 ? 0 : (rest - 1) * 2;
  }


}

