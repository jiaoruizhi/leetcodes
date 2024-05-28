package leetcodes.code202305;


import java.util.Arrays;
import java.util.Scanner;

/*
*
定义一个函数 f(s)，统计 s  中（按字典序比较）最小字母的出现频次 ，其中 s 是一个非空字符串。

例如，若 s = "dcce"，那么 f(s) = 2，因为字典序最小字母是 "c"，它出现了 2 次。

现在，给你两个字符串数组待查表 queries 和词汇表 words。

对于每次查询 queries[i] ，需统计 words 中满足 f(queries[i]) < f(W) 的 词的数目 ，W 表示词汇表 words 中的每个词。

请你返回一个整数数组 answer 作为答案，其中每个 answer[i] 是第 i 次查询的结果。



示例 1：

输入：queries = ["cbd"], words = ["zaaaz"]
输出：[1]
解释：查询 f("cbd") = 1，而 f("zaaaz") = 3 所以 f("cbd") < f("zaaaz")。

示例 2：

输入：queries = ["bbb","cc"], words = ["a","aa","aaa","aaaa"]
输出：[1,2]
解释：第一个查询 f("bbb") < f("aaaa")，第二个查询 f("aaa") 和 f("aaaa") 都 > f("cc")。


*
*
* */
public class code_1170_numSmallerByFrequency {
  public static void main(String[] args) {
    // bbb,cc
    // a,aa,aaa,aaaa

    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();

    String[] queries = str1.split(",");
    String[] words = str2.split(",");

    int[] result = numSmallerByFrequency(queries, words);
    System.out.println(Arrays.toString(result));
  }


  public static int[] numSmallerByFrequency(String[] queries, String[] words) {
    int querySize = queries.length;
    int wordSize = words.length;

    int[] queryValue = new int[querySize];
    int[] wordsValue = new int[wordSize];

    int[] result = new int[querySize];

    for (int i = 0; i < wordSize; i++) {
      wordsValue[i] = calc(words[i]);
    }
    for (int i = 0; i < querySize; i++) {
      queryValue[i] = calc(queries[i]);
    }

    for (int i = 0; i < querySize; i++) {
      int cur = queryValue[i];

      int number = 0;
      for (int wv : wordsValue) {
        number = wv > cur ? number + 1 : number;
      }
      result[i] = number;
    }

    return result;
  }

  public static int calc(String s) {
    char[] chars = s.toCharArray();
    int result = 0;
    char small = Character.MAX_VALUE;
    for (char ch : chars) {
      if (ch < small) {
        small = ch;
        result = 1;
      } else if (ch == small) {
        result++;
      }
    }
    return result;
  }
}
