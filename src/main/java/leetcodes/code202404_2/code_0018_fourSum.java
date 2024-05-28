package leetcodes.code202404_2;

import static utils.arrayUtils.getIntArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
*
给你一个由 n 个整数组成的数组 nums ，和一个目标值 target 。
* 请你找出并返回满足下述全部条件且不重复的四元组 [nums[a], nums[b], nums[c], nums[d]]
* （若两个四元组元素一一对应，则认为两个四元组重复）：

    0 <= a, b, c, d < n
    a、b、c 和 d 互不相同
    nums[a] + nums[b] + nums[c] + nums[d] == target

你可以按 任意顺序 返回答案 。
*
*
* */
public class code_0018_fourSum {
  public static void main(String[] args) {
    code_0018_fourSum body = new code_0018_fourSum();
    Scanner sc = new Scanner(System.in);

    // 1 0 -1 0 -2 2
    int[] customers = getIntArray(sc, " ");
    // 0
    int k = sc.nextInt();

    // 2 2 2 2 2
    // 8

    // 1000000000 1000000000 1000000000 1000000000
    // -294967296
    System.out.println(body.fourSum(customers, k).toString());
  }

  ArrayList<Integer> path = new ArrayList<Integer>();
  List<List<Integer>> res = new ArrayList<List<Integer>>();
  int[] data;

  public List<List<Integer>> fourSum(int[] nums, int target) {
    data = nums;
    Arrays.sort(data);
    // 从 1 开始是题目的设定
    dfs(4, 0, 0, target);
    return res;
  }

  private void dfs(int k, int begin, long sum, int target) {
    //    System.out.println(path.toString());
    // 递归终止条件是：path 的长度等于 k

    if (path.size() + data.length - begin < k) {
      return;
    }

    if (path.size() == k) {
      if (sum == target) {
        res.add(new ArrayList<>(path));
      }
      return;
    }

    // 遍历可能的搜索起点
    for (int i = begin; i < data.length; i++) {
      int value = data[i];
      int last = i > begin ? data[i - 1] : 0;
      boolean haveLast = i > begin;
      if (haveLast && value == last) {
        continue;
      }
      // 向路径变量里添加一个数
      path.add(value);
      // 下一轮搜索，设置的搜索起点要加 1，因为组合数理不允许出现重复的元素
      dfs(4, i + 1, sum + value, target);
      // 重点理解这里：深度优先遍历有回头的过程，因此递归之前做了什么，递归之后需要做相同操作的逆向操作
      path.remove(path.size() - 1);
    }
  }


  public List<List<Integer>> fourSum_1(int[] nums, int target) {
    List<List<Integer>> quadruplets = new ArrayList<List<Integer>>();
    if (nums == null || nums.length < 4) {
      return quadruplets;
    }
    Arrays.sort(nums);
    int length = nums.length;
    for (int i = 0; i < length - 3; i++) {
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
        break;
      }
      if ((long) nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target) {
        continue;
      }
      for (int j = i + 1; j < length - 2; j++) {
        if (j > i + 1 && nums[j] == nums[j - 1]) {
          continue;
        }
        if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
          break;
        }
        if ((long) nums[i] + nums[j] + nums[length - 2] + nums[length - 1] < target) {
          continue;
        }
        int left = j + 1, right = length - 1;
        while (left < right) {
          long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
          if (sum == target) {
            quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
            while (left < right && nums[left] == nums[left + 1]) {
              left++;
            }
            left++;
            while (left < right && nums[right] == nums[right - 1]) {
              right--;
            }
            right--;
          } else if (sum < target) {
            left++;
          } else {
            right--;
          }
        }
      }
    }
    return quadruplets;
  }

}

