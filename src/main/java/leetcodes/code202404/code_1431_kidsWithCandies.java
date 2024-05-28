package leetcodes.code202404;

import static utils.arrayUtils.getIntArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
*
* 给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。

对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，
* 此孩子有 最多 的糖果。注意，允许有多个孩子同时拥有 最多 的糖果数目


*
*
* */
public class code_1431_kidsWithCandies {
  public static void main(String[] args) {
    code_1431_kidsWithCandies body = new code_1431_kidsWithCandies();
    Scanner sc = new Scanner(System.in);

    // 2 3 5 1 3
    int[] candies = getIntArray(sc, " ");
    // 3
    int extraCandies = sc.nextInt();

    List<Boolean> result = body.kidsWithCandies(candies, extraCandies);
    System.out.println(result.toArray());
  }


  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    int n = candies.length;
    List<Boolean> result = new ArrayList<Boolean>();
    int max = -1;

    for (int i = 0; i < n; i++) {
      max = Math.max(max, candies[i]);
    }

    for (int i = 0; i < n; i++) {
      result.add(candies[i] + extraCandies >= max);
    }
    return result;
  }
}
