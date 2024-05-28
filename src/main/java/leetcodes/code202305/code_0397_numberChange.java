package leetcodes.code202305;


import java.util.HashMap;
import java.util.Map;
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
    code_0397_numberChange body = new code_0397_numberChange();
    Scanner sc = new Scanner(System.in);

    // 2147483647

    System.out.println(Integer.MAX_VALUE);

    int number = sc.nextInt();
    int count = body.integerReplacement(number);

    System.out.println(count);
  }

  Map<Long, Integer> map = new HashMap<>();

  public int integerReplacement(int n) {
    return dfs(n);
  }

  int dfs(long n) {
    if (n == 1) {
      return 0;
    }
    if (map.containsKey(n)) {
      return map.get(n);
    }
    int ans = n % 2 == 0 ? dfs(n / 2) : Math.min(dfs(n + 1), dfs(n - 1));
    map.put(n, ++ans);
    return ans;
  }
}
