package meeting20231226;

import java.util.Scanner;

/*
*

1 一个小区里有n个居民，第一天有k个传染病感染者，感染者需要转运到医院隔离和治疗，
*
* 该小区第一天的转运感染者的能力是p个人，第二天转运能力是p-1人，第三天转运能力是p-2人，以此类推。
* 如果感染者当天没有转运出小区，则每一个感染者会在当天午夜12点感染1个人。请问这个小区需要多少天感染者能清零。用Java/JS/TS/C++语言实现求清零天数函数。
要求：
(1) 命名一个合适的函数名称，实现完整的函数
(2) 按照你平时的编程习惯，在你认为需要注释处写上相应的注释
(3) 代码行数尽可能少，代码运行复杂度尽可能小
(4) 写出你实现代码的算法复杂度o(n)
给两组数让候选人跑一下代码给结果：
*
*  若最后无法清零，返回 -1
*
* */
public class meeting_20231226_1 {
  public static void main(String[] args) {
    meeting_20231226_1 body = new meeting_20231226_1();
    Scanner sc = new Scanner(System.in);

    // n   k   p
    //

    //1、给出n=500, k=30, p=5, 输出？
    //  给出n=500, k=30, p=16, 输出？

    int n = sc.nextInt();
    int k = sc.nextInt();
    int p = sc.nextInt();

    System.out.println(body.clearSeekTime(n, k, p));
  }

  // O(n) = log(k)
  public int clearSeekTime(int n, int k, int p) {
    int total = n, seek = k, translatePower = p, day = 0;

    while (seek > 0) {
      day++;
      int rest = seek - translatePower;
      total -= translatePower;
      if (rest > translatePower) return -1;
      if (seek <= 0) break;
      seek = Math.min(2 * rest, total);
      translatePower--;
    }

    return day;
  }

}

