package leet202005;

import java.util.Date;
import java.util.Scanner;


/*
*
* 给定一组数组   其中数字为铁柱的高度      求出使盛水体积最大的左右铁柱
*
*
*
* */
public class code_0011_maxArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int num = sc. nextInt();
        int  [] height = new int[num];
        for (int i = 0; i < num; i++) {
            height[i] = sc.nextInt();
        }*/

        String num = sc.nextLine();
        String get = num.substring(1,num.length()-1);
        String [] sp = get.split(",");
        int [] height = new int[sp.length];
        for (int i = 0; i < sp.length; i++) {
            height[i] = Integer.valueOf(sp[i]).intValue();
        }

        System.out.println("输出结束");


        long starttime = new Date().getTime();

        int max = maxArea(height);
        System.out.println(max);

        long endtime = new Date().getTime();
        System.out.println("本程序运行 " + (endtime - starttime) + " 毫秒完成。" );
    }


    public static int maxArea(int[] height) {
        int left = 0,right=height.length-1,max=0;
        while(left<right){
            int now = (right-left)*Math.min(height[left],height[right]);
            if(now>max)max=now;
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }

    /*private static int mymax(int[] height, int left, int right) {

        if(left>=right)return 0;
        int ret = 0;
        int now = (right - left) * Math.min(height[left],height[right]);
        int a = mymax(height , left + 1 ,right);
        int b = mymax(height , left  ,right-1);
        int c = mymax(height , left + 1 ,right-1);
        ret  =  Math.max( Math.max(now,a), Math.max(b,c)  );
        return ret ;
    }*/


}


/*

[1,8,6,2,5,4,8,3,7]
9
1 8 6 2 5 4 8 3 7


[76,155,15,188,180,154,84,34,187,142,22,5,27,183,111,128,50,58,2,112,179,2,100,111,115,76,134,120,118,103,31,146,58,198,134,38,104,170,25,92,112,199,49,140,135,160,20,185,171,23,98,150,177,198,61,92,26,147,164,144,51,196,42,109,194,177,100,99,99,125,143,12,76,192,152,11,152,124,197,123,147,95,73,124,45,86,168,24,34,133,120,85,81,163,146,75,92,198,126,191]

*
* */