package leet202005;


import java.util.Scanner;

/*
*
* 给定正整数数组 A，A[i] 表示第 i 个观光景点的评分，并且两个景点 i 和 j 之间的距离为 j - i。

一对景点（i < j）组成的观光组合的得分为（A[i] + A[j] + i - j）：景点的评分之和减去它们两者之间的距离。

返回一对观光景点能取得的最高分。
*
*
*
* */
public class code_1014_maxScoreSightseeingPair {
    public static void main(String[] args) {
        int [] get = getarray();
        int max = maxScoreSightseeingPair(get);
        System.out.println(max);

    }

    private static int[] getarray() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.substring(1,str.length()-1);
        String [] sp = str.split(",");
        int [] ret = new int[sp.length];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = Integer.valueOf(sp[i]);
        }
        return ret;
    }

    public static int maxScoreSightseeingPair(int[] A) {

        int left = A[0], res = Integer.MIN_VALUE;
        for (int j = 1; j < A.length; j++) {
            res = Math.max(res, left + A[j] - j);
            left = Math.max(left, A[j] + j);
        }
        return res;
    }
}
