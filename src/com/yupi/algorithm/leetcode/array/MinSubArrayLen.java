package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：寻找其和大于等于s的长度最小连续子数组
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class MinSubArrayLen {

    public static void main(String[] args) {
        System.out.println(new MinSubArrayLen().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }

    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int sum = nums[left];
        int min = nums.length + 1;
        while (true) {
            if (sum < s) {
                right++;
                if (right == nums.length) {
                    break;
                }
                sum += nums[right];
            } else {
                int res = right - left + 1;
                min = res < min ? res : min;
                sum -= nums[left];
                left++;
            }
        }
        return min == nums.length + 1 ? 0 : min;
    }

}