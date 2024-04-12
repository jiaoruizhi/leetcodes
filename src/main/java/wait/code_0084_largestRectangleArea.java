package wait;


import static utils.arrayUtils.getIntArray;

/*
*
* 给定 n 个非负整数，用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。

* 求在该柱状图中，能够勾勒出来的矩形的最大面积。


*
* */
public class code_0084_largestRectangleArea {
  public static void main(String[] args) {
    code_0084_largestRectangleArea body = new code_0084_largestRectangleArea();

    // 2 1 5 6 2 3
    int[] heights = getIntArray(null, null);
    System.out.println(body.largestRectangleArea(heights));
  }

  public int largestRectangleArea(int[] heights) {
    int left = 0, right = heights.length - 1;
    int max = 0;

    return 0;
  }
}
