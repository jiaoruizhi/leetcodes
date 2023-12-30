package meeting;

import java.util.Date;
import java.util.Scanner;

/*
*
在日常生活中，我们经常会用到各式各样的社交媒体。而在各类社交媒体软件中，
* 通常都会对作品的发布时间以及评论时间等进行展示，但多数情况都不会直接展示具体的年月日等信息，
* 而是展示“一小时前”、“三个月前”这些相对于当前时间的偏移信息。
* 请实现一个 getDateString 方法，将作品/评论的发布时间作为入参，并最终返回合适的字符串，具体规则如下：
1. 如果发布时间在一个小时以内，显示“刚刚”（或“just now”）
2. 如果发布时间超过一小时但不到一天，显示“X小时前”（或“X hour(s) ago”）
3. 如果发布时间超过一天但不到一个月，显示“X天前”（或“X day(s) ago”）
4. 如果发布时间超过一个月但是不到一年，显示“X月前”（或“X month(s) ago”）
5. 如果发布时间超过一年，直接显示时间字符串（如“20XX-XX-XX XX:XX:XX”）

*
* */
public class meeting_20231229_1 {
  public static void main(String[] args) {
    meeting_20231229_1 body = new meeting_20231229_1();

    System.out.println(body.getDateString(new Date(2023,12,28,12,0,0)));
  }

  //
  public String getDateString(Date date) {

    Date now = new Date();

    long dis = date.getTime() - now.getTime();

    long res = dis / 24 / 60 / 60 /1000;

    System.currentTimeMillis();

    return "";
  }

}

