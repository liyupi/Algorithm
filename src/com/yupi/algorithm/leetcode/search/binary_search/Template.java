package com.yupi.algorithm.leetcode.search.binary_search;

/**
 * 功能描述：二分查找模板
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class Template {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (target > nums[middle]) {
                left = middle + 1;
            } else if (target < nums[middle]) {
                right = middle - 1;
            } else {
                return middle;
            }
        }
        return -1;
    }


}