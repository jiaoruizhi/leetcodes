package code202404;

import static utils.utils.getTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import utils.dto.TreeNode;

/*
*

给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
*
*

* */
public class code_1379_getTargetCopy {
  public static void main(String[] args) {
    code_1379_getTargetCopy body = new code_1379_getTargetCopy();
    Scanner sc = new Scanner(System.in);

    // 1,2,3,null,5
    TreeNode original = getTree();

    // 1,2,3,null,5
    TreeNode cloned = getTree();
    //    System.out.println(body.getTargetCopy(original, cloned, null));
  }

  // 广度优先
  Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
  Queue<TreeNode> queue2 = new LinkedList<TreeNode>();

  public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
    TreeNode left;
    TreeNode right;

    queue1.add(original);
    queue2.add(cloned);
    while (queue1.size() != 0) {
      left = queue1.poll();
      right = queue2.poll();

      if (left == null && right == null && target == null) return right;
      if (left != null && left == target) return right;

      if (left.left != null) queue1.add(left.left);
      if (left.right != null) queue1.add(left.right);

      if (right.left != null) queue2.add(right.left);
      if (right.right != null) queue2.add(right.right);
    }
    return null;
  }

  // 分治
  public final TreeNode getTargetCopy2(final TreeNode original, final TreeNode cloned, final TreeNode target) {
    if (original == null) {
      return null;
    }
    if (original == target) {
      return cloned;
    }

    TreeNode leftTarget = getTargetCopy2(original.left, cloned.left, target);
    if (leftTarget != null) {
      return leftTarget;
    }
    TreeNode rightTarget = getTargetCopy2(original.right, cloned.right, target);
    if (rightTarget != null) {
      return rightTarget;
    }

    return null;
  }

}

