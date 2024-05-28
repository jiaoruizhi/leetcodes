package leetcodes.code202005;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

/*
*
* 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
*
* */
public class code_0003_lengthOfLongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String get = sc.nextLine();



        long starttime = new Date().getTime();
        int max =lengthOfLongestSubstring(get);
        System.out.println(max);
        long endtime = new Date().getTime();
        System.out.println("本程序运行 " + (endtime - starttime) + " 毫秒完成。" );
    }


    public static int lengthOfLongestSubstring(String s) {
        char[] get = s.toCharArray();
        if(get.length<=1)return get.length;

        int max =0;
        int left=0,right=-1;
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i = 0 ;i< get.length;i++){
            char ch = get[i];
            right = i;
            if (!map.containsKey(ch)) {
                max = Math.max(max , right - left +1);
            }
            else if(left<=map.get(ch)) {
                left = map.get(ch) + 1;
                max = Math.max(max, right - left+1);
                }else if(left>map.get(ch)){
                    max = Math.max(max , right - left +1);
            }
            System.out.println("    left    "+left + "  right  "+right + "      max     " + max);
            map.put(ch,i);
        }
        return max;
    }
}
