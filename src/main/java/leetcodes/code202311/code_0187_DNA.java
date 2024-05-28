package leetcodes.code202311;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
*
DNA序列 由一系列核苷酸组成，缩写为 'A', 'C', 'G' 和 'T'.。

    例如，"ACGAATTCCG" 是一个 DNA序列 。

在研究 DNA 时，识别 DNA 中的重复序列非常有用。

给定一个表示 DNA序列 的字符串 s ，返回所有在 DNA 分子中出现不止一次的 长度为 10 的序列(子字符串)。你可以按 任意顺序 返回答案。

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/repeated-dna-sequences
* */


public class code_0187_DNA {
  public static void main(String[] args) {
    code_0187_DNA body = new code_0187_DNA();

    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    List<String> result = body.findRepeatedDnaSequences(s);
    System.out.println(result);
  }


    public List<String> findRepeatedDnaSequences(String s) {
      int len = s.length();
      HashSet<String> set = new HashSet<>();
      HashSet<String> ansSet = new HashSet<>();
      for (int i = 0; i < len - 9; i++) {
        String str = s.substring(i, i + 10);
        if(!set.contains(str))
          set.add(str);
        else
          ansSet.add(str);
      }
      return new ArrayList<>(ansSet);
    }
}
