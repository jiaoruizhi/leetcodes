package code202401;

import java.util.Scanner;
import java.util.Stack;

/*
*

给你一个仅由 大写 英文字符组成的字符串 s 。

你可以对此字符串执行一些操作，在每一步操作中，你可以从 s 中删除 任一个 "AB" 或 "CD" 子字符串。

通过执行操作，删除所有 "AB" 和 "CD" 子串，返回可获得的最终字符串的 最小 可能长度。

注意，删除子串后，重新连接出的字符串可能会产生新的 "AB" 或 "CD" 子串。

* */
public class code_2696_minLength {
  public static void main(String[] args) {
    code_2696_minLength body = new code_2696_minLength();
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    System.out.println(body.minLength(s));
  }

  // O(n) = log(k)
  public int minLength(String s) {
    Stack<Character> stack = new Stack<>();
    stack.push('-');
    int index = 0;
    char head1 = 'A';
    char head2 = 'C';
    char tail1 = 'B';
    char tail2 = 'D';

    while (index < s.length()) {
      char charItem = s.charAt(index++);
      char peek = stack.peek();
      if ((peek == head1 && charItem == tail1) || (peek == head2 && charItem == tail2)) {
        stack.pop();
        continue;
      }
      stack.push(charItem);
    }

    return stack.size() - 1;
  }

}

