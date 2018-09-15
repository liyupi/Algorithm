package com.yupi.algorithm.leetcode.array;

/**
 * 功能描述：合并两个有序数组
 *
 * @author Yupi Li
 * @date 2018/08/29 09:37
 */

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count = m + n - 1;
        m--;
        n--;
        while (m != -1 && n != -1) {
            nums1[count--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }
        while (n != -1) {
            nums1[count--] = nums2[n--];
        }
    }
}