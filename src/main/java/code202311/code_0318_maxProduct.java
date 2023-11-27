package code202311;


import static utils.utils.getStringArray;

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
public class code_0318_maxProduct {
  public static void main(String[] args) {
    code_0318_maxProduct body = new code_0318_maxProduct();
    Scanner sc = new Scanner(System.in);

    // abcw,baz,foo,bar,xtfn,abcdef
    String[] words = getStringArray(sc, ",");

    System.out.println(body.maxProduct(words));
  }

  public int maxProduct(String[] words) {
    int length = words.length;
    int[] masks = new int[length];
    for (int i = 0; i < length; i++) {
      String word = words[i];
      int wordLength = word.length();
      for (int j = 0; j < wordLength; j++) {
        masks[i] |= 1 << (word.charAt(j) - 'a');
      }
    }
    int maxProd = 0;
    for (int i = 0; i < length; i++) {
      for (int j = i + 1; j < length; j++) {
        if ((masks[i] & masks[j]) == 0) {
          maxProd = Math.max(maxProd, words[i].length() * words[j].length());
        }
      }
    }
    return maxProd;
  }

}

