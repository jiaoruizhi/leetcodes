package code202404;

import static utils.arrayUtils.getCharDoubleArray;

/*
*
*
*
* 给你一个由 '1'（陆地）和 '0'（水）组成的的二维网格，请你计算网格中岛屿的数量。
*
* 岛屿总是被水包围，并且每座岛屿只能由水平方向和/或竖直方向上相邻的陆地连接形成。
*
* 此外，你可以假设该网格的四条边均被水包围。
*
*
* */
public class code_0200_numIslands {
  public static void main(String[] args) {
    code_0200_numIslands body = new code_0200_numIslands();

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

