package code202309;


import static utils.arrayUtils.getIntArray;
import static utils.arrayUtils.getIntDoubleArray;

import java.util.Arrays;
import java.util.Scanner;

/*
*

欢迎各位勇者来到力扣新手村，在开始试炼之前，请各位勇者先进行「宝石补给」。

每位勇者初始都拥有一些能量宝石， gem[i] 表示第 i 位勇者的宝石数量。
* 现在这些勇者们进行了一系列的赠送，operations[j] = [x, y] 表示在第 j 次的赠送中 第 x 位勇者将自己一半的宝石（需向下取整）赠送给第 y 位勇者。

在完成所有的赠送后，请找到拥有最多宝石的勇者和拥有最少宝石的勇者，并返回他们二者的宝石数量之差。

注意：

    赠送将按顺序逐步进行。

* */
public class code_LCP50_giveGem {
  public static void main(String[] args) {
    code_LCP50_giveGem body = new code_LCP50_giveGem();


    Scanner sc = new Scanner(System.in);

    // 0 2 5 4
    int[] gem = getIntArray(sc, null);

    //
    // 9 2 3 2 3 2 1 3 0 2 3 0 3 1 0 3 2 1 3 0
    //[[3,2],[3,2],[1,3],[0,2],[3,0],[3,1],[0,3],[2,1],[3,0]]
    int[][] operations = getIntDoubleArray();

    System.out.println(body.giveGem(gem, operations));
  }


  public int giveGem(int[] gem, int[][] operations) {

    for (int[] op : operations) {
      int x = op[0];
      int y = op[1];
      int out = gem[x];
      int in = gem[y];
      gem[x] = out - out / 2;
      gem[y] = in + out / 2;
    }

    Arrays.sort(gem);

    return gem[gem.length - 1] - gem[0];
  }

}

