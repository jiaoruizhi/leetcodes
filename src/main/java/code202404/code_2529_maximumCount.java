package code202404;

import static utils.arrayUtils.getIntArray;

/*
*

给你一个按 非递减顺序 排列的数组 nums ，返回正整数数目和负整数数目中的最大值。

    换句话讲，如果 nums 中正整数的数目是 pos ，而负整数的数目是 neg ，返回 pos 和 neg二者中的最大值。

注意：0 既不是正整数也不是负整数。
*
*

* */
public class code_2529_maximumCount {
  public static void main(String[] args) {
    code_2529_maximumCount body = new code_2529_maximumCount();

    // -2 -1 -1 1 2 3
    int[] nums = getIntArray(null, null);

    System.out.println(body.maximumCount(nums));
  }

  // O(n) = log(k)
  public int maximumCount(int[] nums) {
    int left = 0;
    int right = 0;
    for (int i : nums) {
      if (i < 0)
        left++;
      if (i > 0)
        right++;
    }
    return Math.max(left, right);
  }

}

