package code202005;

import java.util.Date;
import java.util.Scanner;

/*
 *
 * 在一个由 0 和 1 组成的二维矩阵内，找到只包含 1 的最大正方形，并返回其面积。
 *
 *
 * */
public class code_0221_maximalSquare {
  public static void main(String[] args) {
    char[][] get = getdata();
    System.out.println("输出结束");
    long startTime = new Date().getTime();
    int large = maximalSquare(get);
    long endTime = new Date().getTime();
    System.out.println(large);
    System.out.println("本程序运行 " + (endTime - startTime) + " 毫秒完成。");



  }

  private static char[][] getdata() {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    char[][] ret = new char[num1][num2];
    for (int i = 0; i < num1; i++) {
      for (int j = 0; j < num2; j++) {
        ret[i][j] = sc.next().toCharArray()[0];
      }
    }
    return ret;
  }

  public static int maximalSquare(char[][] matrix) {
    int ret = 0;
    int columns = matrix.length, rows = matrix[0].length;

    int[][] index = new int[columns][rows];
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return ret;
    }


    for (int y = 0; y < rows; y++) {
      for (int x = 0; x < columns; x++) {
        int n = matrix[x][y];
        if (x == 0 || y == 0) {
          if (n == '0') {
            index[x][y] = 0;
          } else if (n == '1') {
            index[x][y] = 1;
          }
        } else {
          int a, b, c;
          a = index[x - 1][y - 1];
          b = index[x - 1][y];
          c = index[x][y - 1];

          if (n == '0') {
            index[x][y] = 0;
          }
          if (n == '1') {
            index[x][y] = mymin(a, b, c) + 1;
          }
        }
        ret = Math.max(ret, index[x][y]);

      }
    }
    for (int[] i : index) {
      for (int a : i) {
        System.out.print(a + "  ");
      }
      System.out.println();
    }
    return ret * ret;

  }

  private static int mymin(int a, int b, int c) {
    return Math.min(Math.min(a, b), c);
  }

    /*
    4
    0 1 1 0
    1 1 1 1
    0 1 1 1
    0 1 1 0

5
1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0

     */
}
