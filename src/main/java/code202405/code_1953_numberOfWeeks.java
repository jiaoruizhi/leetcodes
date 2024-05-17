package code202405;

import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
*
给你 n 个项目，编号从 0 到 n - 1 。同时给你一个整数数组 milestones ，其中每个 milestones[i] 表示第 i 个项目中的阶段任务数量。

你可以按下面两个规则参与项目中的工作：

    每周，你将会完成 某一个 项目中的 恰好一个 阶段任务。你每周都 必须 工作。
    在 连续的 两周中，你 不能 参与并完成同一个项目中的两个阶段任务。

一旦所有项目中的全部阶段任务都完成，或者仅剩余一个阶段任务都会导致你违反上面的规则，
* 那么你将 停止工作 。注意，由于这些条件的限制，你可能无法完成所有阶段任务。

返回在不违反上面规则的情况下你 最多 能工作多少周。
*
* */
public class code_1953_numberOfWeeks {
  public static void main(String[] args) {
    code_1953_numberOfWeeks body = new code_1953_numberOfWeeks();
    Scanner sc = new Scanner(System.in);

    // 1 2 3
    // 5 2 1
    int[] milestones = getIntArray(sc, " ");

    System.out.println(body.numberOfWeeks(milestones));
  }

  public long numberOfWeeks(int[] milestones) {
    long s = 0;
    int m = 0;
    for (int x : milestones) {
      s += x;
      m = Math.max(m, x);
    }
    return m > s - m + 1 ? (s - m) * 2 + 1 : s;
  }
}

