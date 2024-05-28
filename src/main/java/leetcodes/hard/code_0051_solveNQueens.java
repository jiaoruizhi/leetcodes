package leetcodes.hard;

import java.util.*;

public class code_0051_solveNQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int get = sc.nextInt();
        List<List<String>> result = solveNQueens(get);
        for ( List out: result) {
            for ( Object in:out  ) {
                System.out.println(in.toString());
            }
        }
    }





    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ret = new ArrayList<List<String>>();
        return  ret;
    }
}
