package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：错误的集合
 *
 * 思路：区别于《剑指offer》找重复数的问题，还要找到丢失的整数，可以先使用置换位置法找到重复数，
 * 再利用1-n集合的和找到缺失的数，空间复杂度o(1)，或者使用map记录，空间复杂度o（n），时间复杂度都是o(n)
 */

public class FindErrorNums {

    public int[] findErrorNums(int[] nums) {
        long sum = nums.length * (nums.length + 1) / 2;
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            while (res[0] == 0 && nums[i] != i + 1) {
                int temp = nums[nums[i] - 1];
                if (temp == nums[i]) {
                    res[0] = temp;
                    break;
                }
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
            sum -= nums[i];
        }
        res[1] = (int) (sum + res[0]);
        return res;
    }

}