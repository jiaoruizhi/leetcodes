package leetcodes.code202005;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

/*
* 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

3 6
3 2 4
* */
public class code_0001_twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int aim = sc.nextInt();
        int [] get = new int[num];
        for(int i=0;i<num;i++){
            get[i] = sc.nextInt();
        }

        long starttime = new Date().getTime();

        int [] ret = twoSum(get,aim);
        System.out.println(ret[0]+" "+ret[1]);

        long endtime = new Date().getTime();
        System.out.println("本程序运行 " + (endtime - starttime) + " 毫秒完成。" );

    }

    private static  int[] twoSum(int[] nums, int target) {
        int [] ret = new int [2];
        HashMap<Integer,Integer> hash = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(target-nums[i])){
                ret[0]=hash.get(target-nums[i]);
                ret[1]=i;
                break;
            }
            hash.put(nums[i],i);
        }
        return ret;
    }


}
