package code202309;


import static utils.arrayUtils.getIntDoubleArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

/*
*

现在你总共有 numCourses 门课需要选，记为 0 到 numCourses - 1。
给你一个数组 prerequisites ，其中 prerequisites[i] = [ai, bi] ，表示在选修课程 ai 前 必须 先选修 bi 。

    例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示：[0,1] 。

返回你为了学完所有课程所安排的学习顺序。可能会有多个正确的顺序，你只要返回 任意一种 就可以了。如果不可能完成所有课程，返回 一个空数组 。

* */
public class code_0210_findOrder {
  public static void main(String[] args) {
    code_0210_findOrder body = new code_0210_findOrder();


    Scanner sc = new Scanner(System.in);
    // 4
    // 4 2 1 0 2 0 2 1 3 2
    int numCourses = sc.nextInt();

    // 20
    // 8 2 0 10 3 18 6 11 11 14 13 1 15 1 6 5 17 4
    int[][] prerequisites = getIntDoubleArray();

    System.out.println(Arrays.toString(body.findOrder(numCourses, prerequisites)));
  }


  public int[] findOrder(int numCourses, int[][] prerequisites) {
    if (numCourses == 0) return new int[0];
    // HashSet 作为邻接矩阵
    HashSet<Integer>[] graph = new HashSet[numCourses];
    for (int i = 0; i < numCourses; i++) {
      graph[i] = new HashSet<>();
    }
    for (int[] p : prerequisites) {
      graph[p[1]].add(p[0]);
    }
    int[] mark = new int[numCourses]; // 标记数组
    Stack<Integer> stack = new Stack<>(); // 结果栈
    for (int i = 0; i < numCourses; i++) {
      if (isCycle(graph, mark, i, stack)) return new int[0];
    }
    int[] res = new int[numCourses];
    for (int i = 0; i < numCourses; i++) {
      res[i] = stack.pop();
    }
    return res;
  }

  private boolean isCycle(
    HashSet<Integer>[] graph,
    int[] mark,
    int i,
    Stack<Integer> stack
  ) {
    if (mark[i] == -1)
      return false;
    if (mark[i] == 1)
      return true;

    mark[i] = 1;
    for (int neighbor : graph[i]) {
      if (isCycle(graph, mark, neighbor, stack))
        return true;
    }
    mark[i] = -1;
    stack.push(i);
    return false;
  }
}

