package leetcodes.code202406;

import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*
Alice 有 n 枚糖，其中第 i 枚糖的类型为 candyType[i] 。Alice 注意到她的体重正在增长，所以前去拜访了一位医生。

医生建议 Alice 要少摄入糖分，只吃掉她所有糖的 n / 2 即可（n 是一个偶数）。
* Alice 非常喜欢这些糖，她想要在遵循医生建议的情况下，尽可能吃到最多不同种类的糖。

给你一个长度为 n 的整数数组 candyType ，返回： Alice 在仅吃掉 n / 2 枚糖的情况下，可以吃到糖的 最多 种类数。
*
*
*
    n == candyType.length
    2 <= n <= 104
    n 是一个偶数
    -105 <= candyType[i] <= 105

*
* */


public class code_0575_distributeCandies {
  public static void main(String[] args) {
    code_0575_distributeCandies body = new code_0575_distributeCandies();
    Scanner sc = new Scanner(System.in);

    // 1 1 2 2 3 3
    int[] candyType = getIntArray(sc, " ");

    System.out.println(body.distributeCandies(candyType));
  }

  public int distributeCandies(int[] candyType) {
    int[] data = new int[200001];
    int k = 100000, n = candyType.length, max = n >> 1, result = 0;

    for (int i = 0; i < n; i++) {
      if (data[candyType[i] + k] == 0) {
        result++;
      }
      data[candyType[i] + k]++;
    }
    return Math.min(result, max);
  }
}

