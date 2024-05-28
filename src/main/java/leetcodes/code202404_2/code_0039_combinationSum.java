package leetcodes.code202404_2;

import static utils.arrayUtils.getIntArray;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

/*
*
给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，
* 找出 candidates 中可以使数字和为目标数 target 的 所有 不同组合 ，并以列表形式返回。
* 你可以按 任意顺序 返回这些组合。

candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。

对于给定的输入，保证和为 target 的不同组合数少于 150 个。
* */
public class code_0039_combinationSum {
  public static void main(String[] args) {
    code_0039_combinationSum body = new code_0039_combinationSum();
    Scanner sc = new Scanner(System.in);

    // 2 3 6 7
    int[] candidates = getIntArray(sc, " ");

    // 7
    int target = sc.nextInt();
    System.out.println(body.combinationSum(candidates, target).toString());
  }

  List<List<Integer>> res = new ArrayList<>();
  Deque<Integer> path = new ArrayDeque<>();

  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    int len = candidates.length;
    if (len == 0) {
      return res;
    }

    dfs(candidates, 0, len, target);
    return res;
  }

  /**
   * @param candidates 候选数组
   * @param begin      搜索起点
   * @param len        冗余变量，是 candidates 里的属性，可以不传
   * @param target     每减去一个元素，目标值变小
   */
  public void dfs(int[] candidates, int begin, int len, int target) {
    // target 为负数和 0 的时候不再产生新的孩子结点
    if (target < 0) {
      return;
    }
    if (target == 0) {
      res.add(new ArrayList<>(path));
      return;
    }

    // 重点理解这里从 begin 开始搜索的语意
    for (int i = begin; i < len; i++) {
      path.addLast(candidates[i]);

      // 注意：由于每一个元素可以重复使用，下一轮搜索的起点依然是 i，这里非常容易弄错
      dfs(candidates, i, len, target - candidates[i]);

      // 状态重置
      path.removeLast();
    }
  }
}

