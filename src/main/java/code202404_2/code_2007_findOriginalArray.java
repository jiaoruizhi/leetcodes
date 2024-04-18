package code202404_2;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
*
一个整数数组 original 可以转变成一个 双倍 数组 changed ，转变方式为将 original 中每个元素 值乘以 2 加入数组中，然后将所有元素 随机打乱 。

给你一个数组 changed ，如果 change 是 双倍 数组，那么请你返回 original数组，否则请返回空数组。original 的元素可以以 任意 顺序返回。
*
*
* */
public class code_2007_findOriginalArray {
  public static void main(String[] args) {
    code_2007_findOriginalArray body = new code_2007_findOriginalArray();
    Scanner sc = new Scanner(System.in);

    // 1,3,4,2,6,8
    // 6,3,0,1
    // 1
    int[] nums = getIntArray(sc, ",");
    System.out.println(Arrays.toString(body.findOriginalArray(nums)));
  }

  public int[] findOriginalArray(int[] changed) {
    Arrays.sort(changed);
    Map<Integer, Integer> count = new HashMap<>();
    for (int a : changed) {
      count.put(a, count.getOrDefault(a, 0) + 1);
    }
    int[] res = new int[changed.length / 2];
    int i = 0;
    for (int a : changed) {
      if (count.get(a) == 0) {
        continue;
      }
      count.put(a, count.get(a) - 1);
      if (count.getOrDefault(a * 2, 0) == 0) {
        return new int[0];
      }
      count.put(a * 2, count.get(a * 2) - 1);
      res[i++] = a;
    }
    return res;
  }
}

