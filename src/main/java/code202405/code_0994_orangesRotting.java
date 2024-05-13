package code202405;

import static utils.arrayUtils.getIntDoubleArray;

import java.util.Scanner;

/*
*
在给定的 m x n 网格 grid 中，每个单元格可以有以下三个值之一：

    值 0 代表空单元格；
    值 1 代表新鲜橘子；
    值 2 代表腐烂的橘子。

每分钟，腐烂的橘子 周围 4 个方向上相邻 的新鲜橘子都会腐烂。

返回 直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1 。
*
*
* */
public class code_0994_orangesRotting {
  public static void main(String[] args) {
    code_0994_orangesRotting body = new code_0994_orangesRotting();
    Scanner sc = new Scanner(System.in);

    // 3 3 2 1 1 1 1 0 0 1 1
    // 3 3 2 1 1 0 1 1 1 0 1
    // 1 2 0 2

    // 4 3 2 1 1 1 1 0 0 1 1 1 0 1
    int[][] grid = getIntDoubleArray();
    System.out.println(body.orangesRotting(grid));
  }

  public int orangesRotting(int[][] grid) {
    int m = grid.length, n = grid[0].length, rest1 = 0, rotThisTime = 0, time = -1;

    while (true) {
      time++;
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          int now = grid[i][j];
          if (now == 1) {
            rest1++;
          }
          if (now == 2) {
            if (i - 1 >= 0 && grid[i - 1][j] == 1) {
              grid[i - 1][j] = -2;
              rotThisTime++;
            }
            if (i + 1 < m && grid[i + 1][j] == 1) {
              grid[i + 1][j] = -2;
              rotThisTime++;
            }
            if (j - 1 >= 0 && grid[i][j - 1] == 1) {
              grid[i][j - 1] = -2;
              rotThisTime++;
            }
            if (j + 1 < n && grid[i][j + 1] == 1) {
              grid[i][j + 1] = -2;
              rotThisTime++;
            }
          }
        }
      }

      if (rotThisTime == 0 && rest1 > 0) {
        return -1;
      }
      if (rotThisTime == 0 && rest1 == 0) {
        return time;
      }
      rest1 = 0;
      rotThisTime = 0;
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          if (grid[i][j] == -2) {
            grid[i][j] = 2;
          }
        }
      }
    }
  }
}

