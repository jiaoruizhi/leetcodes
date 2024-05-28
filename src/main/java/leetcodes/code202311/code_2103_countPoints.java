package leetcodes.code202311;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
*

给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。

子数组 是数组中的一个连续部分。
*
*
* */
public class code_2103_countPoints {
  public static void main(String[] args) {
    code_2103_countPoints body = new code_2103_countPoints();
    Scanner sc = new Scanner(System.in);

    // B0B6G0R6R0R6G9
    String rings = sc.nextLine();

    System.out.println(body.countPoints(rings));
  }

  public int countPoints(String rings) {
    HashMap<Character, HashSet<Character>> map = new HashMap<Character, HashSet<Character>>();

    char[] chars = rings.toCharArray();
    int n = chars.length >> 1;

    for (int i = 0; i < n; i++) {
      char color = chars[2 * i];
      char num = chars[2 * i + 1];

      HashSet<Character> now = map.getOrDefault(num, new HashSet<>());
      now.add(color);
      map.put(num, now);
    }

    int result = (int)map.values().stream().filter(i -> i.size() == 3).count();

    int res= 0;
    for(HashSet ring: map.values()){
      if(ring.size() == 3){
        res++;
      }
    }
    return result;
  }

}

