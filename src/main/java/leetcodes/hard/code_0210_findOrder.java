package leetcodes.hard;

import java.util.*;




/*
*
* 现在你总共有 n 门课需要选，记为 0 到 n-1。

在选修某些课程之前需要一些先修课程。 例如，想要学习课程 0 ，你需要先完成课程 1 ，我们用一个匹配来表示他们: [0,1]

给定课程总量以及它们的先决条件，返回你为了学完所有课程所安排的学习顺序。

可能会有多个正确的顺序，你只要返回一种就可以了。如果不可能完成所有课程，返回一个空数组。


*
*
*
* */
public class code_0210_findOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCourses = sc.nextInt();
        int[][] get = orders();
        for ( int[] out:get) {
            for ( int in: out ) {
                System.out.print(in+"    ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
        int [] result = findOrder(numCourses,get);
        for ( int a: result ) {
            System.out.print(a+"    ");
        }

    }

    private static int[][] orders() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer[]> list = new  ArrayList<Integer[]>();
        while(sc.hasNextInt()){
            Integer [] now = new Integer[2];
            now[0] = sc.nextInt();
            now[1] = sc.nextInt();
            list.add(now);
        }

        int [][] ret = new int[list.size()][2];
        int i = 0;
        while(!list.isEmpty()){
            Integer[] get = list.remove(0);
            int [] component = new int[]{get[0].intValue(),get[1].intValue()};
            ret[i]=component;
            i++;
        }
        return ret;
    }





    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) return new int[0];
        // HashSet 作为邻接矩阵
        HashSet<Integer>[] graph = new HashSet[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new HashSet<>();
        }
        for (int[] p : prerequisites) {
            graph[p[1]].add(p[0]);
        }
        int[] mark = new int[numCourses]; // 标记数组
        Stack<Integer> stack = new Stack<>(); // 结果栈
        for (int i = 0; i < numCourses; i++) {
            if(!isCycle(graph, mark, i, stack)) return new int[0];
        }
        int[] res = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            res[i] = stack.pop();
        }
        return res;
    }

    private static  boolean isCycle(HashSet<Integer>[] graph, int[] mark, int i, Stack<Integer> stack) {
        if (mark[i] == -1) return true;
        if (mark[i] == 1) return false;

        mark[i] = 1;
        for (int neighbor : graph[i]) {
            if (!isCycle(graph, mark, neighbor, stack)) return false;
        }
        mark[i] = -1;
        stack.push(i);
        return true;
    }

}
