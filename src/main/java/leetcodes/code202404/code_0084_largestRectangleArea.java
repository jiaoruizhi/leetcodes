package leetcodes.code202404;


import static utils.arrayUtils.getIntArray;

import java.util.ArrayDeque;
import java.util.Deque;


/*
  给定 n 个非负整数，用来表示柱状图中各个柱子的高度。
  每个柱子彼此相邻，且宽度为 1 。
  求在该柱状图中，能够勾勒出来的矩形的最大面积。
 */


public class code_0084_largestRectangleArea {
  public static void main(String[] args) {
    code_0084_largestRectangleArea body = new code_0084_largestRectangleArea();

    // 2 1 5 6 2 3
    int[] heights = getIntArray(null, null);
    System.out.println(body.largestRectangleArea(heights));
  }

  public int largestRectangleArea(int[] heights) {
    int length = heights.length;
    if (length == 0) {
      return 0;
    }
    if (length == 1) {
      return heights[0];
    }

    int area = 0;
    int[] newHeights = new int[length + 2];
    System.arraycopy(heights, 0, newHeights, 1, length);
    length += 2;

    Deque<Integer> stack = new ArrayDeque<>();
    stack.add(0);
    for (int i = 1; i < length; i++) {
      while (newHeights[stack.peekLast()] > newHeights[i]) {
        int height = newHeights[stack.removeLast()];
        int width = i - stack.peekLast() - 1;
        area = Math.max(area, height * width);
      }
      stack.add(i);
    }
    return area;
  }
}
