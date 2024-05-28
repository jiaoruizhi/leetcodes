package leetcodes.code202309;


import static utils.arrayUtils.getIntDoubleArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
*
你总共需要上 numCourses 门课，课程编号依次为 0 到 numCourses-1 。你会得到一个数组 prerequisite ，

* 其中 prerequisites[i] = [ai, bi] 表示如果你想选 bi 课程，你 必须 先选 ai 课程。

有的课会有直接的先修课程，比如如果想上课程 1 ，你必须先上课程 0 ，那么会以 [0,1] 数对的形式给出先修课程数对。

先决条件也可以是 间接 的。如果课程 a 是课程 b 的先决条件，课程 b 是课程 c 的先决条件，那么课程 a 就是课程 c 的先决条件。

你也得到一个数组 queries ，其中 queries[j] = [uj, vj]。对于第 j 个查询，您应该回答课程 uj 是否是课程 vj 的先决条件。

返回一个布尔数组 answer ，其中 answer[j] 是第 j 个查询的答案。

* */
public class code_1462_checkIfPrerequisite {
  public static void main(String[] args) {
    code_1462_checkIfPrerequisite body = new code_1462_checkIfPrerequisite();


    Scanner sc = new Scanner(System.in);
    // 4
    int numCourses = sc.nextInt();

    // 3 2 1 2 1 0 2 0
    int[][] prerequisites = getIntDoubleArray();

    // 2 2 1 0 1 2
    int[][] queries = getIntDoubleArray();

    System.out.println(body.checkIfPrerequisite(numCourses, prerequisites, queries));
  }


  public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
    List<Integer>[] kids = new List[numCourses];
    for (int i = 0; i < numCourses; i++) {
      kids[i] = new ArrayList<>();
    }
    boolean[] vi = new boolean[numCourses];
    boolean[][] isPre = new boolean[numCourses][numCourses];
    for (int[] p : prerequisites) {
      kids[p[0]].add(p[1]);
    }
    for (int i = 0; i < numCourses; i++) {
      dfs(kids, isPre, vi, i);
    }
    List<Boolean> res = new ArrayList<>();
    for (int[] query : queries) {
      res.add(isPre[query[0]][query[1]]);
    }
    return res;
  }

  public void dfs(List<Integer>[] kids, boolean[][] isPre, boolean[] vi, int cur) {
    if (vi[cur]) {
      return;
    }
    vi[cur] = true;
    for (int kid : kids[cur]) {
      dfs(kids, isPre, vi, kid);
      isPre[cur][kid] = true;
      for (int i = 0; i < isPre.length; ++i) {
        isPre[cur][i] = isPre[cur][i] | isPre[kid][i];
      }
    }
  }

}

