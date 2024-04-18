package code202404_2;

import static utils.arrayUtils.getIntArray;

import java.util.Scanner;

import utils.dto.TreeNode;

/*
 *
 * 从后序遍历和中序遍历中   构建二叉树     树中没有重复值
 *
 *
 *前序遍历 preorder = [3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]

返回如下的二叉树：

    3
   / \
  9  20
    /  \
   15   7

 *
 * */
public class code_0106_buildTree {
  public static void main(String[] args) {
    code_0106_buildTree body = new code_0106_buildTree();
    Scanner sc = new Scanner(System.in);

    // 9 3 15 20 7
    // 9 15 7 20 3


    int[] inorder = getIntArray(sc, " ");
    int[] postorder = getIntArray(sc, " ");

    TreeNode result = body.buildTree(inorder, postorder);
    System.out.println(result.val);
  }

  // -3000 <= preorder[i], inorder[i] <= 3000

  int[] inIndex;
  public TreeNode buildTree(int[] inorder, int[] postorder) {
    inIndex = new int[6001];
    for (int i = 0; i < inorder.length; i++) {
      inIndex[inorder[i] + 3000] = i;
    }

    int lastIndex = postorder.length - 1;
    TreeNode result = buildMyTree(postorder, 0, lastIndex, 0);
    return result;
  }

  public TreeNode buildMyTree(int[] postorder, int left1, int right1, int left2) {
    if (left1 > right1) {
      return null;
    }

    int rootValue = postorder[right1];
    TreeNode root = new TreeNode(rootValue);
    int rootIndexInInorder = inIndex[rootValue + 3000];
    int leftTreeLength = rootIndexInInorder - left2;

    TreeNode leftTree = buildMyTree(postorder, left1, left1 + leftTreeLength - 1, left2);
    TreeNode rightTree = buildMyTree(postorder, left1 + leftTreeLength, right1 - 1, rootIndexInInorder + 1);

    root.left = leftTree;
    root.right = rightTree;
    return root;
  }

}
