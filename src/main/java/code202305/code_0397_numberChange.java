package code202305;


import java.util.Scanner;

/*
*
给定一个正整数 n ，你可以做如下操作：

    如果 n 是偶数，则用 n / 2替换 n 。
    如果 n 是奇数，则可以用 n + 1或n - 1替换 n 。

返回 n 变为 1 所需的 最小替换次数 。

*
*
* */
public class code_0397_numberChange {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int count = integerReplacement(number);

    System.out.println(count);
  }


  public static int integerReplacement(int n) {
    if (n == 1) return 0;
    if (n == 2) return 1;
    int[] dataArray = new int[n + 1];
    dataArray[1] = 0;
    dataArray[2] = 1;

    for (int i = 3; i <= n; i++) {
      int cache;
      if (i % 2 == 0) {
        cache = dataArray[i / 2] + 1;
      } else {
        cache = Math.min(dataArray[(i + 1) / 2], dataArray[(i - 1) / 2]) + 2;
      }
      dataArray[i] = cache;
    }
    return dataArray[n];
  }
}
