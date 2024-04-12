package code202309;


import static utils.utils.getTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import utils.dto.TreeNode;

/*
*
小偷又发现了一个新的可行窃的地区。这个地区只有一个入口，我们称之为 root 。

除了 root 之外，每栋房子有且只有一个“父“房子与之相连。一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。 如果 两个直接相连的房子在同一天晚上被打劫 ，房屋将自动报警。

给定二叉树的 root 。返回 在不触动警报的情况下 ，小偷能够盗取的最高金额 。
*
* */
public class code_0337_rob {
  public static void main(String[] args) {
    code_0337_rob body = new code_0337_rob();
    Scanner sc = new Scanner(System.in);

    // 3,4,5,1,3,null,1
    TreeNode root = getTree();
    System.out.println(body.rob(root));
  }

  Map<TreeNode, Integer> f = new HashMap<TreeNode, Integer>(); // f 取此节点
  Map<TreeNode, Integer> g = new HashMap<TreeNode, Integer>(); // g 不取此节点

  public int rob(TreeNode root) {
    dfs(root);
    return Math.max(f.getOrDefault(root, 0), g.getOrDefault(root, 0));
  }

  public void dfs(TreeNode node) {
    if (node == null) {
      return;
    }
    dfs(node.left);
    dfs(node.right);
    f.put(node, node.val + g.getOrDefault(node.left, 0) + g.getOrDefault(node.right, 0));
    g.put(node, Math.max(f.getOrDefault(node.left, 0), g.getOrDefault(node.left, 0)) + Math.max(f.getOrDefault(node.right, 0), g.getOrDefault(node.right, 0)));
  }
}

