package wait;


import java.util.HashMap;
import java.util.Scanner;

/*
* 给你一个字符串 s ，请你返回满足以下条件的最长子字符串的长度：
* 每个元音字母，即 'a'，'e'，'i'，'o'，'u' ，在子字符串中都恰好出现了偶数次。
*
*
* */
public class code_1371_findTheLongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String get = sc.nextLine();
        int leng = findTheLongestSubstring(get);

    }

    private static  int findTheLongestSubstring(String s) {
        if(s==null || s.length()==0) return 0;



        return 0;

    }


}
