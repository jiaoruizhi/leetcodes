package code202404;

import static utils.utils.getTree;

import utils.dto.TreeNode;

/*
*

给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。

如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。

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

