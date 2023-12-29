package code202005;

import java.util.*;

public class code_0013_romanToint {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String get = sc.nextLine();
    int out = romanToInt(get);
    System.out.println(out);
  }


  static HashMap<Character, Integer> map = new HashMap<Character, Integer>() {
    {
      put('I', 1);
      put('V', 5);
      put('X', 10);
      put('L', 50);
      put('C', 100);
      put('D', 500);
      put('M', 1000);
    }
  };

  public static int romanToInt(String s) {
    int ret = 0;
    char[] chs = s.toCharArray();
    int nowlarge = 0;
    for (int i = chs.length - 1; i >= 0; i--) {
      char now = chs[i];
      int current = map.get(now);
      if (current >= nowlarge) {
        ret += current;
        nowlarge = current;
      } else {
        ret -= current;
      }
    }
    return ret;
  }
}
