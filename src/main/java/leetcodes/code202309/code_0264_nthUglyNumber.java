package leetcodes.code202309;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

/*
*
丑数 就是只包含质因数 2、3 和 5 的正整数。

给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。

* */
public class code_0264_nthUglyNumber {
  public static void main(String[] args) {
    code_0264_nthUglyNumber body = new code_0264_nthUglyNumber();


    Scanner sc = new Scanner(System.in);
    // 4
    int n = sc.nextInt();

    System.out.println(body.nthUglyNumber(n));
  }

  public int nthUglyNumber(int n) {
    int[] factors = {2, 3, 5};
    Set<Long> seen = new HashSet<Long>();
    PriorityQueue<Long> heap = new PriorityQueue<Long>();
    seen.add(1L);
    heap.offer(1L);
    int ugly = 0;
    for (int i = 0; i < n; i++) {
      long curr = heap.poll();
      ugly = (int) curr;
      for (int factor : factors) {
        long next = curr * factor;
        if (seen.add(next)) {
          heap.offer(next);
        }
      }
    }
    return ugly;
  }

}

