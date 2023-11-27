package Huawei;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StringSimple {
  public static void main(String[] args) {

    List<Character> a = new ArrayList<>(List.of(new Character[] {'a', 'C', 'b'}));
    a = a.stream().map(Character::toLowerCase).sorted().collect(Collectors.toList());
    System.out.println(a);
    Arrays.sort(a.toArray());
    System.out.println(a.contains(Character.toLowerCase('C')));

    Character first = a.get(0);
    System.out.println(first);

    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();

    System.out.println(getResult(n));
  }

  public static String getResult(String n) {

    char[] charList = n.toCharArray();
    List<char[]> simpleList = new ArrayList<>();
    StringBuffer sb = new StringBuffer();
    StringBuffer others = new StringBuffer();

    String flag = "";
    for (char ch : charList) {
      Boolean isLetter = Character.isLetter(ch);
      switch (ch) {
        case '(':
          flag = "start";
          break;
        case ')':
          char[] cl = sb.toString().toCharArray();
          simpleList.add(cl);
          flag = "";
          break;
        default:
          if (!isLetter) break;
          if ("start".equals(flag)) {
            sb.append(ch);
          } else {
            others.append(ch);
          }
      }
    }

    return "";
  }

  public static List<List<Character>> handleSame(List<char[]> list) {
    List<List<Character>> result = new ArrayList<>();

    for (char[] l : list) {
      result.stream().filter(reL -> reL.contains(l)).findFirst().get();
    }

    return result;

  }
}
