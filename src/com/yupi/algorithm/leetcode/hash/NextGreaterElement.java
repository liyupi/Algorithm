package com.yupi.algorithm.leetcode.hash;

/**
 * 功能描述：下一个最大元素
 *
 * 思路：用map来记录每个元素出现的位置，加速初始定位
 *
 * @author Yupi Li
 * @date 2018/10/11 09:37
 */

public class NextGreaterElement {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            boolean start = false;
            for (int j = 0; j < nums2.length; j++) {
                if (start && nums1[i] < nums2[j]) {
                    res[i] = nums2[j];
                    start = false;
                    break;
                }
                if (nums1[i] == nums2[j]) {
                    start = true;
                }
            }
            if (start) {
                res[i] = -1;
            }
        }
        return res;
    }

}