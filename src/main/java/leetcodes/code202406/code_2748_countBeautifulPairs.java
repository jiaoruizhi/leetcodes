package leetcodes.code202406;

import static utils.arrayUtils.getIntArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/*
*
给你一个下标从 0 开始的整数数组 nums 。如果下标对 i、j 满足 0 ≤ i < j < nums.length ，
* 如果 nums[i] 的 第一个数字 和 nums[j] 的 最后一个数字 互质 ，则认为 nums[i] 和 nums[j] 是一组 美丽下标对 。

返回 nums 中 美丽下标对 的总数目。

对于两个整数 x 和 y ，如果不存在大于 1 的整数可以整除它们，则认为 x 和 y 互质 。
* 换而言之，如果 gcd(x, y) == 1 ，则认为 x 和 y 互质，其中 gcd(x, y) 是 x 和 y 的 最大公因数 。



*
* */


public class code_2748_countBeautifulPairs {
  public static void main(String[] args) {
    code_2748_countBeautifulPairs body = new code_2748_countBeautifulPairs();
    Scanner sc = new Scanner(System.in);

    // 2 5 1 4
    // 31 25 72 79 74
    int[] candyType = getIntArray(sc, " ");

    System.out.println(body.countBeautifulPairs(candyType));
  }

  HashMap<Integer, ArrayList<Integer>> data = new HashMap<Integer, ArrayList<Integer>>() {{
    put(1, new ArrayList<Integer>(List.of(new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9})));
    put(2, new ArrayList<Integer>(List.of(new Integer[] {1, 3, 5, 7, 9})));
    put(3, new ArrayList<Integer>(List.of(new Integer[] {1, 2, 4, 5, 7, 8})));
    put(4, new ArrayList<Integer>(List.of(new Integer[] {1, 3, 5, 7, 9})));
    put(5, new ArrayList<Integer>(List.of(new Integer[] {1, 2, 3, 4, 6, 7, 8, 9})));
    put(6, new ArrayList<Integer>(List.of(new Integer[] {1, 5, 7})));
    put(7, new ArrayList<Integer>(List.of(new Integer[] {1, 2, 3, 4, 5, 6, 8, 9})));
    put(8, new ArrayList<Integer>(List.of(new Integer[] {1, 3, 5, 7, 9})));
    put(9, new ArrayList<Integer>(List.of(new Integer[] {1, 2, 4, 5, 7, 8})));
  }};

  public int countBeautifulPairs(int[] nums) {
    int count = 0, n = nums.length;
    int[][] cache = new int[n][2];
    for (int i = 0; i < n; i++) {
      cache[i][0] = getHead(nums[i]);
      cache[i][1] = getTail(nums[i]);
    }
    for (int i = 0; i < nums.length - 1; i++) {
      for (int j = i+1; j < nums.length; j++) {
        int a = cache[i][0], b = cache[j][1];
        if (data.get(a).contains(b)) {
          count++;
        }
      }
    }
    return count;
  }

  public int getHead(int num) {
    int result = num;
    while (result > 9 || result <= 0) {
      result = num / 10;
    }
    return result;
  }

  public int getTail(int num) {
    return num % 10;
  }
}

