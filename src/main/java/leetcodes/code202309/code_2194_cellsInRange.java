package leetcodes.code202309;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
*
Excel 表中的一个单元格 (r, c) 会以字符串 "<col><row>" 的形式进行表示，其中：

    <col> 即单元格的列号 c 。用英文字母表中的 字母 标识。
        例如，第 1 列用 'A' 表示，第 2 列用 'B' 表示，第 3 列用 'C' 表示，以此类推。
    <row> 即单元格的行号 r 。第 r 行就用 整数 r 标识。

给你一个格式为 "<col1><row1>:<col2><row2>" 的字符串 s ，
* 其中 <col1> 表示 c1 列，<row1> 表示 r1 行，<col2> 表示 c2 列，<row2> 表示 r2 行，并满足 r1 <= r2 且 c1 <= c2 。

找出所有满足 r1 <= x <= r2 且 c1 <= y <= c2 的单元格，并以列表形式返回。
* 单元格应该按前面描述的格式用 字符串 表示，并以 非递减 顺序排列（先按列排，再按行排）。
*
*
* */
public class code_2194_cellsInRange {
  public static void main(String[] args) {
    code_2194_cellsInRange body = new code_2194_cellsInRange();
    Scanner sc = new Scanner(System.in);

    // A1:F3
    String s = sc.nextLine();


    List<String> result = body.cellsInRange(s);
    System.out.println(result);
  }


  public List<String> cellsInRange(String s) {
    List<String> result = new ArrayList<>();
    String[] ss = s.split(":");
    char start = ss[0].charAt(0);
    char end = ss[1].charAt(0);
    char indexS = ss[0].charAt(1);
    char indexE = ss[1].charAt(1);

    StringBuilder sb = new StringBuilder();
    for (char ch = start; ch <= end; ch++) {
      for (char index = indexS; index <= indexE; index++) {
        sb.append(ch);
        sb.append(index);
        result.add(sb.toString());
        sb.delete(0, 2);
      }
    }
    return result;
  }
}
