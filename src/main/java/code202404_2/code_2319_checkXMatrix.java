package code202404_2;

import static utils.arrayUtils.getIntDoubleArray;

/*
*
如果一个正方形矩阵满足下述 全部 条件，则称之为一个 X 矩阵 ：

    矩阵对角线上的所有元素都 不是 0
    矩阵中所有其他元素都是 0

给你一个大小为 n x n 的二维整数数组 grid ，表示一个正方形矩阵。如果 grid 是一个 X 矩阵 ，返回 true ；否则，返回 false 。
*
* */
public class code_2319_checkXMatrix {
  public static void main(String[] args) {
    code_2319_checkXMatrix body = new code_2319_checkXMatrix();

    // 4 4 2 0 0 1 0 3 1 0 0 5 2 0 4 0 0 2

    // 3 3 5 7 0 0 3 1 0 5 0
    int[][] grid = getIntDoubleArray();

    System.out.println(body.checkXMatrix(grid));
  }

  public boolean checkXMatrix(int[][] grid) {
    int n = grid.length;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j || i + j == n) {
          if (grid[i][j] == 0) {
            return false;
          }
        } else {
          if (grid[i][j] != 0) {
            return false;
          }
        }
      }
    }
    return true;
  }
}

