package code202305;


import static utils.utils.getIntDoubleArray;

/*
*
根据 百度百科 ， 生命游戏 ，简称为 生命 ，是英国数学家约翰·何顿·康威在 1970 年发明的细胞自动机。

给定一个包含 m × n 个格子的面板，每一个格子都可以看成是一个细胞。每个细胞都具有一个初始状态： 1 即为 活细胞 （live），或 0 即为 死细胞 （dead）。每个细胞与其八个相邻位置（水平，垂直，对角线）的细胞都遵循以下四条生存定律：

    如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡；
    如果活细胞周围八个位置有两个或三个活细胞，则该位置活细胞仍然存活；
    如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡；
    如果死细胞周围正好有三个活细胞，则该位置死细胞复活；

下一个状态是通过将上述规则同时应用于当前状态下的每个细胞所形成的，其中细胞的出生和死亡是同时发生的。给你 m x n 网格面板 board 的当前状态，返回下一个状态。

*
* */
public class code_0289_cellLive {
  public static void main(String[] args) {
    // 4 3 0 1 0 0 0 1 1 1 1 0 0 0
    int[][] data = getIntDoubleArray();
    gameOfLife(data);
  }


  public static void gameOfLife(int[][] data) {
    int m = data.length;
    int n = data[0].length;

    int[][] test = new int[m][n];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        test[i][j] = data[i][j];
      }
    }

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        int cur = data[i][j];
        int cellNumber = calcCellNumber(data, i, j);
        int nextStatus = cur;
        if (cur == 1 && (cellNumber < 2 || cellNumber > 3)) {
          nextStatus = 0;
        }
        if (cur == 0 && cellNumber == 3) {
          nextStatus = 1;
        }
        data[i][j] = nextStatus;
      }
    }
  }

  public static int calcCellNumber(int[][] data, int x, int y) {
    int m = data.length;
    int n = data[0].length;
    int number = 0;

    if (x - 1 >= 0 && y - 1 >= 0) { //左上
      number += data[x - 1][y - 1];
    }
    if (x >= 0 && y - 1 >= 0) { //正上
      number += data[x][y - 1];
    }
    if (x + 1 < m && y - 1 >= 0) { //右上
      number += data[x + 1][y - 1];
    }
    if (x + 1 < m && y >= 0) { // 正右
      number += data[x + 1][y];
    }
    if (x + 1 < m && y + 1 < n) { // 右下
      number += data[x + 1][y + 1];
    }
    if (x < m && y + 1 < n) { // 正下
      number += data[x][y + 1];
    }
    if (x - 1 >= 0 && y + 1 < n) { // 左下
      number += data[x - 1][y + 1];
    }
    if (x - 1 >= 0) { // 正左
      number += data[x - 1][y];
    }

    return number;
  }
}
