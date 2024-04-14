package code202404;

import java.util.Scanner;

/*
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 *
 * */
public class code_face64_sumNums {
  public static void main(String[] args) {
    code_face64_sumNums body = new code_face64_sumNums();
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    System.out.println(body.sumNums(n));
  }

  public int sumNums(int n) {
    boolean flag = n > 1 && (n += sumNums(n - 1)) > 0;
    return n;
  }

}
