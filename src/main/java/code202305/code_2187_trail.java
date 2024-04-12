package code202305;


import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*


给你一个数组 time ，其中 time[i] 表示第 i 辆公交车完成 一趟旅途 所需要花费的时间。

每辆公交车可以 连续 完成多趟旅途，也就是说，一辆公交车当前旅途完成后，可以 立马开始 下一趟旅途。每辆公交车 独立 运行，也就是说可以同时有多辆公交车在运行且互不影响。

给你一个整数 totalTrips ，表示所有公交车 总共 需要完成的旅途数目。请你返回完成 至少 totalTrips 趟旅途需要花费的 最少 时间。



*
*
* */
public class code_2187_trail {
  public static void main(String[] args) {
    //
    // 1,2,3

    Scanner sc = new Scanner(System.in);
    int[] data = getIntArray(sc, ",");
    int times = sc.nextInt();
    System.out.println(minTime(data, times));
  }


  // int[] time, int totalTrips
  public static long minTime(int[] time, int totalTrips) {
    Arrays.sort(time);
    long min = 1;
    long max = 1L * time[0] * totalTrips;
    while (min < max) {
      long currentTime = (max + min) / 2;
      long trips = 0;
      // 遍历每个车次需要完成的时间
      for(int t : time){
        if(currentTime < t){
          break;
        }
        // 记录当前时间能完成的趟数
        trips += currentTime / t;
      }
      if (trips >= totalTrips) {
        max = currentTime;
      } else {
        min = currentTime + 1;
      }
    }
    return min;
  }
}
