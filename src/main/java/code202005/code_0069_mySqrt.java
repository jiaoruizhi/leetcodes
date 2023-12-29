package code202005;

import java.util.*;

/*
* 实现 Math.sqrt求根号
*
*
* */

public class code_0069_mySqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int get = sc.nextInt();
        System.out.println("输出结束");

        long starttime = new Date().getTime();

        int ret = mySqrt(get);
        System.out.println(ret);

        long endtime = new Date().getTime();
        System.out.println("本程序运行 " + (endtime - starttime) + " 毫秒完成。" );
    }

    private static int mySqrt(int x) {
        int left=0,right=x,mid=0,now=0;
        while(left<=right){
            mid = left + (right-left)/2;

            if((long)mid*mid<=x){
                now=mid;
                left=mid+1;
            }else{
            right=mid-1;
        }}
        return now;
    }

}
