package leetcodes.code202404_2;

import java.util.Scanner;

/*
*
卡车有两个油箱。给你两个整数，mainTank 表示主油箱中的燃料（以升为单位），additionalTank 表示副油箱中的燃料（以升为单位）。

该卡车每耗费 1 升燃料都可以行驶 10 km。每当主油箱使用了 5 升燃料时，如果副油箱至少有 1 升燃料，则会将 1 升燃料从副油箱转移到主油箱。

返回卡车可以行驶的最大距离。

注意：从副油箱向主油箱注入燃料不是连续行为。这一事件会在每消耗 5 升燃料时突然且立即发生。
*
* */
public class code_2739_distanceTraveled {
  public static void main(String[] args) {
    code_2739_distanceTraveled body = new code_2739_distanceTraveled();
    Scanner sc = new Scanner(System.in);
    // 9 2
    int mainTank = sc.nextInt();
    int additionalTank = sc.nextInt();
    System.out.println(body.distanceTraveled(mainTank, additionalTank));
  }

  public int distanceTraveled(int mainTank, int additionalTank) {
    int result = 0;
    while (mainTank > 0) {
      boolean canGetAdditional = mainTank >= 5;

      result += canGetAdditional ? 50 : mainTank * 10;
      mainTank = mainTank > 5 ? mainTank - 5 : 0;
      if (canGetAdditional && additionalTank > 0) {
        mainTank++;
        additionalTank--;
      }
    }
    return result;
  }

}
