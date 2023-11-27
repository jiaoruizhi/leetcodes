package hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;



/*
*
你是一位施工队的工长，根据设计师的要求准备为一套设计风格独特的房子进行室内装修。

房子的客厅大小为 n x m，为保持极简的风格，需要使用尽可能少的 正方形 瓷砖来铺盖地面。

假设正方形瓷砖的规格不限，边长都是整数。

请你帮设计师计算一下，最少需要用到多少块方形瓷砖？
*
*
*
* */
public class code_1240_tilingRectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();

    System.out.println("------------------------------------");
    int result = tilingRectangle(m, n);
    System.out.println(result);
  }


  public static int tilingRectangle(int m, int n) {
    return 0;
  }



}
