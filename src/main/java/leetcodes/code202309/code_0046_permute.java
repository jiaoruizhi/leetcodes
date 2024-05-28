package leetcodes.code202309;

import static utils.arrayUtils.getIntArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。



class code_0046_permute {
  public static void main(String[] args) {
    code_0046_permute body = new code_0046_permute();
    Scanner sc = new Scanner(System.in);


    // 20
    // 8 2 0 10 3 18 6 11 11 14 13 1 15 1 5 5 17 4
    int[] nums = getIntArray(sc, null);

    System.out.println(body.permute(nums));
  }


  public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> res = new ArrayList<List<Integer>>();

    List<Integer> output = new ArrayList<Integer>();
    for (int num : nums) {
      output.add(num);
    }

    int n = nums.length;
    backtrack(n, output, res, 0);
    return res;
  }

  public void backtrack( //
    int n, //
    List<Integer> output, //
    List<List<Integer>> res, //
    int first //
  ) {
    // 所有数都填完了
    if (first == n) {
      res.add(new ArrayList<Integer>(output));
    }
    for (int i = first; i < n; i++) {
      // 动态维护数组
      Collections.swap(output, first, i);
      // 继续递归填下一个数
      backtrack(n, output, res, first + 1);
      // 撤销操作
      Collections.swap(output, first, i);
    }
  }
}
