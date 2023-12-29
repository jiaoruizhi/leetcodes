package meeting;

import java.util.Scanner;

/*
*


*
* */
public class meeting_20231229_1 {
  public static void main(String[] args) {
    meeting_20231229_1 body = new meeting_20231229_1();
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

  //
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

