package wait;


import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

/*
 *

给定一个整数数组 A，返回其中元素之和可被 K 整除的（连续、非空）子数组的数目。



示例：

输入：A = [4,5,0,-2,-3,1], K = 5
输出：7
解释：
有 7 个子数组满足其元素之和可被 K = 5 整除：
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]

*
*/
public class code_0974_subarraysDivByK {
  public static void main(String[] args) {
    code_0974_subarraysDivByK body = new code_0974_subarraysDivByK();
    Scanner sc = new Scanner(System.in);

    // 4 5 0 -2 -3 1
    int[] A = getIntArray(sc, " ");

    // 5
    int K = sc.nextInt();

    System.out.println(body.subarraysDivByK(A, K));

  }


  public int subarraysDivByK(int[] A, int K) {
    return 0;
  }
}
