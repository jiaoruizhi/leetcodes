package wait;


import leet202005.code_0206_reverseList;

import java.util.Scanner;

/*
*
* 给定一个数组，求出其中子数组 的   最大乘积
*
输入: [2,3,-2,4]
输出: 6
解释: 子数组 [2,3] 有最大乘积 6。

输入: [-2,0,-1]
输出: 0
解释: 结果不能为 2, 因为 [-2,-1] 不是子数组。


*
* */
public class code_0152_maxProduct {
    public static void main(String[] args) {
        int [] get = arraybuild();
        int max = maxProduct(get);
        System.out.println(max);

    }
    private static int[] arraybuild() {
        Scanner sc = new Scanner(System.in);
        String get =sc.nextLine();
        get=get.substring(1,get.length()-1);
        String [] ss =get.split(",");
        int[] ret = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            ret[i]=Integer.valueOf(ss[i]);
        }
        return ret;
    }

    public static int maxProduct(int[] nums) {
        int [] help = new int[nums.length];
        int now = 1;
        for (int i = 0; i < help.length; i++) {
            help[i]=nums[i]*now;
            now = now*nums[i];
        }
        int max = Integer.MIN_VALUE;
        int fu1 =-1,fu2=-1;
        for (int i = help.length-1; i >=0 ; i--) {
            System.out.println(help[i]);
            if(max<help[i]){
                max=help[i];
            }
            if(help[i]<0){
                if(fu1==-1){fu1=i;}
                else if(fu2==-1){fu2=i;}

                if(fu1!=-1 && fu2!=-1){
                    int z = help[fu1] / help[fu2] ;
                    if(z>max){max=z;}
                    fu1=fu2;fu2=-1;
                }
            }
        }
        return max;
    }
}
