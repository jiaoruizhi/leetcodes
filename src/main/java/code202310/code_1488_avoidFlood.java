package code202310;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

/*
*

你的国家有无数个湖泊，所有湖泊一开始都是空的。当第 n 个湖泊下雨前是空的，那么它就会装满水。如果第 n 个湖泊下雨前是 满的 ，这个湖泊会发生 洪水 。你的目标是避免任意一个湖泊发生洪水。

给你一个整数数组 rains ，其中：

    rains[i] > 0 表示第 i 天时，第 rains[i] 个湖泊会下雨。
    rains[i] == 0 表示第 i 天没有湖泊会下雨，你可以选择 一个 湖泊并 抽干 这个湖泊的水。

请返回一个数组 ans ，满足：

    ans.length == rains.length
    如果 rains[i] > 0 ，那么ans[i] == -1 。
    如果 rains[i] == 0 ，ans[i] 是你第 i 天选择抽干的湖泊。

如果有多种可行解，请返回它们中的 任意一个 。如果没办法阻止洪水，请返回一个 空的数组 。

请注意，如果你选择抽干一个装满水的湖泊，它会变成一个空的湖泊。但如果你选择抽干一个空的湖泊，那么将无事发生。
* */
public class code_1488_avoidFlood {
  public static void main(String[] args) {
    code_1488_avoidFlood body = new code_1488_avoidFlood();
    Scanner sc = new Scanner(System.in);


    // 1 2 3 4
    // 1 2 0 0 2 1

    int[] nums = getIntArray(sc, null);

    System.out.println(body.avoidFlood(nums));
  }

  public int[] avoidFlood(int[] rains) {
    int len = rains.length;
    int[] ans = new int[len];
    TreeSet<Integer> sunny = new TreeSet<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    Arrays.fill(ans, 1);

    for (int i = 0; i < len; i++) {
      int isRain = rains[i];
      if (isRain == 0) {
        sunny.add(i);
      } else {
        ans[i] = -1;
        if (map.containsKey(isRain)) {
          //如果之前下过雨
          Integer n = sunny.ceiling(map.get(isRain));
          if (n == null)
            return new int[0];
          ans[n] = isRain;
          sunny.remove(n);
        }
        map.put(isRain, i);
      }
    }
    return ans;
  }

}

