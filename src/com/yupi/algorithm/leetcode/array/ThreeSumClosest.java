package com.yupi.algorithm.leetcode.array;

import java.util.Arrays;

/**
 * 功能描述：最接近的三数之和
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int val = target - nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum < val) {
                    left++;
                } else if (sum > val) {
                    right--;
                } else {
                    return target;
                }
                int temp = Math.abs(sum - val);
                if (temp < min) {
                    min = temp;
                    res = sum + nums[i];
                }
            }
        }
        return res;
    }
}