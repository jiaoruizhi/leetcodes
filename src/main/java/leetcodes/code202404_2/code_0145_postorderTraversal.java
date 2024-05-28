package leetcodes.code202404_2;

import java.util.ArrayList;
import java.util.List;

import utils.dto.TreeNode;
import utils.utils;



/*
*
给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。
*
*
*
* */
public class code_0145_postorderTraversal {
  public static void main(String[] args) {
    code_0145_postorderTraversal body = new code_0145_postorderTraversal();

    // 1,2,2,3,4,4,3
    // 1,2,2,null,3,null,3
    TreeNode root = utils.getTree();
    System.out.println(body.postorderTraversal(root));
  }

  List<Integer> result = new ArrayList<>();

  public List<Integer> postorderTraversal(TreeNode root) {
    bfs(root);
    return result;
  }

  public void bfs(TreeNode root) {
    if (root == null) {
      return;
    }
    bfs(root.left);
    bfs(root.right);
    result.add(root.val);
  }
}
