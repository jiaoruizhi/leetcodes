package leetcodes.code202005;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/*
 * 求出二叉树  每一层的平均值
 *
 *
 * */
public class code_0637_averageOfLevels {


  public static void main(String[] args) {
    TreeNode mother = treebuild();
    List<Double> ret = averageOfLevels(mother);
    for (Double out : ret) {
      System.out.println(out.intValue());
    }

  }



  public static List<Double> averageOfLevels(TreeNode root) {
    List<Double> ret = new LinkedList<Double>();
    if (root == null)
      return ret;

    Queue<TreeNode> que = new LinkedList<TreeNode>();
    que.add(root);
    double now = 1, next = 0;
    while (!que.isEmpty()) {
      double current = 0;
      for (int i = 0; i < now; i++) {
        TreeNode nownode = que.poll();
        if (nownode != null) {
          if (nownode.left != null) {
            que.add(nownode.left);
            next++;
          }
          if (nownode.right != null) {
            que.add(nownode.right);
            next++;
          }
          current += nownode.val;
        }
      }
      ret.add(Double.valueOf(current / now));
      now = next;
      next = 0;

    }
    return ret;
  }

  private static TreeNode treebuild() {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    str = str.substring(1, str.length() - 1);
    String[] ss = str.split(",");

    int i = 0;
    TreeNode ret = new TreeNode(Integer.valueOf(ss[i]));
    i++;
    Queue<TreeNode> que = new LinkedList<TreeNode>();
    que.add(ret);
    TreeNode now = que.poll();
    while (i < ss.length) {
      TreeNode t;
      if (now != null) {
        try {
          int a = Integer.valueOf(ss[i]);
          t = new TreeNode(a);
        } catch (Exception e) {
          t = null;
        }
        if (now.left == null) {
          now.left = t;
          que.add(t);
        } else if (now.right == null) {
          now.right = t;
          que.add(t);
        } else {
          now = que.poll();
          now.left = t;
          que.add(t);
        }
      }
      i++;

    }
    return ret;
  }

  public static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
