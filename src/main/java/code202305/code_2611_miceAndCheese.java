package code202305;


import static utils.utils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*

有两只老鼠和 n 块不同类型的奶酪，每块奶酪都只能被其中一只老鼠吃掉。

下标为 i 处的奶酪被吃掉的得分为：

    如果第一只老鼠吃掉，则得分为 reward1[i] 。
    如果第二只老鼠吃掉，则得分为 reward2[i] 。

给你一个正整数数组 reward1 ，一个正整数数组 reward2 ，和一个非负整数 k 。

请你返回第一只老鼠恰好吃掉 k 块奶酪的情况下，最大 得分为多少。

*
*
* */
public class code_2611_miceAndCheese {
  public static void main(String[] args) {
    // 1 1 3 4
    // 4 4 1 1
    // 2
    Scanner sc = new Scanner(System.in);

    int[] reward1 = getIntArray(sc, null);
    int[] reward2 = getIntArray(sc, null);

    int k = sc.nextInt();
    System.out.println(miceAndCheese(reward1, reward2, k));
  }


  public static int miceAndCheese(int[] reward1, int[] reward2, int k) {
    int size = reward1.length;

    int[] distance = new int[size];
    for (int i = 0; i < reward1.length; i++) {
      distance[i] = reward1[i] - reward2[i];
    }
    Arrays.sort(distance);
    int sum = Arrays.stream(reward2).sum();
    for (int j = size - 1; j > size - 1 - k; j--) {
      sum += distance[j];
    }
    return sum;
  }
}
