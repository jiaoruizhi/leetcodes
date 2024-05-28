package leetcodes.code202312;

import java.util.Calendar;
import java.util.Scanner;

/*
*

给你一个日期，请你设计一个算法来判断它是对应一周中的哪一天。

输入为三个整数：day、month 和 year，分别表示日、月、年。

您返回的结果必须是这几个值中的一个 {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}。
*
* */
public class code_1154_dayOfYear {
  public static void main(String[] args) {
    code_1154_dayOfYear body = new code_1154_dayOfYear();
    Scanner sc = new Scanner(System.in);

    // n   k   p
    //

    //1、给出n=500, k=30, p=5, 输出？
    //  给出n=500, k=30, p=16, 输出？

    String str = sc.nextLine();

    System.out.println(body.dayOfYear(str));
  }

  // O(n) = log(k)
  public int dayOfYear(String date) {

    String[] strs = date.split("-");
    Calendar calendar = Calendar.getInstance();
    calendar.set(Integer.valueOf(strs[0]), Integer.valueOf(strs[1])-1, Integer.valueOf(strs[2]));

    int num = calendar.get(Calendar.DAY_OF_YEAR);

    return num;
  }

}

