package code202404_2;


import static utils.arrayUtils.getIntArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
*
给你一个下标从 0 开始的数组 mountain 。你的任务是找出数组 mountain 中的所有 峰值。

以数组形式返回给定数组中 峰值 的下标，顺序不限 。


    3 <= mountain.length <= 100
    1 <= mountain[i] <= 100



*
* */
public class code_2951_findPeaks {
  public static void main(String[] args) {
    code_2951_findPeaks body = new code_2951_findPeaks();
    Scanner sc = new Scanner(System.in);

    // 1 2 1 3 5 6 4
    int[] mountain = getIntArray(sc, " ");

    System.out.println(body.findPeaks(mountain).toString());
  }

  public List<Integer> findPeaks(int[] mountain) {
    int n = mountain.length;

    List<Integer> result = new ArrayList<Integer>();
    for (int i = 1; i < n - 1; i++) {
      int current = mountain[i];
      int next = mountain[i + 1];
      int last = mountain[i - 1];
      if (current > last && current > next) {
        result.add(i++);
      }
    }
    return result;
  }

}

