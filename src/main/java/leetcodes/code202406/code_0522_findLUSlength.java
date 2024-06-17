package leetcodes.code202406;

import static utils.arrayUtils.getStringArray;

import java.util.Scanner;

/*
*
给定字符串列表 strs ，返回其中 最长的特殊序列 的长度。如果最长特殊序列不存在，返回 -1 。

特殊序列 定义如下：该序列为某字符串 独有的子序列（即不能是其他字符串的子序列）。

 s 的 子序列可以通过删去字符串 s 中的某些字符实现。

    例如，"abc" 是 "aebdc" 的子序列，因为您可以删除"aebdc"中的下划线字符来得到 "abc" 。
    * "aebdc"的子序列还包括"aebdc"、 "aeb" 和 "" (空字符串)。

*
*
*
* */


public class code_0522_findLUSlength {
  public static void main(String[] args) {
    code_0522_findLUSlength body = new code_0522_findLUSlength();
    Scanner sc = new Scanner(System.in);

    // aba cdc eae
    String[] strs = getStringArray(sc, " ");

    System.out.println(body.findLUSlength(strs));
  }

  public int findLUSlength(String[] strs) {
    int n = strs.length, res = -1;
    for(int i = 0; i < n; i++){
      boolean check = true;
      for(int j = 0; j < n; j++){
        if(i != j && isSubseq(strs[i], strs[j])) {
          check = false;
          break;
        }
      }
      if(check) res = Math.max(res, strs[i].length());
    }
    return res;
  }

  private boolean isSubseq(String a, String b){
    int ptA = 0, ptB = 0;
    while(ptA < a.length()){
      while(ptB < b.length() && b.charAt(ptB) != a.charAt(ptA)){
        ptB++;
      }
      if(ptB == b.length()){
        return false;
      }
      ptA++;
      ptB++;
    }
    return true;
  }
}

