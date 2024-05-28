package leetcodes.code202404_2;


import static utils.arrayUtils.getIntDoubleArray;

/*
*
给你一个下标从 0 开始、大小为 n x n 的整数矩阵 grid ，返回满足 Ri 行和 Cj 列相等的行列对 (Ri, Cj) 的数目。

如果行和列以相同的顺序包含相同的元素（即相等的数组），则认为二者是相等的。

*
* */
public class code_0048_rotate {
  public static void main(String[] args) {
    code_0048_rotate body = new code_0048_rotate();
    // 3 3 3 2 1 1 7 6 2 7 7
    // 4 4 3 1 2 2 1 4 4 5 2 4 2 2 2 4 2 2
    int[][] data = getIntDoubleArray();
    body.rotate(data);
    System.out.println(data);
  }

  public void rotate(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < n / 2; ++i) {
      for (int j = 0; j < (n + 1) / 2; ++j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[n - j - 1][i];
        matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
        matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
        matrix[j][n - i - 1] = temp;
      }
    }
  }
}
