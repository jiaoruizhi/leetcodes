package leetcodes.code202406;

import static utils.arrayUtils.getCharDoubleArray;

/*
*
给你一个大小为 m x n 的矩阵 board 表示甲板，其中，每个单元格可以是一艘战舰 'X' 或者是一个空位 '.' ，返回在甲板 board 上放置的 战舰 的数量。

战舰 只能水平或者垂直放置在 board 上。换句话说，战舰只能按 1 x k（1 行，k 列）或 k x 1（k 行，1 列）的形状建造，
* 其中 k 可以是任意大小。两艘战舰之间至少有一个水平或垂直的空位分隔 （即没有相邻的战舰）。
*
*
* */


public class code_0419_countBattleships {
  public static void main(String[] args) {
    code_0419_countBattleships body = new code_0419_countBattleships();

    // 5 4 X . X . X . X . X . . . . . X X . . . .
    char[][] edges = getCharDoubleArray();

    System.out.println(body.countBattleships(edges));
  }

  char[][] data;

  public int countBattleships(char[][] board) {
    data = board;
    int m = data.length, n = data[0].length, result = 0;

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        char now = data[i][j];
        if (now == '.' || now == 'N') {
          continue;
        }
        if (now == 'X') {
          result++;
          dfs(i, j + 1, 'X');
          dfs(i + 1, j, 'Y');
        }

      }
    }
    return result;
  }

  private void dfs(int x, int y, char direct) {
    int m = data.length, n = data[0].length;
    if (direct == 'X') {
      while (y < n && data[x][y] == 'X') {
        data[x][y++] = 'N';
      }
    }
    if (direct == 'Y') {
      while (x < m && data[x][y] == 'X') {
        data[x++][y] = 'N';
      }
    }
  }
}

