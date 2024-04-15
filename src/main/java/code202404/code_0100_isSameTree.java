package code202404;

import static utils.utils.getTree;

import utils.dto.TreeNode;

/*
*

给定一个二叉树的 root ，返回 最长的路径的长度 ，这个路径中的 每个节点具有相同值 。 这条路径可以经过也可以不经过根节点。

两个节点之间的路径长度 由它们之间的边数表示。

* */
public class code_0100_isSameTree {
  public static void main(String[] args) {
    code_0100_isSameTree body = new code_0100_isSameTree();

    // 5,4,5,1,1,5
    // 1,4,5,4,4,null,5
    TreeNode p = getTree();
    TreeNode q = getTree();


    System.out.println(body.isSameTree(p, q));
  }

  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) {
      return true;
    }
    if (p != null && q != null) {
      if (p.val != q.val) {
        return false;
      }
      return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    return false;
  }
}

