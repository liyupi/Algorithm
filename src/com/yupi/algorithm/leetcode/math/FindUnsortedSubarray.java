package com.yupi.algorithm.leetcode.math;

/**
 * 功能描述：最长无序连续子数组
 *
 * 思路：不要老想着dp，当数组有序时最左一定最小，最右一定最大，否则就要替换
 * 从左到右遍历是否满足最大值在右，从右到左遍历是否满足最小值在左，记录最小最大值
 * left与right的初值很巧妙，如果未被更新（数组默认有序）则为负数，且right-left+1==0
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class FindUnsortedSubarray {

    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        if(n <= 1) {
            return 0;
        }
        int min = nums[n - 1];
        int max = nums[0];
        int left = -1;
        int right = -2;
        for (int i = 0; i < n; i++) {
            max = Math.max(nums[i],max);
            min = Math.min(nums[n - i - 1],min);
            if (nums[i] < max) {
                right = i;
            }
            if (nums[n - i - 1] > min) {
                left = n - i - 1;
            }
        }
        return right - left + 1;
    }

}