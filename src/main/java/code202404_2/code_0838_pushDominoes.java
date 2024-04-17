package code202404_2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
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

  public String pushDominoes2(String dominoes) {
    int n = dominoes.length();
    Deque<Integer> queue = new ArrayDeque<Integer>();
    int[] time = new int[n];
    Arrays.fill(time, -1);
    List<Character>[] force = new List[n];
    for (int i = 0; i < n; i++) {
      force[i] = new ArrayList<Character>();
    }
    for (int i = 0; i < n; i++) {
      char f = dominoes.charAt(i);
      if (f != '.') {
        queue.offer(i);
        time[i] = 0;
        force[i].add(f);
      }
    }

    char[] res = new char[n];
    Arrays.fill(res, '.');
    while (!queue.isEmpty()) {
      int i = queue.poll();
      if (force[i].size() == 1) {
        char f = force[i].get(0);
        res[i] = f;
        int ni = f == 'L' ? i - 1 : i + 1;
        if (ni >= 0 && ni < n) {
          int t = time[i];
          if (time[ni] == -1) {
            queue.offer(ni);
            time[ni] = t + 1;
            force[ni].add(f);
          } else if (time[ni] == t + 1) {
            force[ni].add(f);
          }
        }
      }
    }
    return new String(res);
  }

}
