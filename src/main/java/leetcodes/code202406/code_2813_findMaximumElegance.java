package leetcodes.code202406;

import static utils.arrayUtils.getIntDoubleArray;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
*
给你一个长度为 n 的二维整数数组 items 和一个整数 k 。

items[i] = [profiti, categoryi]，其中 profiti 和 categoryi 分别表示第 i 个项目的利润和类别。

现定义 items 的 子序列 的 优雅度 可以用 total_profit + distinct_categories^2 计算，
* 其中 total_profit 是子序列中所有项目的利润总和，distinct_categories 是所选子序列所含的所有类别中不同类别的数量。

你的任务是从 items 所有长度为 k 的子序列中，找出 最大优雅度 。

用整数形式表示并返回 items 中所有长度恰好为 k 的子序列的最大优雅度。

注意：数组的子序列是经由原数组删除一些元素（可能不删除）而产生的新数组，且删除不改变其余元素相对顺序。
*
* */


public class code_2813_findMaximumElegance {
  public static void main(String[] args) {
    code_2813_findMaximumElegance body = new code_2813_findMaximumElegance();
    Scanner sc = new Scanner(System.in);

    // 4 2 3 1 3 1 2 2 5 3
    // 3
    int[][] items = getIntDoubleArray();
    int k = sc.nextInt();

    System.out.println(body.findMaximumElegance(items, k));
  }

  public long findMaximumElegance(int[][] items, int k) {

    // 把利润从大到小排序
    Arrays.sort(items, (a, b) -> b[0] - a[0]);
    long ans = 0;
    long totalProfit = 0;
    Set<Integer> vis = new HashSet<>();
    Deque<Integer> duplicate = new ArrayDeque<>(); // 重复类别的利润

    for (int i = 0; i < items.length; i++) {
      int profit = items[i][0];
      int category = items[i][1];

      if (i < k) {
        totalProfit += profit; // 累加前 k 个项目的利润
        if (!vis.add(category)) { // 重复类别
          duplicate.push(profit);
        }
      } else if (!duplicate.isEmpty() && vis.add(category)) { // 之前没有的类别
        totalProfit += profit - duplicate.pop(); // 选一个重复类别中的最小利润替换
      } // else：比前面的利润小，而且类别还重复了，选它只会让 totalProfit 变小，vis.size() 不变，优雅度不会变大
      ans = Math.max(ans, totalProfit + (long) vis.size() * vis.size()); // 注意 1e5*1e5 会溢出
    }
    return ans;
  }
}

