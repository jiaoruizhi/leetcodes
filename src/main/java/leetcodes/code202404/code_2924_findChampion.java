package leetcodes.code202404;

import static utils.arrayUtils.getIntDoubleArray;

import java.util.Scanner;

/*
*
一场比赛中共有 n 支队伍，按从 0 到  n - 1 编号。每支队伍也是 有向无环图（DAG） 上的一个节点。

给你一个整数 n 和一个下标从 0 开始、长度为 m 的二维整数数组 edges 表示这个有向无环图，其中 edges[i] = [ui, vi] 表示图中存在一条从 ui 队到 vi 队的有向边。

从 a 队到 b 队的有向边意味着 a 队比 b 队 强 ，也就是 b 队比 a 队 弱 。

在这场比赛中，如果不存在某支强于 a 队的队伍，则认为 a 队将会是 冠军 。

如果这场比赛存在 唯一 一个冠军，则返回将会成为冠军的队伍。否则，返回 -1 。

注意

    环 是形如 a1, a2, ..., an, an+1 的一个序列，且满足：节点 a1 与节点 an+1 是同一个节点；节点 a1, a2, ..., an 互不相同；对于范围 [1, n] 中的每个 i ，均存在一条从节点 ai 到节点 ai+1 的有向边。
    有向无环图 是不存在任何环的有向图。


*
* */
public class code_2924_findChampion {
  public static void main(String[] args) {
    code_2924_findChampion body = new code_2924_findChampion();
    Scanner sc = new Scanner(System.in);

    // 2 2 0 1 0 0

    // 2 3 0 2 1 3 1 2
    int[][] grid = getIntDoubleArray();

    // 4
    int n = sc.nextInt();

    System.out.println(body.findChampion(n, grid));
  }

  public int findChampion(int n, int[][] edges) {
    int[] cache = new int[n];
    for (int[] arr : edges) {
      cache[arr[1]] = 1;
    }
    int num = -1;
    for (int i = 0; i < n; i++) {
      if (cache[i] == 0) {
        if (num == -1) {
          num = i;
        } else {
          num = -2;
          break;
        }
      }
    }
    return num < 0 ? -1 : num;
  }
}

