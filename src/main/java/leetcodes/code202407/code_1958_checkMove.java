package leetcodes.code202407;

import static utils.arrayUtils.getCharDoubleArray;

/*
*
*
给你一个下标从 0 开始的 8 x 8 网格 board ，其中 board[r][c] 表示游戏棋盘上的格子 (r, c) 。
* 棋盘上空格用 '.' 表示，白色格子用 'W' 表示，黑色格子用 'B' 表示。

游戏中每次操作步骤为：选择一个空格子，将它变成你正在执行的颜色（要么白色，要么黑色）。
* 但是，合法 操作必须满足：涂色后这个格子是 好线段的一个端点 （好线段可以是水平的，竖直的或者是对角线）。

好线段 指的是一个包含 三个或者更多格子（包含端点格子）的线段，线段两个端点格子为 同一种颜色 ，且中间剩余格子的颜色都为
* 另一种颜色 （线段上不能有任何空格子）。你可以在下图找到好线段的例子：
*
*
* */
public class code_1958_checkMove {
  public static void main(String[] args) {
    code_1958_checkMove body = new code_1958_checkMove();

    // grid = [
    //  ["1","1","1","1","0"],
    //  ["1","1","0","1","0"],
    //  ["1","1","0","0","0"],
    //  ["0","0","0","0","0"]
    //]
    // 5 4 1 1 1 1 0 1 1 0 1 0 1 1 0 0 0 0 0 0 0 0
    char[][] grid = getCharDoubleArray();

    System.out.println(body.numIslands(grid));
  }

  public int numIslands(char[][] grid) {
    int xl = grid.length;
    int yl = grid[0].length;
    int[][] searchMap = new int[xl][yl];
    int result = 0;

    for (int i = 0; i < xl; i++) {
      for (int j = 0; j < yl; j++) {
        if (searchMap[i][j] == 1) {
          continue;
        }
        int value = grid[i][j];
        if (value == '0') {
          searchMap[i][j] = 1;
          continue;
        }
        result++;
        dfs(i, j, grid, searchMap);
      }
    }
    return result;
  }

  public void dfs(int x, int y, char[][] grid, int[][] searchMap) {
    if (searchMap[x][y] == 1) {
      return;
    }
    searchMap[x][y] = 1;

    if (grid[x][y] == '0') {
      return;
    }
    int xl = grid.length;
    int yl = grid[0].length;

    if (x >= 1) {
      dfs(x - 1, y, grid, searchMap);
    }
    if (x < xl - 1) {
      dfs(x + 1, y, grid, searchMap);
    }
    if (y >= 1) {
      dfs(x, y - 1, grid, searchMap);
    }
    if (y < yl - 1) {
      dfs(x, y + 1, grid, searchMap);
    }
  }
}

