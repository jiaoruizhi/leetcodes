package leetcodes.code202005;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/*
*
* 寻找二叉树两个节点的最近祖先
*
* */
public class code_0236_lowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode root = treebuild();
        Scanner sc = new Scanner(System.in);
        int p , q;
        p=sc.nextInt();
        q=sc.nextInt();
        System.out.println("输出结束");
        TreeNode ret = lowestCommonAncestor(root,new TreeNode(p),new TreeNode(q));
        System.out.println(ret.val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root.val==p.val || root.val==q.val) return root;

        TreeNode left = lowestCommonAncestor(root.left,p ,q);
        TreeNode right = lowestCommonAncestor(root.right,p ,q);

        if(left==null){
            return right;
        }else if (right==null){
            return left;
        }
        return root;

    }

    private static TreeNode treebuild(){
        Scanner sc = new Scanner(System.in);
        TreeNode ret =new TreeNode(sc.nextInt());
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(ret);
        TreeNode now = que.poll();
        while(sc.hasNextInt()){
            if(now !=null){
                TreeNode a = new TreeNode(sc.nextInt());
                if(now.left ==null){now.left=a;que.add(a);}
                else if(now.right==null){now.right=a;que.add(a);}
                else{
                    now=que.poll();
                    now.left=a;que.add(a);
                }
            }
        }

        return ret;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
