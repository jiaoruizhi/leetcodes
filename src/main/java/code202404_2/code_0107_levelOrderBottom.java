package code202404_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import utils.annotation.CalcCostTime;
import utils.dto.TreeNode;
import utils.utils;

/*
*
给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。*
*
*
* */
public class code_0107_levelOrderBottom {
  public static void main(String[] args) {
    code_0107_levelOrderBottom body = new code_0107_levelOrderBottom();

    //
    // 3,9,20,null,null,15,7
    TreeNode root = utils.getTree();
    List<List<Integer>> result = body.levelOrderBottom(root);
    System.out.println("");
  }

  HashMap<Integer, List<Integer>> map = new HashMap<>();


  @CalcCostTime
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    bfs(root, 0);

    List<List<Integer>> result = new ArrayList<>();

    int size = map.size();
    for (int i = size -1; i >= 0; i--) {
      result.add(map.get(i));
    }
    return result;
  }

  public void bfs(TreeNode root, int level) {
    if (root == null) {
      return;
    }

    List<Integer> current = map.getOrDefault(level, new ArrayList<>());
    current.add(root.val);
    map.put(level, current);

    int next = level + 1;
    bfs(root.left, next);
    bfs(root.right, next);
  }
}
