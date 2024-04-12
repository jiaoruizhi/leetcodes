package code202309;


import static utils.arrayUtils.getIntArray;
import static utils.arrayUtils.getIntDoubleArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
*

在一个 8x8 的棋盘上，放置着若干「黑皇后」和一个「白国王」。

给定一个由整数坐标组成的数组 queens ，表示黑皇后的位置；以及一对坐标 king ，表示白国王的位置，返回所有可以攻击国王的皇后的坐标(任意顺序)。
*
* */
public class code_1222_queensAttackTheKing {
  public static void main(String[] args) {
    code_1222_queensAttackTheKing body = new code_1222_queensAttackTheKing();
    Scanner sc = new Scanner(System.in);

    // 20
    // 6 2 0 1 1 0 4 0 0 4 3 3 2 4
    // [[0,1],[1,0],[4,0],[0,4],[3,3],[2,4]]
    int[][] queens = getIntDoubleArray();

    // 0 0
    int[] king = getIntArray(sc, null);

    System.out.println(body.queensAttackTheKing(queens, king));
  }


  public List<List<Integer>> queensAttackTheKing(int[][] queens, int[] king) {
    List<List<Integer>> result = new ArrayList<>();

    List<Integer> queenList = new ArrayList<>();
    for (int[] queen : queens) {
      queenList.add(queen[0] * 8 + queen[1]);
    }

    List<Integer[]> directions = new ArrayList<>();
    directions.add(new Integer[] {1, 0});
    directions.add(new Integer[] {1, 1});
    directions.add(new Integer[] {0, 1});
    directions.add(new Integer[] {-1, 1});
    directions.add(new Integer[] {-1, 0});
    directions.add(new Integer[] {-1, -1});
    directions.add(new Integer[] {0, -1});
    directions.add(new Integer[] {1, -1});

    for (Integer[] direction : directions) {
      int[] current = new int[] {king[0], king[1]};
      while (true) {
        int currentX = current[0] + direction[0];
        int currentY = current[1] + direction[1];
        current[0] = currentX;
        current[1] = currentY;
        if (currentX > 7 || currentX < 0 || currentY > 7 || currentY < 0)
          break;

        if (queenList.contains(currentX * 8 + currentY)) {
          List<Integer> item = new ArrayList<>();
          item.add(currentX);
          item.add(currentY);
          result.add(item);
          break;
        }
      }
    }
    return result;
  }

}

