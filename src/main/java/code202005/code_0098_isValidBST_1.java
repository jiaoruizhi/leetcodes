package code202005;


/*
 * 验证搜索二叉树
 *
 *
 * 此案例使用递归实现
 *
 * */


import java.util.*;
public class code_0098_isValidBST_1 {
    public static void main(String[] args) {
        TreeNode root = treebuild();
        long start = new Date().getTime();
        boolean ret = isValidBST(root);
        long end = new Date().getTime();

        System.out.println(ret);
        System.out.println("本程序使用了  "+(end-start)+"  ms");

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

    private static boolean isValidBST(TreeNode root) {
       return panding(root , null , null );
    }

    private static  boolean panding(TreeNode head , Integer low , Integer high ) {
        if(head == null)return true;

        int val = head.val;
        if(low!=null && val <=low) return false;
        if(high!=null && val>=high) return false;

        if(!panding(head.left , low ,val))return false;
        if(!panding(head.right , val ,high))return false;


        return true;
    }

}
