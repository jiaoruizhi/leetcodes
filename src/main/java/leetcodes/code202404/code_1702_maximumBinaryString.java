package leetcodes.code202404;

import java.util.Scanner;

/*
*
给你一个二进制字符串 binary ，它仅有 0 或者 1 组成。你可以使用下面的操作任意次对它进行修改：

    操作 1 ：如果二进制串包含子字符串 "00" ，你可以用 "10" 将其替换。
        比方说， "00010" -> "10010"
    操作 2 ：如果二进制串包含子字符串 "10" ，你可以用 "01" 将其替换。
        比方说， "00010" -> "00001"

请你返回执行上述操作任意次以后能得到的 最大二进制字符串 。如果二进制字符串 x 对应的十进制数字大于二进制字符串 y 对应的十进制数字，那么我们称二进制字符串 x 大于二进制字符串 y 。

* */
public class code_1702_maximumBinaryString {
  public static void main(String[] args) {
    code_1702_maximumBinaryString body = new code_1702_maximumBinaryString();
    Scanner sc = new Scanner(System.in);

    String s = sc.nextLine();
    System.out.println(body.maximumBinaryString(s));
  }

  public String maximumBinaryString(String binary) {
    int n = binary.length();
    char[] s = binary.toCharArray();
    int j = 0;
    for (int i = 0; i < n; i++) {
      if (s[i] == '0') {
        while (j <= i || (j < n && s[j] == '1')) {
          j++;
        }
        if (j < n) {
          s[j] = '1';
          s[i] = '1';
          s[i + 1] = '0';
        }
      }
      System.out.println(new String(s));
    }
    return new String(s);
  }

}

