package hard;

import static utils.utils.getIntArray;

import java.util.Scanner;

import code202311.code_0318_maxProduct;

/*
*
n 对情侣坐在连续排列的 2n 个座位上，想要牵到对方的手。

人和座位由一个整数数组 row 表示，其中 row[i] 是坐在第 i 个座位上的人的 ID。情侣们按顺序编号，第一对是 (0, 1)，第二对是 (2, 3)，以此类推，最后一对是 (2n-2, 2n-1)。

返回 最少交换座位的次数，以便每对情侣可以并肩坐在一起。 每次交换可选择任意两人，让他们站起来交换座位。



* */
public class code_0765_minSwapsCouples {
  public static void main(String[] args) {
    code_0765_minSwapsCouples body = new code_0765_minSwapsCouples();

    Scanner sc = new Scanner(System.in);

    int[] row = getIntArray(sc, null);

    int result = body.minSwapsCouples(row);
    System.out.println(result);
  }


  public int minSwapsCouples(int[] row) {
    int len = row.length;
    int N = len / 2;
    UnionFind unionFind = new UnionFind(N);
    for (int i = 0; i < len; i += 2) {
      unionFind.union(row[i] / 2, row[i + 1] / 2);
    }
    return N - unionFind.getCount();
  }

  private class UnionFind {

    private int[] parent;

    private int count;

    public int getCount() {
      return count;
    }

    public UnionFind(int n) {
      this.count = n;
      this.parent = new int[n];
      for (int i = 0; i < n; i++) {
        parent[i] = i;
      }
    }

    public int find(int x) {
      while (x != parent[x]) {
        parent[x] = parent[parent[x]];
        x = parent[x];
      }
      return x;
    }

    public void union(int x, int y) {
      int rootX = find(x);
      int rootY = find(y);
      if (rootX == rootY) {
        return;
      }

      parent[rootX] = rootY;
      count--;
    }
  }
}
