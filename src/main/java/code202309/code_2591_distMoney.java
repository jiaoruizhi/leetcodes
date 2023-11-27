package code202309;


import static utils.utils.getIntArray;

import java.util.Scanner;

/*
*
给你一个整数 money ，表示你总共有的钱数（单位为美元）和另一个整数 children ，表示你要将钱分配给多少个儿童。

你需要按照如下规则分配：

    所有的钱都必须被分配。
    每个儿童至少获得 1 美元。
    没有人获得 4 美元。

请你按照上述规则分配金钱，并返回 最多 有多少个儿童获得 恰好 8 美元。如果没有任何分配方案，返回 -1 。


* */
public class code_2591_distMoney {
  public static void main(String[] args) {
    code_2591_distMoney body = new code_2591_distMoney();
    Scanner sc = new Scanner(System.in);

    // 20 3
    int money = sc.nextInt();
    int children = sc.nextInt();

    System.out.println(body.distMoney(money, children));
  }


  public int distMoney(int money, int children) {
    money -= children; // 每人至少 1 美元
    if (money < 0)
      return -1;
    int ans = Math.min(money / 7, children); // 初步分配，让尽量多的人分到 8 美元
    money -= ans * 7;
    children -= ans;
    if (children == 0 && money > 0 || // 必须找一个前面分了 8 美元的人，分完剩余的钱
      children == 1 && money == 3) // 不能有人恰好分到 4 美元
      --ans;
    return ans;
  }

}

