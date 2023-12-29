package code202005;

import java.util.*;

public class code_0560_subarraySum {
    public static void main(String[] args) {

        int [] get = build();
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int number = subarraySum(get,target);
        System.out.println(number);
    }

    private static int[] build() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.substring(1,str.length()-1);
        String [] ss = str.split(",");
        int [] ret = new int[ss.length];
        for (int i = 0; i < ss.length; i++) {
            ret[i] = Integer.valueOf(ss[i]);
        }
        return ret;
    }


    public static  int subarraySum(int[] nums, int k) {
            int count = 0, pre = 0;
            HashMap< Integer, Integer > mp = new HashMap < > ();
            mp.put(0, 1);
            for (int i = 0; i < nums.length; i++) {
                pre += nums[i];
                if (mp.containsKey(pre - k))
                    count += mp.get(pre - k);
                mp.put(pre, mp.getOrDefault(pre, 0) + 1);
            }
            return count;
    }


}
