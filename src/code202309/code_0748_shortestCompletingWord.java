package code202309;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
*
给你一个字符串 licensePlate 和一个字符串数组 words ，请你找出 words 中的 最短补全词 。

补全词 是一个包含 licensePlate 中所有字母的单词。忽略 licensePlate 中的 数字和空格 。
* 不区分大小写。如果某个字母在 licensePlate 中出现不止一次，那么该字母在补全词中的出现次数应当一致或者更多。

例如：licensePlate = "aBc 12c"，那么它的补全词应当包含字母 'a'、'b'
* （忽略大写）和两个 'c' 。可能的 补全词 有 "abccdef"、"caaacab" 以及 "cbca" 。

请返回 words 中的 最短补全词 。题目数据保证一定存在一个最短补全词。当有多个单词都符合最短补全词的匹配条件时取 words 中 第一个 出现的那个。
* */


public class code_0748_shortestCompletingWord {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String licensePlate = sc.nextLine();

    String wordsString = sc.nextLine();
    String[] words = wordsString.split(",");

    //
    //1s3 PSt
    //
    // step,steps,stripe,stepple

    long startTime = new Date().getTime();
    String result = shortestCompletingWord(licensePlate, words);
    long endTime = new Date().getTime();
    System.out.println("本程序运行 " + (endTime - startTime) + " 毫秒完成。");
    System.out.println(result);

  }


  public static String shortestCompletingWord(String licensePlate, String[] words) {
    char[] chars = licensePlate.toLowerCase().toCharArray();
    HashMap<Character, Integer> map = new HashMap<>();
    for (char ch : chars) {
      if (ch >= 'a' && ch <= 'z') {
        int cur = map.getOrDefault(ch, 0);
        map.put(ch, cur + 1);
      }
    }
    String min = "";

    for (String word : words) {
      char[] wordChars = word.toLowerCase().toCharArray();
      HashMap<Character, Integer> wordMap = new HashMap<>();
      for (char ch : wordChars) {
        if (ch >= 'a' && ch <= 'z') {
          int cur = wordMap.getOrDefault(ch, 0);
          wordMap.put(ch, cur + 1);
        }
      }
      boolean flag = true;
      for (Character ch : map.keySet()) {
        if (wordMap.getOrDefault(ch, 0) < map.getOrDefault(ch, 0)) {
          flag = false;
          continue;
        }
      }
      if (!flag) continue;
      if (word.length() < min.length() || min.length() == 0) {
        min = word;
      }
    }

    return min;
  }
}
