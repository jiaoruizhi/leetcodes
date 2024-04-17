package code202404_2;

import java.util.Scanner;



/*
*
给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。
*
*
*
* */
public class code_0838_pushDominoes {
  public static void main(String[] args) {
    code_0838_pushDominoes body = new code_0838_pushDominoes();
    Scanner sc = new Scanner(System.in);

    // RR.L
    // .L.R...LR..L..

    // "LL.RR.LLRRLL.."
    String s = sc.nextLine();

    System.out.println(body.pushDominoes(s));
  }

  public String pushDominoes(String dominoes) {
    char[] s = dominoes.toCharArray();
    int n = s.length, i = 0;
    char left = 'L';
    while (i < n) {
      int j = i;
      while (j < n && s[j] == '.') { // 找到一段连续的没有被推动的骨牌
        j++;
      }
      char right = j < n ? s[j] : 'R';
      if (left == right) { // 方向相同，那么这些竖立骨牌也会倒向同一方向
        while (i < j) {
          s[i++] = right;
        }
      } else if (left == 'R' && right == 'L') { // 方向相对，那么就从两侧向中间倒
        int k = j - 1;
        while (i < k) {
          s[i++] = 'R';
          s[k--] = 'L';
        }
      }
      left = right;
      i = j + 1;
    }
    return new String(s);
  }

}
