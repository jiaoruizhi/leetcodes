package code202310;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*

给你一个整数数组 citations ，其中 citations[i] 表示研究者的第 i 篇论文被引用的次数。计算并返回该研究者的 h 指数。

根据维基百科上 h 指数的定义：h 代表“高引用次数” ，一名科研人员的 h 指数 是指他（她）至少发表了 h 篇论文，
* 并且每篇论文 至少 被引用 h 次。如果 h 有多种可能的值，h 指数 是其中最大的那个。
* */
public class code_0274_hIndex {
  public static void main(String[] args) {
    code_0274_hIndex body = new code_0274_hIndex();
    Scanner sc = new Scanner(System.in);


    // 3 0 6 1 5
    // 3 1 1
    int[] nums = getIntArray(sc, null);

    System.out.println(body.hIndex(nums));
  }

  public int hIndex(int[] citations) {
    Arrays.sort(citations);
    int h = 0, i = citations.length - 1;
    while (i >= 0 && citations[i] > h) {
      h++;
      i--;
    }
    return h;
  }
}

