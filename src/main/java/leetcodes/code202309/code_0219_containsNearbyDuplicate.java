package leetcodes.code202309;


import static utils.arrayUtils.getIntArray;

import java.util.HashMap;
import java.util.Scanner;

/*
*

现在你总共有 numCourses 门课需要选，记为 0 到 numCourses - 1。
给你一个数组 prerequisites ，其中 prerequisites[i] = [ai, bi] ，表示在选修课程 ai 前 必须 先选修 bi 。

    例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示：[0,1] 。

返回你为了学完所有课程所安排的学习顺序。可能会有多个正确的顺序，你只要返回 任意一种 就可以了。如果不可能完成所有课程，返回 一个空数组 。

* */
public class code_0219_containsNearbyDuplicate {
  public static void main(String[] args) {
    code_0219_containsNearbyDuplicate body = new code_0219_containsNearbyDuplicate();
    Scanner sc = new Scanner(System.in);

    // 1,2,3,1,2,3
    int[] nums = getIntArray(sc, ",");
    // 3
    int k = sc.nextInt();

    System.out.println(body.containsNearbyDuplicate(nums, k));
  }


  public boolean containsNearbyDuplicate(int[] nums, int k) {
    HashMap<Integer, Integer> lastIndex = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int value = nums[i];
      int li = lastIndex.getOrDefault(value, -1);
      if (li != -1 && i - li <= k) return true;
      lastIndex.put(value, i);
    }
    return false;
  }

}

