package leetcodes.code202406;

import java.util.Scanner;

/*
*
给你两个长度为 n 下标从 0 开始的整数数组 cost 和 time ，分别表示给 n 堵不同的墙刷油漆需要的开销和时间。你有两名油漆匠：

    一位需要 付费 的油漆匠，刷第 i 堵墙需要花费 time[i] 单位的时间，开销为 cost[i] 单位的钱。
    一位 免费 的油漆匠，刷 任意 一堵墙的时间为 1 单位，开销为 0 。但是必须在付费油漆匠 工作 时，免费油漆匠才会工作。

请你返回刷完 n 堵墙最少开销为多少。
*
* */


public class code_2710_removeTrailingZeros {
  public static void main(String[] args) {
    code_2710_removeTrailingZeros body = new code_2710_removeTrailingZeros();
    Scanner sc = new Scanner(System.in);

    // 1 2 1
    // 12300
    String num = sc.nextLine();

    System.out.println(body.removeTrailingZeros(num));
  }

  public String removeTrailingZeros(String num) {
    int left = 0;

    for (int right = 0; right < num.length(); right++) {
      char current = num.charAt(right);
      if (current != '0') {
        left = right;
      }
    }

    return num.substring(0, left + 1);
  }
}

