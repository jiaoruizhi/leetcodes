package leetcodes.code202406;

import java.util.Arrays;
import java.util.Scanner;

/*
*
排排坐，分糖果。

我们买了一些糖果 candies，打算把它们分给排好队的 n = num_people 个小朋友。

给第一个小朋友 1 颗糖果，第二个小朋友 2 颗，依此类推，直到给最后一个小朋友 n 颗糖果。

然后，我们再回到队伍的起点，给第一个小朋友 n + 1 颗糖果，第二个小朋友 n + 2 颗，依此类推，直到给最后一个小朋友 2 * n 颗糖果。

重复上述过程（每次都比上一次多给出一颗糖果，当到达队伍终点后再次从队伍起点开始），直到我们分完所有的糖果。
注意，就算我们手中的剩下糖果数不够（不比前一次发出的糖果多），这些糖果也会全部发给当前的小朋友。

返回一个长度为 num_people、元素之和为 candies 的数组，以表示糖果的最终分发情况（即 ans[i] 表示第 i 个小朋友分到的糖果数）。
*
*
* */


public class code_1103_distributeCandies {
  public static void main(String[] args) {
    code_1103_distributeCandies body = new code_1103_distributeCandies();
    Scanner sc = new Scanner(System.in);

    int candies = sc.nextInt();
    int num_people = sc.nextInt();

    System.out.println(Arrays.toString(body.distributeCandies(candies, num_people)));
  }

  public int[] distributeCandies(int candies, int num_people) {
    int[] result = new int[num_people];
    int now = 1, index = 0, rest = candies;

    while (rest > 0) {
      int real = Math.min(now, rest);
      result[index % num_people] += real;
      rest -= real;
      index++;
      now++;
    }

    return result;
  }
}

