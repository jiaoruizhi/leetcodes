package leet202005;


import java.util.*;
/*
* 验证搜索二叉树
*
*
* 此案例使用中序遍历后，检查从小到大的顺序  实现验证
*
* */
public class code_0098_isValidBST {
    public static void main(String[] args) {
        TreeNode root = treebuild();
        boolean ret = isValidBST(root);
        System.out.println(ret);

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
        boolean ret =true;
        if(root==null){return true;}
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que = midorder(root,que);
        ret = mysort(que);
        return ret;
    }
    private static Queue<TreeNode> midorder(TreeNode root , Queue<TreeNode> que){
        if (root==null){return  que;}

        que=midorder(root.left , que);
        if(root.left!=null || root.right!=null) {
            que.add(root);
        }
        que=midorder(root.right , que);
        if(root.left == null && root.right==null){
            que.add(root);
        }
        return que;
    }

    private static boolean mysort(Queue<TreeNode> que){
        if(que.size()==1){return true;}
        int now=que.poll().val;
        boolean ret = true;
        while(!que.isEmpty()){
            TreeNode a = que.poll();
            if(a.val<=now){
                return false;
            }
            now = a.val;
        }
        return ret;
    }
}