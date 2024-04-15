package code202404;

import static utils.utils.getTree;

import java.util.ArrayList;
import java.util.List;

import utils.dto.TreeNode;

/*
*

给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
*
*

* */
public class code_0257_binaryTreePaths {
  public static void main(String[] args) {
    code_0257_binaryTreePaths body = new code_0257_binaryTreePaths();

    // 1,2,3,null,5
    TreeNode root = getTree();

    System.out.println(body.binaryTreePaths(root));
  }

  List<String> result = new ArrayList<>();

  public List<String> binaryTreePaths(TreeNode root) {
    dfs(root, "");
    return result;
  }

  public void dfs(TreeNode rootNode, String str) {
    if (rootNode.left == null && rootNode.right == null) {
      result.add(new StringBuilder(str).append(rootNode.val).toString());
    }
    if (rootNode.left != null) {
      dfs(rootNode.left, new StringBuilder(str).append(rootNode.val).append("->").toString());
    }
    if (rootNode.right != null) {
      dfs(rootNode.right, new StringBuilder(str).append(rootNode.val).append("->").toString());
    }
  }


}

