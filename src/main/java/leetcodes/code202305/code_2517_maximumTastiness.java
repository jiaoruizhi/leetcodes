package leetcodes.code202305;


import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*
给你一个正整数数组 price ，其中 price[i] 表示第 i 类糖果的价格，另给你一个正整数 k 。

商店组合 k 类 不同 糖果打包成礼盒出售。礼盒的 甜蜜度 是礼盒中任意两种糖果 价格 绝对差的最小值。

返回礼盒的 最大 甜蜜度。


*
* */
public class code_2517_maximumTastiness {
  public static void main(String[] args) {
    //
    // 13,5,1,8,21,2

    Scanner sc = new Scanner(System.in);


    int[] data = getIntArray(sc, ",");

    int k = sc.nextInt();
    System.out.println(maximumTastiness(data, k));
  }


  public static int maximumTastiness(int[] data, int k) {
    Arrays.sort(data);

    int min = 0;
    int max = data[data.length - 1];


    while (min < max) {
      int mid = (max + min + 1) / 2;
      boolean isTooSmall = checkIsTooSmall(data, k, mid);
      if (isTooSmall) {
        min = mid;
      } else {
        max = mid - 1;
      }
    }

    return min;
  }

  public static boolean checkIsTooSmall(int[] data, int k, int mid) {
    int i = 0;
    int count = 1;
    for (int j = 0; j < data.length; j++) {
      if (data[j] - data[i] >= mid) {
        i = j;
        count++;
      }
    }
    return count >= k;
  }
}
