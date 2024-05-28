package leetcodes.code202404_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
*
找出所有相加之和为 n 的 k 个数的组合，且满足下列条件：

    只使用数字1到9
    每个数字 最多使用一次

返回 所有可能的有效组合的列表 。该列表不能包含相同的组合两次，组合可以以任何顺序返回。
*
*
* */
public class code_0216_combinationSum3 {
  public static void main(String[] args) {
    code_0216_combinationSum3 body = new code_0216_combinationSum3();
    Scanner sc = new Scanner(System.in);

    // 7
    int k = sc.nextInt();
    int n = sc.nextInt();
    System.out.println(body.combinationSum3(k, n).toString());
  }

  List<Integer> temp = new ArrayList<Integer>();
  List<List<Integer>> ans = new ArrayList<List<Integer>>();

  public List<List<Integer>> combinationSum3(int k, int n) {
    for (int mask = 0; mask < (1 << 9); ++mask) {
      if (check(mask, k, n)) {
        ans.add(new ArrayList<Integer>(temp));
      }
    }
    return ans;
  }

  public boolean check(int mask, int k, int n) {
    temp.clear();
    for (int i = 0; i < 9; ++i) {
      if (((1 << i) & mask) != 0) {
        temp.add(i + 1);
      }
    }
    if (temp.size() != k) {
      return false;
    }
    int sum = 0;
    for (int num : temp) {
      sum += num;
    }
    return sum == n;
  }

  public List<List<Integer>> combinationSum3_1(int k, int n) {
    dfs(1, 9, k, n);
    return ans;
  }

  public void dfs(int cur, int n, int k, int sum) {
    if (temp.size() + (n - cur + 1) < k || temp.size() > k) {
      return;
    }
    if (temp.size() == k) {
      int tempSum = 0;
      for (int num : temp) {
        tempSum += num;
      }
      if (tempSum == sum) {
        ans.add(new ArrayList<Integer>(temp));
        return;
      }
    }
    temp.add(cur);
    dfs(cur + 1, n, k, sum);
    temp.remove(temp.size() - 1);
    dfs(cur + 1, n, k, sum);
  }

}

