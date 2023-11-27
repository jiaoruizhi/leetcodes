package wait;

import utils.*;
import utils.dto.TreeNode;



/*
*
* 给定一个二叉树，检查它是否是镜像对称的。



例如，二叉树 [1,2,2,3,4,4,3] 是对称的。

    1
   / \
  2   2
 / \ / \
3  4 4  3



但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:

    1
   / \
  2   2
   \   \
   3    3


*
*
*
* */
public class code_0101_isSymmetric {
    public static void main(String[] args) {
        TreeNode root  = utils.getTree();
        boolean ret = isSymmetric(root);
        System.out.println(ret);

    }

    public static boolean isSymmetric(TreeNode root) {


        return true;
    }


}
