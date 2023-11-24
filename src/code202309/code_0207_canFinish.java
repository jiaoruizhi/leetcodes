package code202309;

import static utils.utils.getIntDoubleArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
*

你这个学期必须选修 numCourses 门课程，记为 0 到 numCourses - 1 。

在选修某些课程之前需要一些先修课程。 先修课程按数组 prerequisites 给出，其中 prerequisites[i] = [ai, bi] ，表示如果要学习课程 ai 则 必须 先学习课程  bi 。

    例如，先修课程对 [0, 1] 表示：想要学习课程 0 ，你需要先完成课程 1 。

请你判断是否可能完成所有课程的学习？如果可以，返回 true ；否则，返回 false 。

* */
public class code_0207_canFinish {
  public static void main(String[] args) {
    code_0207_canFinish body = new code_0207_canFinish();


    Scanner sc = new Scanner(System.in);
    // 4
    // 4 2 1 0 2 0 2 1 3 2
    int numCourses = sc.nextInt();

    // 20
    // 8 2 0 10 3 18 6 11 11 14 13 1 15 1 5 5 17 4
    int[][] prerequisites = getIntDoubleArray();

    System.out.println(body.canFinish(numCourses, prerequisites));
  }


  List<List<Integer>> edges;
  int[] visited;
  boolean valid = true;

  public boolean canFinish(int numCourses, int[][] prerequisites) {
    edges = new ArrayList<>();
    for (int i = 0; i < numCourses; ++i) {
      edges.add(new ArrayList<>());
    }
    visited = new int[numCourses];
    for (int[] info : prerequisites) {
      edges.get(info[1]).add(info[0]);
    }
    for (int i = 0; i < numCourses && valid; ++i) {
      if (visited[i] == 0) {
        dfs(i);
      }
    }
    return valid;
  }

  public void dfs(int u) {
    visited[u] = 1;
    for (int v: edges.get(u)) {
      if (visited[v] == 0) {
        dfs(v);
        if (!valid) {
          return;
        }
      } else if (visited[v] == 1) {
        valid = false;
        return;
      }
    }
    visited[u] = 2;
  }

}

