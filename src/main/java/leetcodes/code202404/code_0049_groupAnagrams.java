package leetcodes.code202404;

import static utils.arrayUtils.getStringArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/*
*
给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。

字母异位词 是由重新排列源单词的所有字母得到的一个新单词。



示例 1:

输入: strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
输出: [["bat"],["nat","tan"],["ate","eat","tea"]]

示例 2:

输入: strs = [""]
输出: [[""]]

示例 3:

输入: strs = ["a"]
输出: [["a"]]

* */
public class code_0049_groupAnagrams {
  public static void main(String[] args) {
    code_0049_groupAnagrams body = new code_0049_groupAnagrams();
    Scanner sc = new Scanner(System.in);


    // eat,tea,tan,ate,nat,bat
    String[] words = getStringArray(sc, ",");


    System.out.println(body.groupAnagrams(words));
  }

  public List<List<String>> groupAnagrams(String[] words) {
    Map<String, List<String>> map = new HashMap<String, List<String>>();

    for (String word : words) {
      String key = getStringKey(word);
      List<String> cur = map.getOrDefault(key, new ArrayList<>());
      cur.add(word);
      map.put(key, cur);
    }
    List<List<String>> result = new ArrayList<>();
    for (List<String> mapValue : map.values()) {
      result.add(mapValue);
    }
    return result;
  }

  public String getStringKey(String word) {
    char[] chars = word.toCharArray();
    Arrays.sort(chars);
    return String.valueOf(chars);
  }
}

