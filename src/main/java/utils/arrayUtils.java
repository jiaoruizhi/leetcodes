package utils;

import java.util.Scanner;

public class arrayUtils {

  public static int[] getIntArray(Scanner scanner, String split) {
    split = split == null ? " " : split;

    Scanner sc = scanner != null ? scanner : new Scanner(System.in);
    String line = sc.nextLine();
    String[] str = line.split(split);
    int[] ret = new int[str.length];
    for (int i = 0; i < ret.length; i++) {
      int a = Integer.parseInt(str[i]);
      ret[i] = a;
    }
    return ret;
  }

  public static String[] getStringArray(Scanner scanner, String split) {
    split = split == null ? " " : split;

    Scanner sc = scanner != null ? scanner : new Scanner(System.in);
    String line = sc.nextLine();
    String[] str = line.split(split);
    return str;
  }


  /*

  3 5
  1 1 1 1 1
  1 1 1 1 1
  1 1 1 1 1

  */

  public static int[][] getIntDoubleArray() {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int columns = sc.nextInt();

    int[][] data = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        int cache = sc.nextInt();
        data[i][j] = cache;
      }
    }

    return data;
  }

  public static char[][] getCharDoubleArray() {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int columns = sc.nextInt();

    char[][] data = new char[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        char cache = sc.next().charAt(0);
        data[i][j] = cache;
      }
    }

    return data;
  }
}
