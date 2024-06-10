package leetcodes.code202406;

import static utils.arrayUtils.getIntArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*
给定数组 people 。people[i]表示第 i 个人的体重 ，船的数量不限，每艘船可以承载的最大重量为 limit。

每艘船最多可同时载两人，但条件是这些人的重量之和最多为 limit。

返回 承载所有人所需的最小船数 。
*
* */


public class code_0881_numRescueBoats {
  public static void main(String[] args) {
    code_0881_numRescueBoats body = new code_0881_numRescueBoats();
    Scanner sc = new Scanner(System.in);

    // 3 2 2 1
    // 3
    int[] people = getIntArray(sc, " ");
    int limit = sc.nextInt();

    System.out.println(body.numRescueBoats(people, limit));
  }

  public int numRescueBoats(int[] people, int limit) {
    Arrays.sort(people);
    int n = people.length, result = 0, rightIndex = n - 1;
    int[] flag = new int[n];

    for (int i = 0; i < n; i++) {
      if (flag[i] == 1) {
        continue;
      }

      int now = people[i], max = limit - now;
      while (people[rightIndex] > max && rightIndex > i) {
        if (flag[rightIndex] == 0) {
          System.out.println(people[rightIndex]);
          flag[rightIndex] = 1;
          result++;
        }
        rightIndex--;
      }
      System.out.println(people[i] + " - " + people[rightIndex]);
      flag[rightIndex--] = 1;
      flag[i] = 1;
      result++;
    }
    System.out.println("---------------------------------------------");

    return result;
  }
}

