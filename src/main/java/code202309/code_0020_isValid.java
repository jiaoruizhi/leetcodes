package code202309;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/*
*
丑数 就是只包含质因数 2、3 和 5 的正整数。

给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。

* */
public class code_0020_isValid {
  public static void main(String[] args) {
    code_0020_isValid body = new code_0020_isValid();


    Scanner sc = new Scanner(System.in);
    // ()[]{}
    String s = sc.nextLine();

    System.out.println(body.isValid(s));
  }


  private static final Map<Character,Character> map = new HashMap<Character,Character>(){{
    put('{','}'); put('[',']'); put('(',')'); put('?','?');
  }};


  public boolean isValid(String s) {
    char[] chars = s.toCharArray();
    Stack<Character> stack = new Stack<>();
    Map<Character,Character> map = new HashMap<Character,Character>(){{
      put('{','}'); put('[',']'); put('(',')');
    }};

    for (char cur : chars) {
      if (map.containsKey(cur)) {
        stack.push(cur);
      }
      if (map.containsValue(cur)) {
        if (stack.size() == 0) return false;
        char leftChar = stack.pop();
        if (!map.get(leftChar).equals(cur))
          return false;
      }
    }
    return stack.size() == 0;
  }
}

