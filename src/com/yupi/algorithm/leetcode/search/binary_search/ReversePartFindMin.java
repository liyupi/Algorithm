package com.yupi.algorithm.leetcode.search.binary_search;

/**
 * 功能描述：升序数列翻转找反转点
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */
public class ReversePartFindMin {

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right && nums[left] > nums[right]) {
            int middle = left + (right - left) / 2;
            if(nums[left] <= nums[middle]){
                left = middle + 1;
            } else {
                right = middle;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        System.out.println(new ReversePartFindMin().findMin(new int[]{1,2,3,4}));
    }
}