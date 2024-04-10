package code202404;

import java.util.HashMap;
import java.util.Random;

/*
*
给定方法 rand7 可生成 [1,7] 范围内的均匀随机整数，试写一个方法 rand10 生成 [1,10] 范围内的均匀随机整数。

你只能调用 rand7() 且不能调用其他方法。请不要使用系统的 Math.random() 方法。

每个测试用例将有一个内部参数 n，即你实现的函数 rand10() 在测试时将被调用的次数。请注意，这不是传递给 rand10() 的参数。
*
*
* */
public class code_0470_rand10 {
  Random random = new Random();
  public static void main(String[] args) {
    code_0470_rand10 body = new code_0470_rand10();

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < 10000; i++) {
      int next = body.rand7();
      map.put(next, map.getOrDefault(next, 0) + 1);
    }

    System.out.println(map);
    System.out.println(body.rand10());
  }

  public int rand10() {
    int res = getOne();
    while (res > 40) {
      res = getOne();
    }
    return res % 10 + 1;
  }

  public int getOne() {
    return (rand7() - 1) * 7 + rand7();
  }

  public int rand7() {
    return random.nextInt(7) + 1;
  }

}
