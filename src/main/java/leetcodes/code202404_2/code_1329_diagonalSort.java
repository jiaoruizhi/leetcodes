package leetcodes.code202404_2;

import static utils.arrayUtils.getIntDoubleArray;

/*
*
矩阵对角线 是一条从矩阵最上面行或者最左侧列中的某个元素开始的对角线，沿右下方向一直到矩阵末尾的元素。

例如，矩阵 mat 有 6 行 3 列，从 mat[2][0] 开始的 矩阵对角线 将会经过 mat[2][0]、mat[3][1] 和 mat[4][2] 。

给你一个 m * n 的整数矩阵 mat ，请你将同一条 矩阵对角线 上的元素按升序排序后，返回排好序的矩阵。
*
*
* */
public class code_1329_diagonalSort {
  public static void main(String[] args) {
    code_1329_diagonalSort body = new code_1329_diagonalSort();

    // 3 4 3 3 1 1 2 2 1 2 1 1 1 2


    int[][] mat = getIntDoubleArray();

    body.diagonalSort(mat);
    System.out.println(mat);
  }

  public int[][] diagonalSort(int[][] mat) {
    int y = mat.length, x = mat[0].length;
    for (int i = 1 - y; i < x; i++) {
      boolean flag;
      do {
        flag = false;
        for (int j = 0; j < y; j++) {
          int xIndex = i + j;
          if (xIndex < 0 || xIndex >= x) {
            continue;
          }
          if (xIndex + 1 < x && j + 1 < y && mat[j][xIndex] > mat[j + 1][xIndex + 1]) {
            System.out.println(xIndex);
            exchange(mat, j, xIndex, j + 1, xIndex + 1);
            flag = true;
          }
        }
      } while (flag);
    }
    return mat;
  }

  public void exchange(int[][] mat, int x1, int y1, int x2, int y2) {
    int cache = mat[x1][y1];
    mat[x1][y1] = mat[x2][y2];
    mat[x2][y2] = cache;
  }
}

