package code202310;

import static utils.utils.getIntArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
*

给你一个正整数 n ，请你计算在 [1，n] 范围内能被 3、5、7 整除的所有整数之和。

返回一个整数，用于表示给定范围内所有满足约束条件的数字之和。
* */
public class code_2652_sumOfMultiples {
  public static void main(String[] args) {
    code_2652_sumOfMultiples body = new code_2652_sumOfMultiples();
    Scanner sc = new Scanner(System.in);

    // 2 1 2 1 4
    int nums = sc.nextInt();

    System.out.println(body.sumOfMultiples(nums));
  }

  public int sumOfMultiples(int n) {
    int result = 0;
    for (int i = 1; i <= n; i++) {
        if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
          result += i;
        }
    }
    return result;
  }

}

