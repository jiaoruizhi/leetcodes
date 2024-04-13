package code202309;


import static utils.arrayUtils.getIntDoubleArray;

import java.util.HashMap;

/*
*
骑士在一张 n x n 的棋盘上巡视。在有效的巡视方案中，骑士会从棋盘的 左上角 出发，并且访问棋盘上的每个格子 恰好一次 。

给你一个 n x n 的整数矩阵 grid ，由范围 [0, n * n - 1] 内的不同整数组成，其中 grid[row][col]
表示单元格 (row, col) 是骑士访问的第 grid[row][col] 个单元格。骑士的行动是从下标 0 开始的。

如果 grid 表示了骑士的有效巡视方案，返回 true；否则返回 false。

注意，骑士行动时可以垂直移动两个格子且水平移动一个格子，或水平移动两个格子且垂直移动一个格子。下图展示了骑士从某个格子出发可能的八种行动路线。

* */
public class code_2596_checkValidGrid {
  public static void main(String[] args) {
    code_2596_checkValidGrid body = new code_2596_checkValidGrid();

    // 5 5 0 11 16 5 20 17 4 19 10 15 12 1 8 21 6 3 18 23 14 9 24 13 2 7 22

    //[[24,11,22,17,4],[21,16,5,12,9],[6,23,10,3,18],[15,20,1,8,13],[0,7,14,19,2]]
    //5 5 24 11 22 17 4 21 16 5 12 9 6 23 10 3 18 15 20 1 8 13 0 7 14 19 2

    int[][] grid = getIntDoubleArray();
    System.out.println(body.checkValidGrid(grid));
  }


  public boolean checkValidGrid(int[][] grid) {
    HashMap<Integer, Integer[]> map = new HashMap<>();
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        map.put(grid[i][j], new Integer[] {i, j});
      }
    }

    Integer[] last = new Integer[]{};
    for (int i = 0; i < grid.length * grid[0].length; i++) {
      if (i == 0) {
        last = map.get(i);
        if (last[0] != 0 || last[1] != 0) {
          return false;
        }
        continue;
      }
      Integer[] current = map.get(i);
      boolean check = checkOneStep(last[0], last[1], current[0], current[1]);
      if (!check) {
        return false;
      }
      last = current;
    }
    return true;
  }

  public boolean checkOneStep(Integer x1, Integer y1, Integer x2, Integer y2) {
    boolean horizontal = Math.abs(x1 - x2) == 2 && Math.abs(y1 - y2) == 1;
    boolean vertical = Math.abs(x1 - x2) == 1 && Math.abs(y1 - y2) == 2;
    return horizontal || vertical;
  }

}

