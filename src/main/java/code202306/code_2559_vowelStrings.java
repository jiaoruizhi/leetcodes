package code202306;


import static utils.arrayUtils.getIntDoubleArray;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
*
给你一个下标从 0 开始的字符串数组 words 以及一个二维整数数组 queries 。

每个查询 queries[i] = [li, ri] 会要求我们统计在 words 中下标在 li 到 ri 范围内（包含 这两个值）并且以元音开头和结尾的字符串的数目。

返回一个整数数组，其中数组的第 i 个元素对应第 i 个查询的答案。

注意：元音字母是 'a'、'e'、'i'、'o' 和 'u' 。

*
* */
public class code_2559_vowelStrings {
  public static void main(String[] args) {

    // aba bcb ece aa e

    // 3 2 0 2 1 4 1 1

    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();

    String[] words = str1.split(" ");

    int[][] queries = getIntDoubleArray();

    int[] result = vowelStrings(words, queries);
    System.out.println(Arrays.toString(result));
  }


  public static int[] vowelStrings(String[] words, int[][] queries) {
    int[] result = new int[queries.length];

    List<Character> cs = Arrays.asList('a', 'e', 'i', 'o', 'u');

    for (int i = 0; i < queries.length; i++) {
      int sum = 0;
      int[] query = queries[i];
      for (String str : words) {
        String sub = query[1] < str.length()
          ? str.substring(query[0], query[1] + 1)
          : str.substring(query[0]);
        System.out.println(sub);
        if (!"".equals(sub) && cs.contains(sub.charAt(0)) && cs.contains(sub.charAt(sub.length() - 1))) {
          sum++;
        }
      }

      result[i] = sum;
    }

    return result;
  }

}
