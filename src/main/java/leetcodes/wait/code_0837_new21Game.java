package leetcodes.wait;


import java.util.Scanner;

/*
*
*
爱丽丝参与一个大致基于纸牌游戏 “21点” 规则的游戏，描述如下：

爱丽丝以 0 分开始，并在她的得分少于 K 分时抽取数字。
抽取时，她从 [1, W] 的范围中随机获得一个整数作为分数进行累计，其中 W 是整数。 每次抽取都是独立的，其结果具有相同的概率。

当爱丽丝获得不少于 K 分时，她就停止抽取数字。 爱丽丝的分数不超过 N 的概率是多少？

示例 1：

输入：N = 10, K = 1, W = 10
输出：1.00000
说明：爱丽丝得到一张卡，然后停止。

示例 2：

输入：N = 6, K = 1, W = 10
输出：0.60000
说明：爱丽丝得到一张卡，然后停止。
在 W = 10 的 6 种可能下，她的得分不超过 N = 6 分。

示例 3：

输入：N = 21, K = 17, W = 10
输出：0.73278
*
* */
public class code_0837_new21Game {
  public static void main(String[] args) {
    code_0837_new21Game body = new code_0837_new21Game();
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int W = sc.nextInt();

    System.out.println(body.new21Game(N, K, W));

  }


  public double new21Game(int N, int K, int W) {
    return 0;
  }
}
