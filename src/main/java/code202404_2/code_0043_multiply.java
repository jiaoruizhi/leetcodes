package code202404_2;


import java.util.Scanner;

/*
*
给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。

注意：不能使用任何内置的 BigInteger 库或直接将输入转换为整数。

1 <= num1.length, num2.length <= 200
*
* */
public class code_0043_multiply {
  public static void main(String[] args) {
    code_0043_multiply body = new code_0043_multiply();
    Scanner sc = new Scanner(System.in);

    // 1234
    // 56
    String num1 = sc.nextLine();
    String num2 = sc.nextLine();

    System.out.println(body.multiply(num1, num2));
  }

  public String multiply(String num1, String num2) {
    StringBuilder sb = new StringBuilder();
    int len1 = num1.length(), len2 = num2.length();
    char[] chars1 = num1.toCharArray(), chars2 = num2.toCharArray();
    int[][] data = new int[len2][len1 + 1];

    for (int i = 0; i < len2; i++) {
      int flag = 0;
      for (int j = 0; j < len1; j++) {
        int x = chars2[len2 - i - 1] - '0';
        int y = chars1[len1 - j - 1] - '0';
        int value = x * y + flag;
        flag = 0;
        while (value >= 10) {
          flag++;
          value -= 10;
        }
        data[i][j] = value;
      }
      data[i][len1] = flag;
    }

    int flag = 0;
    for (int i = 0; i < len1 + len2; i++) {
      int cache = flag;
      flag = 0;
      for (int j = 0; j < len2; j++) {
        int x = i - j;
        if (x < 0 || x > len1) {
          continue;
        }
        cache += data[j][x];
      }

      while (cache >= 10) {
        flag++;
        cache -= 10;
      }
      sb.append(cache);
    }
    if (flag > 0) {
      sb.append(flag);
    }

    sb.reverse();
    while (sb.charAt(0) == '0' && sb.length() > 1) {
      sb.delete(0, 1);
    }

    return sb.toString();
  }
}

