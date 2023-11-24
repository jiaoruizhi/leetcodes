package code202311;

import static utils.utils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ConcurrentHashMap;

import utils.dto.Node;

/*
*

给你两个正整数数组 spells 和 potions ，长度分别为 n 和 m ，其中 spells[i] 表示第 i 个咒语的能量强度，potions[j] 表示第 j 瓶药水的能量强度。

同时给你一个整数 success 。一个咒语和药水的能量强度 相乘 如果 大于等于 success ，那么它们视为一对 成功 的组合。

请你返回一个长度为 n 的整数数组 pairs，其中 pairs[i] 是能跟第 i 个咒语成功组合的 药水 数目。
*
* */
public class code_2300_successfulPairs {
  public static void main(String[] args) {
    code_2300_successfulPairs body = new code_2300_successfulPairs();
    Scanner sc = new Scanner(System.in);


    //spells = [5,1,3], potions = [1,2,3,4,5], success = 7
    //5 1 3
    // 1 2 3 4 5
    //7
    int[] spells = getIntArray(sc, null);
    int[] potions = getIntArray(sc, null);

    long success = sc.nextLong();

    int[] result = body.successfulPairs(spells, potions, success);
    System.out.println(result);
  }

  public int[] successfulPairs(int[] spells, int[] potions, long success) {
    Arrays.sort(potions);
    int n = spells.length;
    int m = potions.length;

    int maxPotion = potions[m - 1];
    int[] cache = new int[maxPotion + 1];
    int currentIndex = 0;
    int rest = m;
    for (int i = 0; i <= maxPotion; i++) {
      while (i > potions[currentIndex]) {
        currentIndex++;
        rest--;
      }
      cache[i] = rest;
    }

    int[] result = new int[n];

    for (int i = 0; i < n; i++) {
      int now = spells[i];
      int target = (int) Math.ceil((double) success / now);
      int number = target >= cache.length ? 0 : cache[target];
      result[i] = number;
    }
    return result;
  }

}

