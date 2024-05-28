package leetcodes.code202404_2;

import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*
有一个书店老板，他的书店开了 n 分钟。每分钟都有一些顾客进入这家商店。

给定一个长度为 n 的整数数组 customers ，其中 customers[i] 是在第 i 分钟开始时进入商店的顾客数量，所有这些顾客在第 i 分钟结束后离开。

在某些时候，书店老板会生气。 如果书店老板在第 i 分钟生气，那么 grumpy[i] = 1，否则 grumpy[i] = 0。

当书店老板生气时，那一分钟的顾客就会不满意，若老板不生气则顾客是满意的。

书店老板知道一个秘密技巧，能抑制自己的情绪，可以让自己连续 minutes 分钟不生气，但却只能使用一次。

请你返回 这一天营业下来，最多有多少客户能够感到满意 。
*
*
* */
public class code_1052_maxSatisfied {
  public static void main(String[] args) {
    code_1052_maxSatisfied body = new code_1052_maxSatisfied();
    Scanner sc = new Scanner(System.in);

    // 1 0 1 2 1 1 7 5
    int[] customers = getIntArray(sc, " ");

    // 0 1 0 1 0 1 0 1
    int[] grumpy = getIntArray(sc, " ");

    // 3
    int minutes = sc.nextInt();
    System.out.println(body.maxSatisfied(customers, grumpy, minutes));
  }

  public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
    int currentMax = 0, length = customers.length;
    int[] notData = new int[length];
    for (int i = 0; i < length; i++) {
      if (grumpy[i] == 0) {
        currentMax += customers[i];
      } else {
        notData[i] = customers[i];
      }
    }

    int maxChange = 0, cache = 0, left = 0, right = minutes - 1;
    for (int i = 0; i <= right; i++) {
      cache += notData[i];
    }
    maxChange = cache;
    while (right < length - 1) {
      cache = cache + notData[right + 1] - notData[left];
      left++;
      right++;
      if (cache > maxChange) {
        maxChange = cache;
      }
    }

    return currentMax + maxChange;
  }
}

