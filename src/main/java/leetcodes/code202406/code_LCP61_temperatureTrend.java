package leetcodes.code202406;

import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*
力扣城计划在两地设立「力扣嘉年华」的分会场，气象小组正在分析两地区的气温变化趋势，对于第 i ~ (i+1) 天的气温变化趋势，将根据以下规则判断：

    若第 i+1 天的气温 高于 第 i 天，为 上升 趋势
    若第 i+1 天的气温 等于 第 i 天，为 平稳 趋势
    若第 i+1 天的气温 低于 第 i 天，为 下降 趋势

已知 temperatureA[i] 和 temperatureB[i] 分别表示第 i 天两地区的气温。
* 组委会希望找到一段天数尽可能多，且两地气温变化趋势相同的时间举办嘉年华活动。请分析并返回两地气温变化趋势相同的最大连续天数。

*
* */


public class code_LCP61_temperatureTrend {
  public static void main(String[] args) {
    code_LCP61_temperatureTrend body = new code_LCP61_temperatureTrend();
    Scanner sc = new Scanner(System.in);

    // 21 18 18 18 31
    // 34 32 16 16 17

    //-14,7,-19,9,13,40,19,15,-18
    //3,16,28,32,25,12,13,-6,4
    int[] temperatureA = getIntArray(sc, ",");
    int[] temperatureB = getIntArray(sc, ",");

    System.out.println(body.temperatureTrend(temperatureA, temperatureB));
  }

  public int temperatureTrend(int[] temperatureA, int[] temperatureB) {
    int count = 0, max = 0, n = temperatureA.length;
    int[] cacheA = new int[n-1], cacheB = new int[n-1];

    for (int i = 1; i < n; i++) {
      if (temperatureA[i] != temperatureA[i - 1]) {
        cacheA[i-1] = temperatureA[i] > temperatureA[i - 1] ? 1 : -1;
      }
      if (temperatureB[i] != temperatureB[i - 1]) {
        cacheB[i-1] = temperatureB[i] > temperatureB[i - 1] ? 1 : -1;
      }
    }

    for (int i = 0; i < n-1; i++) {
      if (cacheA[i] == cacheB[i]) {
        count++;
        max = Math.max(max, count);
      } else {
        count = 0;
      }
    }
    return count;
  }

}

