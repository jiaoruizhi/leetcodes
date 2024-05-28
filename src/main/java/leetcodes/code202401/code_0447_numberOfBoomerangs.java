package leetcodes.code202401;

import static utils.arrayUtils.getIntDoubleArray;

import java.util.HashMap;

/*
*

给定平面上 n 对 互不相同 的点 points ，其中 points[i] = [xi, yi] 。
* 回旋镖 是由点 (i, j, k) 表示的元组 ，
* 其中 i 和 j 之间的距离和 i 和 k 之间的欧式距离相等（需要考虑元组的顺序）。

返回平面上所有回旋镖的数量。

* */
public class code_0447_numberOfBoomerangs {
  public static void main(String[] args) {
    code_0447_numberOfBoomerangs body = new code_0447_numberOfBoomerangs();

    // 3 2 0 0 1 0 2 0
    // 5 2 0 0 1 0 -1 0 0 1 0 -1
    // [[0,0],[1,0],[-1,0],[0,1],[0,-1]]
    int[][] courses = getIntDoubleArray();

    System.out.println(body.numberOfBoomerangs(courses));
  }

  // O(n) = log(k)
  public int numberOfBoomerangs(int[][] points) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int result = 0;
    int m = points.length;
    for (int i = 0; i < m; i++) {
      map.clear();
      int[] outCache = points[i];
      for (int j = 0; j < m; j++) {
        if (i == j) continue;

        int[] inCache = points[j];

        int x = outCache[0] - inCache[0];
        int y = outCache[1] - inCache[1];
        int dis = x * x + y * y;
        map.put(dis, map.getOrDefault(dis, 0) + 1);
      }
      for (int val : map.values()) {
        result += val * (val - 1);
      }
    }
    return result;
  }

}

