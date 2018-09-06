package com.yupi.algorithm.leetcode.search.binary_search;

/**
 * 功能描述：改变一定顺序的二分查找
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class ReversePart {

    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }
        return binary_search(0, nums.length - 1, nums, target);
    }

    private int binary_search(int left, int right, int[] nums, int target) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[left] <= nums[middle]) {
                if (nums[left] <= target && nums[middle] >= target) {
                    right = middle - 1;
                } else {
                   left = middle + 1;
                }
            } else {
                if (nums[middle] <= target && nums[right] >= target) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }
        return -1;
    }

}