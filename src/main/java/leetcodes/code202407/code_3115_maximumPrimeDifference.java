package leetcodes.code202407;

import java.util.Scanner;

import static utils.arrayUtils.getIntArray;

/*
*
给你一个整数数组 nums。

返回两个（不一定不同的）质数在 nums 中 下标 的 最大距离。
*
* */


public class code_3115_maximumPrimeDifference {
    public static void main(String[] args) {
        code_3115_maximumPrimeDifference body = new code_3115_maximumPrimeDifference();
        Scanner sc = new Scanner(System.in);

        // 4 2 9 5 3

        int[] nums = getIntArray(sc, " ");

        System.out.println(body.maximumPrimeDifference(nums));
    }

    public int maximumPrimeDifference(int[] nums) {
        int n = nums.length;
        int leftIndex = -1, rightIndex = -1;
        boolean leftFlag = true, rightFlag = true;

        int l = 0, r = n - 1;

        while (l <= r && (leftFlag || rightFlag)) {
            if (leftFlag) {
                if (isPrime(nums[l])) {
                    leftFlag = false;
                    leftIndex = l;
                    continue;
                }
                l++;
            }
            if (rightFlag) {
                if (isPrime(nums[r])) {
                    rightFlag = false;
                    rightIndex = r;
                    continue;
                }
                r--;
            }
        }
        return rightIndex - leftIndex;
    }

    private boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        int k = (int) Math.sqrt(num);
        for (int i = 2; i <= k; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

