package com.yupi.algorithm.leetcode.search.binary_search;

/**
 * 功能描述：在旋转排序数组中查找Ⅱ
 * <p>
 * 思路：二分查找，先判断middle和left是否在同一区间，再判断target和left的关系
 */

public class SearchInRotateII {

    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                return true;
            }
            if (nums[middle] > nums[left]) {
                if (target < nums[middle] && target >= nums[left]) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else if (nums[middle] < nums[left]){
                if (target > nums[middle] && target < nums[left]) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            } else {
                left++;
            }
        }
        return false;
    }
}