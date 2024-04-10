package code202404;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
*

给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
*
*

* */
public class code_0386_lexicalOrder {
  public static void main(String[] args) {
    code_0386_lexicalOrder body = new code_0386_lexicalOrder();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    System.out.println(body.lexicalOrder(n));
  }

  public List<Integer> lexicalOrder(int num) {
    List<Integer> result = new ArrayList<>();

    dfs(result, 0, num);

    return result;
  }

  public void dfs(List<Integer> result, int root, int max) {
    if (root > max)
      return;

    int[] next = root == 0
      ? new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9}
      : new int[] {root * 10, root * 10 + 1, root * 10 + 2, root * 10 + 3, root * 10 + 4, root * 10 + 5, root * 10 + 6,
        root * 10 + 7, root * 10 + 8, root * 10 + 9};

    for (int n : next) {
      if (n <= max) {
        result.add(n);
        dfs(result, n, max);
      }
    }
  }

}

