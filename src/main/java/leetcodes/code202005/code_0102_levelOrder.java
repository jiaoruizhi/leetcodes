package leetcodes.code202005;

import java.util.*;

public class code_0102_levelOrder {
    public static void main(String[] args) {
        TreeNode mother = treebuild();
        List<List<Integer>> ret = levelOrder(mother);
        for (List<Integer>  out: ret ) {
            for (Integer in : out  ) {
                System.out.print(in+"   ");
            }
            System.out.println();
        }

    }



    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ret = new LinkedList<List<Integer>>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(root);
        int now =1 ,next=0;
        while(!que.isEmpty()) {

            LinkedList<Integer> current = new LinkedList<Integer>();
            for (int i = 0; i < now; i++) {
                TreeNode nownode = que.poll();
                if(nownode!=null) {
                    if (nownode.left != null) {
                        que.add(nownode.left);
                        next++;
                    }
                    if (nownode.right != null) {
                        que.add(nownode.right);
                        next++;
                    }
                    current.add(nownode.val);
                }
            }
            ret.add(current);
            now=next;
            next=0;

        }
        return ret;
    }

    private static TreeNode treebuild() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.substring(1,str.length()-1);
        String [] ss = str.split(",");

        int i =0;
        TreeNode ret = new TreeNode(Integer.valueOf(ss[i]));
        i++;
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        que.add(ret);
        TreeNode now = que.poll();
        while(i<ss.length){
            TreeNode t ;
            if(now !=null){
                try{
                    int a = Integer.valueOf(ss[i]);
                    t = new TreeNode(a);
                }catch (Exception e){
                    t=null;
                }
                if(now.left ==null){now.left=t;que.add(t);}
                else if(now.right==null){now.right=t;que.add(t);}
                else{
                    now=que.poll();
                    now.left=t;que.add(t);
                }
            }
            i++;

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
