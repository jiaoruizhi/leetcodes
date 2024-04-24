package code202404_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import utils.dto.TreeNode;
import utils.utils;

/*
*
给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。*
*
*
* */
public class code_2385_amountOfTime {
  public static void main(String[] args) {
    code_2385_amountOfTime body = new code_2385_amountOfTime();
    Scanner sc = new Scanner(System.in);

    // 1,5,3,null,4,10,6,null,null,9,2
    // 3
    TreeNode root = utils.getTree();

    int start = sc.nextInt();
    System.out.println(body.amountOfTime(root, start));
  }

  HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

  public int amountOfTime(TreeNode root, int start) {
    handleMap(root, null);

    int result = -1;
    List<Integer> removeList = List.of(start);
    List<Integer> next = new ArrayList<>();

    do {
      for (int i : removeList) {
        if (map.containsKey(i)) {
          next.addAll(map.get(i));
        }
        map.remove(i);
      }
      removeList = new ArrayList<>(next);
      next.clear();
      result++;
    } while (!map.keySet().isEmpty());

    return result;
  }

  public void handleMap(TreeNode node, TreeNode parent) {
    if (node == null) {
      return;
    }
    addToMap(node, parent);
    addToMap(node, node.left);
    addToMap(node, node.right);

    handleMap(node.left, node);
    handleMap(node.right, node);
  }

  public void addToMap(TreeNode root, TreeNode target) {
    if (target != null) {
      List<Integer> next = map.getOrDefault(root.val, new ArrayList<>());
      next.add(target.val);
      map.put(root.val, next);
    }
  }

}
