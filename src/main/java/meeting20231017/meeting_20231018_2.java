package meeting20231017;

import java.util.Scanner;

/*
*

2 接上一题，如果要确保最后小区能清零，即在转运能力减到0之前，
* 所有感染者都能被转运出去，p的最小值是多少。
* 即基于小区居民n，第一天感染人数k，求出p的最小值。用Java/JS/TS/C++语言实现求p最小值的函数。
要求：
(1) 命名一个合适的函数名称，实现完整的函数
(2) 按照你平时的编程习惯，在你认为需要注释处写上相应的注释

*
*
* */
public class meeting_20231018_2 {
  public static void main(String[] args) {
    meeting_20231018_2 body = new meeting_20231018_2();
    Scanner sc = new Scanner(System.in);

    // n   k
    int n = sc.nextInt();
    int k = sc.nextInt();

    System.out.println(body.leastPower(n, k));
  }

  public int leastPower(int n, int k) {
    int power = k / 2 + 1;
    int seek = k;
    boolean flag = true;

    while (flag) {
      int cur = power, total = n;
      while (seek > 0) {
        int rest = seek - cur; // 剩下的感染者
        total -= cur;
        if (rest <= 0) {
          flag = false;
          break;
        }
        if (rest > cur) { // 转移的人数没有感染的人数多，p值小了。
          power++;
          break;
        }
        seek = Math.min(2 * rest, total);
        cur--;
      }
    }

    return power;
  }

}

