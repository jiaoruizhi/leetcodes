package code202405;

import static utils.arrayUtils.getIntArray;
import static utils.arrayUtils.getStringArray;

import java.util.Scanner;

/*
*
给你一个下标从 0 开始的字符串数组 garbage ，其中 garbage[i] 表示第 i 个房子的垃圾集合。
* garbage[i] 只包含字符 'M' ，'P' 和 'G' ，但可能包含多个相同字符，每个字符分别表示一单位的金属、纸和玻璃。
* 垃圾车收拾 一 单位的任何一种垃圾都需要花费 1 分钟。

同时给你一个下标从 0 开始的整数数组 travel ，其中 travel[i] 是垃圾车从房子 i 行驶到房子 i + 1 需要的分钟数。

城市里总共有三辆垃圾车，分别收拾三种垃圾。每辆垃圾车都从房子 0 出发，按顺序 到达每一栋房子。但它们 不是必须 到达所有的房子。

任何时刻只有 一辆 垃圾车处在使用状态。当一辆垃圾车在行驶或者收拾垃圾的时候，另外两辆车 不能 做任何事情。

请你返回收拾完所有垃圾需要花费的 最少 总分钟数。
*
*
* */
public class code_2391_garbageCollection {
  public static void main(String[] args) {
    code_2391_garbageCollection body = new code_2391_garbageCollection();
    Scanner sc = new Scanner(System.in);

    // G P GP GG
    String[] garbage = getStringArray(sc, " ");
    // 2 4 3
    int[] travel = getIntArray(sc, " ");

    // 2 2 2 2 2
    // 8

    // 1000000000 1000000000 1000000000 1000000000
    // -294967296
    System.out.println(body.garbageCollection(garbage, travel));
  }

  public int garbageCollection(String[] garbage, int[] travel) {
    int ans = 0;
    for (String g : garbage) {
      ans += g.length();
    }

    for (int t : travel) {
      ans += t * 3;
    }

    for (char c : new char[] {'M', 'P', 'G'}) {
      for (int i = garbage.length - 1; i > 0 && garbage[i].indexOf(c) < 0; i--) {
        ans -= travel[i - 1]; // 没有垃圾 c，多跑了
      }
    }
    return ans;
  }
}

