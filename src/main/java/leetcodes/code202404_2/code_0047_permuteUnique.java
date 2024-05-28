package leetcodes.code202404_2;

import static utils.arrayUtils.getIntArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//
// 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。



class code_0047_permuteUnique {
  public static void main(String[] args) {
    code_0047_permuteUnique body = new code_0047_permuteUnique();
    Scanner sc = new Scanner(System.in);

    // 1 1 2 2 3
    // 8 2 0 10 3 18 6 11 11 14 13 1 15 1 5 5 17 4
    int[] nums = getIntArray(sc, null);

    List<List<Integer>> result = body.permuteUnique(nums);
    for (List<Integer> r : result) {
      System.out.println(r);
    }
  }

  List<List<Integer>> result = new ArrayList<List<Integer>>();
  List<String> pre = new ArrayList<>();
  public List<List<Integer>> permuteUnique(int[] nums) {
    Arrays.sort(nums);

    backtrack(nums, new ArrayList<>(), new int[nums.length]);
    return result;
  }

  public void backtrack( //
    int[] nums, //
    List<Integer> output, //
    int[] used
  ) {
    int n = nums.length;
    // 所有数都填完了
    if (output.size() == n) {
      result.add(new ArrayList<>(output));
    }
    for (int i = 0; i < n; i++) {
      if (used[i] == 1) {
        continue;
      }
      output.add(nums[i]);
      used[i] = 1;
      if (!pre.contains(output.toString())) {
        pre.add(output.toString());
        backtrack(nums, output, used);
      }
      output.remove(output.size() - 1);
      used[i] = 0;
    }
  }
}
