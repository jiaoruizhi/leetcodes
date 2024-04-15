package code202404;

import static utils.utils.getTree;

import utils.dto.TreeNode;

/*
*

给定一个二叉树的 root ，返回 最长的路径的长度 ，这个路径中的 每个节点具有相同值 。 这条路径可以经过也可以不经过根节点。

两个节点之间的路径长度 由它们之间的边数表示。

* */
public class code_0687_longestUnivaluePath {
  public static void main(String[] args) {
    code_0687_longestUnivaluePath body = new code_0687_longestUnivaluePath();

    // 5,4,5,1,1,5
    // 1,4,5,4,4,null,5
    TreeNode root = getTree();

    System.out.println(body.longestUnivaluePath(root));
  }

  int res;

  public int longestUnivaluePath(TreeNode root) {
    res = 0;
    dfs(root);
    return res;
  }

  public int dfs(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int left = dfs(root.left), right = dfs(root.right);
    int left1 = 0, right1 = 0;
    if (root.left != null && root.left.val == root.val) {
      left1 = left + 1;
    }
    if (root.right != null && root.right.val == root.val) {
      right1 = right + 1;
    }
    res = Math.max(res, left1 + right1);
    return Math.max(left1, right1);
  }
}

