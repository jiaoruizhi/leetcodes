package code202305;


import static utils.utils.getIntDoubleArray;

/*
*
给你一个下标从 0 开始、大小为 n x n 的整数矩阵 grid ，返回满足 Ri 行和 Cj 列相等的行列对 (Ri, Cj) 的数目。

如果行和列以相同的顺序包含相同的元素（即相等的数组），则认为二者是相等的。

*
* */
public class code_0352_equalPairs {
  public static void main(String[] args) {
    // 3 3 3 2 1 1 7 6 2 7 7
    // 4 4 3 1 2 2 1 4 4 5 2 4 2 2 2 4 2 2
    int[][] data = getIntDoubleArray();

    System.out.println(equalPairs(data));
  }


  public static int equalPairs(int[][] grid) {
    int m = grid.length;
    int n = grid[0].length;

    int count = 0;

    for (int i = 0; i< m; i++) {
      int[] current = grid[i];
      for (int j = 0; j < n; j++) {
        boolean flag = true;
        for (int k = 0 ; k< m;k++) {
          if (current[k] != grid[k][j]) {
            flag = false;
            break;
          }
        }
        if (flag) {
          count++;
        }
      }
    }
    return count;
  }
}
