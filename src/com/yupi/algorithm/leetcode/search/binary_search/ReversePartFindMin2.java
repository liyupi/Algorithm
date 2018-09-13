package com.yupi.algorithm.leetcode.search.binary_search;

/**
 * 功能描述：寻找旋转排序数组的最小值（带重复元素）
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class ReversePartFindMin2 {

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int middle = left + (right - left) / 2;
            if (nums[right] < nums[middle]) {
                left = middle + 1;
            } else if (nums[left] > nums[middle]) {
                right = middle;
            } else {
                right--;
            }
        }
        return nums[left];
    }

}