package leetcodes.code202305;


import java.util.Scanner;

/*
*

求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
*
*
* */
public class code_sward64_sumNums {
  public static void main(String[] args) {
    //
    // 8

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(sumNums(n));
  }


  //
  public static int sumNums(int n) {
    return n == 0 ? 0 : n + sumNums(n - 1);
  }
}
