package leetcodes.code202404;

import static utils.arrayUtils.getIntArray;

import java.util.HashSet;

/*
*

给你一个按 非递减顺序 排列的数组 nums ，返回正整数数目和负整数数目中的最大值。

    换句话讲，如果 nums 中正整数的数目是 pos ，而负整数的数目是 neg ，返回 pos 和 neg二者中的最大值。

注意：0 既不是正整数也不是负整数。
*
*

* */
public class code_0217_containsDuplicate {
  public static void main(String[] args) {
    code_0217_containsDuplicate body = new code_0217_containsDuplicate();

    // -2 -1 -1 1 2 3
    int[] nums = getIntArray(null, null);

    System.out.println(body.containsDuplicate(nums));
  }

  public boolean containsDuplicate(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int i : nums) {
      if (!set.add(i)) {
        return true;
      }
    }
    return false;
  }

}

