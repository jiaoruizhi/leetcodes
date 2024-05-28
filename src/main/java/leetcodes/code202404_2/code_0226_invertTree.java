package leetcodes.code202404_2;

import utils.dto.TreeNode;
import utils.utils;

/*
*
给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。*
*
*
* */
public class code_0226_invertTree {
  public static void main(String[] args) {
    code_0226_invertTree body = new code_0226_invertTree();

    // 1,2,2,3,4,4,3
    // 1,2,2,null,3,null,3
    TreeNode root = utils.getTree();
    System.out.println(body.invertTree(root));
  }

  public TreeNode invertTree(TreeNode root) {
    bfs(root);
    return root;
  }

  public void bfs(TreeNode root) {
    if (root == null) {
      return;
    }
    bfs(root.left);
    bfs(root.right);
    TreeNode cache = root.left;
    root.left = root.right;
    root.right = cache;
  }
}
