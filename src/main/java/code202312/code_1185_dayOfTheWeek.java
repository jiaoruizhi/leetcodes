package code202312;

import java.util.Calendar;
import java.util.Scanner;

/*
*

给你一个日期，请你设计一个算法来判断它是对应一周中的哪一天。

输入为三个整数：day、month 和 year，分别表示日、月、年。

您返回的结果必须是这几个值中的一个 {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}。
*
* */
public class code_1185_dayOfTheWeek {
  public static void main(String[] args) {
    code_1185_dayOfTheWeek body = new code_1185_dayOfTheWeek();
    Scanner sc = new Scanner(System.in);

    // n   k   p
    //

    //1、给出n=500, k=30, p=5, 输出？
    //  给出n=500, k=30, p=16, 输出？

    int day = sc.nextInt();
    int month = sc.nextInt();
    int year = sc.nextInt();

    System.out.println(body.dayOfTheWeek(day, month, year));
  }

  // O(n) = log(k)
  public String dayOfTheWeek(int day, int month, int year) {

    String[] map = new String[]{"", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    Calendar calendar = Calendar.getInstance();
    calendar.set(year, month - 1, day);

    int num = calendar.get(Calendar.DAY_OF_WEEK);

    return map[num];
  }

}

