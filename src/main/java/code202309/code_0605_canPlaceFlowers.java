package code202309;

import static utils.utils.getIntArray;
import static utils.utils.getIntDoubleArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
*

假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。

给你一个整数数组 flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。另有一个数 n ，
* 能否在不打破种植规则的情况下种入 n 朵花？能则返回 true ，不能则返回 false 。

* */
public class code_0605_canPlaceFlowers {
  public static void main(String[] args) {
    code_0605_canPlaceFlowers body = new code_0605_canPlaceFlowers();
    Scanner sc = new Scanner(System.in);


    // 1 0 0 0 1
    // 2
    int[] flowerbed = getIntArray(sc, null);

    int n = sc.nextInt();

    System.out.println(body.canPlaceFlowers(flowerbed, n));
  }


  public boolean canPlaceFlowers(int[] flowerbed, int n) {
    for (int i = 0, len = flowerbed.length; i < len && n > 0; ) {
      if (flowerbed[i] == 1) {
        i += 2;
      } else if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
        n--;
        i += 2;
      } else {
        i += 3;
      }
    }
    return n <= 0;
  }
}

