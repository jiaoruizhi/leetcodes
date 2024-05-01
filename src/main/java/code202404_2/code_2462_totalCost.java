package code202404_2;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/*
*
给你一个下标从 0 开始的整数数组 costs ，其中 costs[i] 是雇佣第 i 位工人的代价。

同时给你两个整数 k 和 candidates 。我们想根据以下规则恰好雇佣 k 位工人：

    总共进行 k 轮雇佣，且每一轮恰好雇佣一位工人。
    在每一轮雇佣中，从最前面 candidates 和最后面 candidates 人中选出代价最小的一位工人，
    如果有多位代价相同且最小的工人，选择下标更小的一位工人。

    比方说，costs = [3,2,7,7,1,2] 且 candidates = 2 ，第一轮雇佣中，我们选择第 4 位工人，因为他的代价最小 [3,2,7,7,1,2] 。
    第二轮雇佣，我们选择第 1 位工人，因为他们的代价与第 4 位工人一样都是最小代价，而且下标更小，[3,2,7,7,2] 。
    注意每一轮雇佣后，剩余工人的下标可能会发生变化。
    如果剩余员工数目不足 candidates 人，那么下一轮雇佣他们中代价最小的一人，如果有多位代价相同且最小的工人，选择下标更小的一位工人。
    一位工人只能被选择一次。

返回雇佣恰好 k 位工人的总代价。
*
* */
public class code_2462_totalCost {
  public static void main(String[] args) {
    code_2462_totalCost body = new code_2462_totalCost();
    Scanner sc = new Scanner(System.in);


    // 4 4 2 0 0 1 0 3 1 0 0 5 2 0 4 0 0 2

    // 17 12 10 2 7 2 11 20 8
    // 3
    // 4
    int[] costs = getIntArray(sc, " ");
    int k = sc.nextInt();
    int candidates = sc.nextInt();

    System.out.println(body.totalCost(costs, k, candidates));
  }

  public long totalCost(int[] costs, int k, int candidates) {
    int n = costs.length;
    long ans = 0;

    if (candidates * 2 + k > n) {
      Arrays.sort(costs);
      for (int i = 0; i < k; i++) {
        ans += costs[i];
      }
      return ans;
    }

    PriorityQueue<Integer> pre = new PriorityQueue<>();
    PriorityQueue<Integer> suf = new PriorityQueue<>();
    for (int i = 0; i < candidates; i++) {
      pre.offer(costs[i]);
      suf.offer(costs[n - 1 - i]);
    }

    int i = candidates;
    int j = n - 1 - candidates;
    while (k-- > 0) {
      if (pre.peek() <= suf.peek()) {
        ans += pre.poll();
        pre.offer(costs[i++]);
      } else {
        ans += suf.poll();
        suf.offer(costs[j--]);
      }
    }
    return ans;
  }
}

