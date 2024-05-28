package leetcodes.code202404_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
*
给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。

你可以按 任何顺序 返回答案。
*
*
* */
public class code_0077_combine {
  public static void main(String[] args) {
    code_0077_combine body = new code_0077_combine();
    Scanner sc = new Scanner(System.in);

    // 4 2
    // 7 3
    int n = sc.nextInt();
    int k = sc.nextInt();

    System.out.println(body.combine(n, k).toString());
  }

  ArrayList<Integer> path = new ArrayList<Integer>();
  List<List<Integer>> res = new ArrayList<List<Integer>>();

  public List<List<Integer>> combine(int n, int k) {
    if (k <= 0 || n < k) {
      return res;
    }
    // 从 1 开始是题目的设定
    dfs(n, k, 1);
    return res;
  }

  private void dfs(int n, int k, int begin) {
    System.out.println(path.toString());
    // 递归终止条件是：path 的长度等于 k
    if (path.size() == k) {
      res.add(new ArrayList<>(path));
      return;
    }

    // 遍历可能的搜索起点
    for (int i = begin; i <= n; i++) {
      // 向路径变量里添加一个数
      path.add(i);
      // 下一轮搜索，设置的搜索起点要加 1，因为组合数理不允许出现重复的元素
      dfs(n, k, i + 1);
      // 重点理解这里：深度优先遍历有回头的过程，因此递归之前做了什么，递归之后需要做相同操作的逆向操作
      path.remove(path.size() - 1);
    }
  }
}

