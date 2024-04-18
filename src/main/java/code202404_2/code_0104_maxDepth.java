package code202404_2;

import utils.dto.TreeNode;
import utils.utils;

/*
*
给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。*
*
*
* */
public class code_0104_maxDepth {
  public static void main(String[] args) {
    code_0104_maxDepth body = new code_0104_maxDepth();

    // 1,2,2,3,4,4,3
    // 1,2,2,null,3,null,3
    TreeNode root = utils.getTree();
    System.out.println(body.maxDepth(root));
  }

  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
  }

}
