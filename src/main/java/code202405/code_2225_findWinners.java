package code202405;

import static utils.arrayUtils.getIntDoubleArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/*
*
给你一个整数数组 matches 其中 matches[i] = [winneri, loseri] 表示在一场比赛中 winneri 击败了 loseri 。

返回一个长度为 2 的列表 answer ：

    answer[0] 是所有 没有 输掉任何比赛的玩家列表。
    answer[1] 是所有恰好输掉 一场 比赛的玩家列表。

两个列表中的值都应该按 递增 顺序返回。

注意：

    只考虑那些参与 至少一场 比赛的玩家。
    生成的测试用例保证 不存在 两场比赛结果 相同 。

*
* */
public class code_2225_findWinners {
  public static void main(String[] args) {
    code_2225_findWinners body = new code_2225_findWinners();

    // 10 2 10 9 1 3 2 3 3 6 5 6 5 7 4 5 4 8 4 9 10 4
    // 1 2 1 100001
    // [[1,3],[2,3],[3,6],[5,6],[5,7],[4,5],[4,8],[4,9],[10,4],[10,9]]
    int[][] matches = getIntDoubleArray();

    System.out.println(body.findWinners(matches));
  }

  HashMap<Integer, Integer> loseMap = new HashMap();
  HashSet<Integer> participate = new HashSet<>();
  public List<List<Integer>> findWinners(int[][] matches) {
    List<List<Integer>> result = new ArrayList<>();
    result.add(new ArrayList<>());
    result.add(new ArrayList<>());

    for (int[] current : matches) {
      int winner = current[0], loser = current[1];
      participate.add(winner);
      participate.add(loser);
      loseMap.put(loser, loseMap.getOrDefault(loser, 0) + 1);
    }

    for (Integer i : participate) {
      int times = loseMap.getOrDefault(i, 0);
      if (times == 0) {
        result.get(0).add(i);
      }
      if (times == 1) {
        result.get(1).add(i);
      }
    }

    return result;
  }
}

