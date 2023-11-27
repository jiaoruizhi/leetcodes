package code202309;


import static utils.utils.getIntArray;

import java.util.HashSet;
import java.util.Scanner;

/*
*
编写一个算法来判断一个数 n 是不是快乐数。

「快乐数」 定义为：

    对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
    然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
    如果这个过程 结果为 1，那么这个数就是快乐数。

如果 n 是 快乐数 就返回 true ；不是，则返回 false 。

* */
public class code_0202_isHappy {
  public static void main(String[] args) {
    code_0202_isHappy body = new code_0202_isHappy();


    Scanner sc = new Scanner(System.in);

    // 9
    int gem = sc.nextInt();

    System.out.println(body.isHappy(gem));
  }


  public boolean isHappy(int n) {
    HashSet<Integer> set = new HashSet<>();

    int k = n;
    while (k != 1) {
      int newValue = 0;
      int cache = k;
      while (cache != 0) {
        int v = cache % 10;
        newValue += v * v;
        cache /= 10;
      }
      boolean put = set.add(newValue);
      if (!put) return false;
      k = newValue;
    }
    return true;
  }

}

