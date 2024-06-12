package leetcodes.code202406;

import java.util.Scanner;

/*
*
一开始，你的银行账户里有 100 块钱。

给你一个整数purchaseAmount ，它表示你在一次购买中愿意支出的金额。

在一个商店里，你进行一次购买，实际支出的金额会向 最近 的 10 的 倍数 取整。
* 换句话说，你实际会支付一个 非负 金额 roundedAmount ，
* 满足 roundedAmount 是 10 的倍数且 abs(roundedAmount - purchaseAmount) 的值 最小 。

如果存在多于一个最接近的 10 的倍数，较大的倍数 是你的实际支出金额。

请你返回一个整数，表示你在愿意支出金额为 purchaseAmount 块钱的前提下，购买之后剩下的余额。

注意： 0 也是 10 的倍数。
*
*
* */


public class code_2806_accountBalanceAfterPurchase {
  public static void main(String[] args) {
    code_2806_accountBalanceAfterPurchase body = new code_2806_accountBalanceAfterPurchase();
    Scanner sc = new Scanner(System.in);

    // 3 1 5 8
    // 1
    int purchaseAmount = sc.nextInt();

    System.out.println(body.accountBalanceAfterPurchase(purchaseAmount));
  }

  public int accountBalanceAfterPurchase(int purchaseAmount) {
    int r = purchaseAmount % 10, s = purchaseAmount - r;
    int rounded = r >= 5 ? s + 10 : s - r;
    return 100 - rounded;
  }
}

