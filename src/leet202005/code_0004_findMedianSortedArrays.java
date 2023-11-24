package leet202005;


import java.text.DecimalFormat;
import java.util.*;

/**
 * 给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
 *
 * 请你找出这两个正序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 *
 * 你可以假设 nums1 和 nums2 不会同时为空。

 */

public class code_0004_findMedianSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 , l2;
        l1= sc.nextInt();
        int[] nums1 = new int[l1];
        for(int i = 0;i<l1;i++){
            nums1[i] = sc.nextInt();
        }
        l2= sc.nextInt();
        int[] nums2 = new int[l2];
        for(int i = 0;i<l2;i++){
            nums2[i] = sc.nextInt();
        }
        System.out.println("输出结束");


        long starttime = new Date().getTime();
        double ret  = findMedianSortedArrays(nums1,nums2);
        long endtime = new Date().getTime();
        DecimalFormat df = new DecimalFormat( ".0 ");
        System.out.println(df.format(ret));
        System.out.println("本程序运行 " + (endtime - starttime) + " 毫秒完成。" );




    }

    private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length,l2 = nums2.length;
        int index1=0;
        int index2=0;
        int now=0;
        int[] large = new int[l1+l2];
        while(index1<l1 || index2<l2){
            if(index1 >= l1){
                large[now] = nums2[index2];
                now++;
                index2++;
                continue;
            }
            if(index2 >= l2){
                large[now] = nums1[index1];
                now++;
                index1++;
                continue;
            }

            if(nums1[index1]<=nums2[index2]){
                large[now] = nums1[index1];
                index1++;
            }
            else{
                large[now] = nums2[index2];
                index2++;
            }
            now++;
        }
        int ll = large.length;
        if(ll%2==0){
            return (large[ll/2-1]+large[ll/2])/2.0;
        }
        else{
            return large[(ll-1)/2];
        }
    }

}


/*
3
1 2 3
3
4 5 8
*/