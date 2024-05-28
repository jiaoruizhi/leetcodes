package leetcodes.code202005;

import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 *
 * 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
 * s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。


 *
 *
 * */
public class code_0572_isSubtree {
  public static void main(String[] args) {
    TreeNode mother = treeBuild();
    TreeNode doughter = treeBuild();

    System.out.println("输入结束");
    long start = new Date().getTime();
    boolean ret = isSubtree(mother, doughter);
    long end = new Date().getTime();

    System.out.println(ret);
    System.out.println("本程序使用了  " + (end - start) + "  ms");
  }

  private static TreeNode treeBuild() {
    Scanner sc = new Scanner(System.in);
    TreeNode ret = new TreeNode(sc.nextInt());
    Queue<TreeNode> que = new LinkedList<TreeNode>();
    que.add(ret);
    TreeNode now = que.poll();
    while (sc.hasNextInt()) {
      if (now != null) {
        TreeNode a = new TreeNode(sc.nextInt());
        if (now.left == null) {
          now.left = a;
          que.add(a);
        } else if (now.right == null) {
          now.right = a;
          que.add(a);
        } else {
          now = que.poll();
          now.left = a;
          que.add(a);
        }
      }
    }
    return ret;
  }

  private static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }


  private static boolean isSubtree(TreeNode s, TreeNode t) {
    boolean ret = false;
    int h = t.val;
    Queue<TreeNode> que = new LinkedList<TreeNode>();
    que.add(s);
    while (!que.isEmpty()) {
      TreeNode now = que.poll();
      if (now.val == h) {
        if (startMatch(now, t)) {
          return true;
        }
      }
      if (now.left != null) {
        que.add(now.left);
      }
      if (now.right != null) {
        que.add(now.right);
      }
    }
    return ret;
  }

  private static boolean startMatch(TreeNode s, TreeNode t) {
    if (s == null)
      return t == null;
    if (t == null)
      return false;
    return s.val == t.val && startMatch(s.left, t.left) && startMatch(s.right, t.right);
  }

}
/*
3 4 5 1 2 a
4 1 2 a

[-1,-4,8,-6,-2,3,9,null,-5,null,null,0,7]
[3,0,5848]
 */
