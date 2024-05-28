package leetcodes.code202309;


import static utils.arrayUtils.getIntDoubleArray;

import java.util.Arrays;
import java.util.PriorityQueue;

/*
*

这里有 n 门不同的在线课程，按从 1 到 n 编号。给你一个数组 courses ，其中 courses[i] = [durationi, lastDayi]
* 表示第 i 门课将会 持续 上 duration[i] 天课，并且必须在不晚于 lastDay[i] 的时候完成。

你的学期从第 1 天开始。且不能同时修读两门及两门以上的课程。

返回你最多可以修读的课程数目。
*
* 输入：courses = [[100, 200], [200, 1300], [1000, 1250], [2000, 3200]]
输出：3
*
* */
public class code_0630_scheduleCourse {
  public static void main(String[] args) {
    code_0630_scheduleCourse body = new code_0630_scheduleCourse();

    // 20
    // 4 2 100 200 200 1300 1000 1250 2000 3200
    int[][] courses = getIntDoubleArray();

    System.out.println(Arrays.toString(body.scheduleCourse(courses)));
  }


  public int[] scheduleCourse(int[][] courses) {

    int[] lastStartDay = new int[courses.length];
    for (int i = 0; i < courses.length; i++) {
      int[] course = courses[i];
      lastStartDay[i] = course[1] - course[0];
    }

    return new int[0];
  }

  public int scheduleCourse2(int[][] courses) {
    Arrays.sort(courses, (a, b) -> a[1] - b[1]);

    PriorityQueue<Integer> q = new PriorityQueue<Integer>((a, b) -> b - a);
    // 优先队列中所有课程的总时间
    int total = 0;

    for (int[] course : courses) {
      int ti = course[0], di = course[1];
      if (total + ti <= di) {
        total += ti;
        q.offer(ti);
      } else if (!q.isEmpty() && q.peek() > ti) {
        total -= q.poll() - ti;
        q.offer(ti);
      }
    }

    return q.size();
  }


}

