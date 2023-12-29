package code202005;

import java.util.*;
/**
 *
 * 给定数组，每个位置的值 为 此位置能前跳的步数
 *
 * 输出从 0 跳到 最后一个元素的 最小步数
 *
 */

public class code_0054_jump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] get = new int[num];
        for(int i = 0;i<num;i++){
            get[i] =  sc.nextInt();
        }
        int ret = jump(get);
        System.out.println(ret);
    }

    private static int jump(int[] nums) {
        int ret = 0;
        int pos = nums.length-1;
        int now = 0;
        int max = 1;
        int maxid = 0;
        while(now < pos){
            if(nums[now]>=pos-now){
                now =pos;
                ret ++;
                break;
            }
            maxid=now+1;
            max = nums[maxid];
            for(int i = now+1 ; i <= now + nums[now];i++){
                if(nums[i] -max >= maxid-i){
                    max  =  nums[i];
                    maxid = i;
                }
            }
            now = maxid;
            ret++;
        }
        return ret;

    }
}
