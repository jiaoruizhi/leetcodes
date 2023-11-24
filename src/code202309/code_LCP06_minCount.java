package code202309;


import static utils.utils.getIntArray;
import static utils.utils.getIntDoubleArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*

桌上有 n 堆力扣币，每堆的数量保存在数组 coins 中。我们每次可以选择任意一堆，拿走其中的一枚或者两枚，求拿完所有力扣币的最少次数。

* */
public class code_LCP06_minCount {
  public static void main(String[] args) {
    code_LCP06_minCount body = new code_LCP06_minCount();


    Scanner sc = new Scanner(System.in);

    // 2 3 10
    int[] gem = getIntArray(sc, null);

    System.out.println(body.minCount(gem));
  }


  public int minCount(int[] gem) {
    int count = 0;
    for (int g : gem) {
      int k = g >> 1;
      count += g % 2 == 0 ? k : k + 1;
    }
    return count;
  }

}

