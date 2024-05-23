package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listUtils {

  public static List<Integer> getIntList(Scanner scanner, String split) {
    split = split == null ? " " : split;

    Scanner sc = scanner != null ? scanner : new Scanner(System.in);
    String line = sc.nextLine();
    String[] str = line.split(split);
    List<Integer> result = new ArrayList<Integer>();
    for (int i = 0; i < str.length; i++) {
      int a = Integer.parseInt(str[i]);
      result.add(a);
    }
    return result;
  }
}
