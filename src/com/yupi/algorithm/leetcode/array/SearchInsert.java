package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：寻找元素的插入位置
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        if (target > nums[left]) {
            return left + 1;
        } else {
            return left;
        }
    }
}