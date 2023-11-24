package leet202005;

import java.util.*;

public class code_0014_longestCommonPrefix {
    public static void main(String[] args) {
        String [] get = arraybuild();
        System.out.println("输出完毕");
        String longest = longestCommonPrefix(get);
        System.out.println(longest);

    }

    private static String[] arraybuild() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String [] ret = new String[num];
        for (int i = 0; i < num; i++) {
            ret[i]=sc.next();
        }
        return ret;
    }


    public static String longestCommonPrefix(String[] strs) {
        String ret ;
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        ret = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while(strs[i].indexOf(ret)!=0){
                ret = ret.substring(0,ret.length()-1);
                if (ret.equals("")) {
                    return "";
                }
            }
        }
        return ret;

    }
}
